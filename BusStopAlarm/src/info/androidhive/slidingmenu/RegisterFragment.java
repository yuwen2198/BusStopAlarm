package info.androidhive.slidingmenu;

import org.json.JSONException;
import org.json.JSONObject;
import com.example.androidhive.library.DatabaseHandler;
import com.example.androidhive.library.UserFunctions;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterFragment extends Fragment {
	
	public RegisterFragment(){}
	
	Button btnRegister;
	Button btnLinkToLogin;
	EditText inputFullName;
	EditText inputEmail;
	EditText inputPassword;
	EditText inputTel;
	TextView registerErrorMsg;
	
	// JSON Response node names
	private static String KEY_SUCCESS = "success";
	private static String KEY_UID = "uid";
	private static String KEY_NAME = "name";
	private static String KEY_EMAIL = "email";
	private static String KEY_CREATED_AT = "created_at";
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_register, container, false);	
         
        return rootView;
    }
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		// Importing all assets like buttons, text fields
		inputFullName = (EditText) getActivity().findViewById(R.id.registerName);
		inputEmail = (EditText) getActivity().findViewById(R.id.registerEmail);
		inputPassword = (EditText) getActivity().findViewById(R.id.registerPassword);
		inputTel = (EditText) getActivity().findViewById(R.id.registerTelephone);
		btnRegister = (Button) getActivity().findViewById(R.id.btnRegister);
		registerErrorMsg = (TextView) getActivity().findViewById(R.id.register_error);
		
		btnRegister.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View view) {
				String name = inputFullName.getText().toString();
				String email = inputEmail.getText().toString();
				String password = inputPassword.getText().toString();
				String tel = inputTel.getText().toString();
				UserFunctions userFunction = new UserFunctions();
				JSONObject json = userFunction.registerUser(name, email, password,tel);
				
				// check for login response
				try {
					if (json.getString(KEY_SUCCESS) != null) {
						registerErrorMsg.setText("");
						String res = json.getString(KEY_SUCCESS); 
						if(Integer.parseInt(res) == 1){
							// user successfully registred
							// Store user details in SQLite Database
							DatabaseHandler db = new DatabaseHandler(getActivity().getApplicationContext());
							JSONObject json_user = json.getJSONObject("user");
							
							// Clear all previous data in database
							userFunction.logoutUser(getActivity().getApplicationContext());
							db.addUser(json_user.getString(KEY_NAME), json_user.getString(KEY_EMAIL), json.getString(KEY_UID), json_user.getString(KEY_CREATED_AT));						
							
						    FragmentTransaction trasection = getFragmentManager().beginTransaction();
						       try {		           
						    	   trasection
						           .replace(R.id.frame_container,new LoginFragment(),null)
						           .addToBackStack(null)
						           .commit();

						       } catch (Exception e) {
						           
						       }

						}else{
							// Error in registration
							registerErrorMsg.setText("Error occured in registration");
						}
					}
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
		});
		

		
	}
	
}
