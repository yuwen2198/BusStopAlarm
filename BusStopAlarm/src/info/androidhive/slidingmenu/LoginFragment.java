package info.androidhive.slidingmenu;


import org.json.JSONException;
import org.json.JSONObject;
import com.example.androidhive.library.DatabaseHandler;
import com.example.androidhive.library.UserFunctions;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginFragment extends Fragment {
	
	public LoginFragment(){}
	
	Button btnLogin;
	Button btnLinkToRegister;
	EditText inputEmail;
	EditText inputPassword;
	EditText inputTel;
	TextView loginErrorMsg;
	
	private static String KEY_SUCCESS = "success";

	private static String KEY_UID = "uid";
	private static String KEY_NAME = "name";
	private static String KEY_EMAIL = "email";
	private static String KEY_CREATED_AT = "created_at";

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);           
        return rootView;
    }
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);
		
		inputEmail = (EditText) getActivity().findViewById(R.id.loginEmail);
		inputPassword = (EditText) getActivity().findViewById(R.id.loginPassword);
		inputTel = (EditText) getActivity().findViewById(R.id.loginTelephone);
		btnLogin = (Button) getActivity().findViewById(R.id.btnLogin);
		btnLinkToRegister = (Button) getActivity().findViewById(R.id.btnLinkToRegisterScreen);
		loginErrorMsg = (TextView) getActivity().findViewById(R.id.login_error);
		
		btnLogin.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				String email = inputEmail.getText().toString();
				String password = inputPassword.getText().toString();
				UserFunctions userFunction = new UserFunctions();
				String tel = inputTel.getText().toString();
				Log.d("Button", "Login");
				JSONObject json = userFunction.loginUser(email, password,tel);

				// check for login response
				try {
					if (json.getString(KEY_SUCCESS) != null) {
						loginErrorMsg.setText("");
						String res = json.getString(KEY_SUCCESS); 
						if(Integer.parseInt(res) == 1){
							// user successfully logged in
							// Store user details in SQLite Database
							DatabaseHandler db = new DatabaseHandler(getActivity().getApplicationContext());
							JSONObject json_user = json.getJSONObject("user");
							
							// Clear all previous data in database
							userFunction.logoutUser(getActivity().getApplicationContext());
							db.addUser(json_user.getString(KEY_NAME), json_user.getString(KEY_EMAIL), json.getString(KEY_UID), json_user.getString(KEY_CREATED_AT));						
							
						    FragmentTransaction trasection = getFragmentManager().beginTransaction();
						       try {		           
						    	   trasection
						           .replace(R.id.frame_container,new ShowFragment(),null)
						           .addToBackStack(null)
						           .commit();

						       } catch (Exception e) {
						           
						       }

						}else{
							// Error in login
							loginErrorMsg.setText("Incorrect username/password");
						}
					}
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}
		});

		// Link to Register Screen
		btnLinkToRegister.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				
			    FragmentTransaction trasection = getFragmentManager().beginTransaction();
			       try {		           
			    	   trasection
			           .replace(R.id.frame_container,new RegisterFragment(),null)
			           .addToBackStack(null)
			           .commit();

			       } catch (Exception e) {
			           
			       }

			}
		});
	}
		
	}
