package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SettingFragment extends Fragment {
	
	public SettingFragment(){}
		
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);
        
        GlobalVariable globalVariable = GlobalVariable.getInstance();
        globalVariable.Pois.add(new Poi("�s�������" 				, 25.0283120 , 121.4556500 ));
        globalVariable.Pois.add(new Poi("�W�ӷs��" 				, 25.0260810 , 121.4546580 ));
        globalVariable.Pois.add(new Poi("�O���ꤤ(435����S��)" 	, 25.0224970 , 121.4543910 ));
        globalVariable.Pois.add(new Poi("307���������Z" 			, 25.0206850 , 121.4545980 ));
        globalVariable.Pois.add(new Poi("�M���@��" 				, 25.0193250 , 121.4553370 ));
        globalVariable.Pois.add(new Poi("�j�x�s��" 				, 25.0170150 , 121.4564200 ));
        globalVariable.Pois.add(new Poi("�|�֤���" 				, 25.0151880 , 121.4566870 ));
        globalVariable.Pois.add(new Poi("�O���Ϥ�F�ưȩ�" 			, 25.0127050 , 121.4564580 ));
        globalVariable.Pois.add(new Poi("307�������_����" 			, 25.0113870 , 121.4567210 ));
        globalVariable.Pois.add(new Poi("���B������(������)" 		, 25.0089790 , 121.4584090 ));
        globalVariable.Pois.add(new Poi("�U�W����" 	 			, 25.0135170 , 121.4606700 ));
        globalVariable.Pois.add(new Poi("�O��������" 				, 25.0129430 , 121.4624860 ));
        globalVariable.Pois.add(new Poi("�s�_���F��(�s����)" 		, 25.0120440 , 121.4645460 ));
        globalVariable.Pois.add(new Poi("�`�C��" 					, 25.0095250 , 121.4653730 ));
        globalVariable.Pois.add(new Poi("���ڰϹB���f" 			, 25.0083000 , 121.4659570 ));
        globalVariable.Pois.add(new Poi("�q�H�V�m��" 				, 25.0079930 , 121.4666600 ));
        globalVariable.Pois.add(new Poi("�����f" 				, 25.0066750 , 121.4705040 ));
        globalVariable.Pois.add(new Poi("���M���y�ʪ�����" 			, 25.0067220 , 121.4749740 ));
        globalVariable.Pois.add(new Poi("�O���ʲz��" 				, 25.0057580 , 121.4758220 ));
        globalVariable.Pois.add(new Poi("�n�J" 					, 25.0055990 , 121.4785760 ));
        globalVariable.Pois.add(new Poi("���s" 					, 25.0038480 , 121.4806400 ));
        globalVariable.Pois.add(new Poi("�n�J�ꤤ" 				, 25.0005550 , 121.4814200 ));
        globalVariable.Pois.add(new Poi("���s���X��" 				, 24.9981390 , 121.4811540 ));
        globalVariable.Pois.add(new Poi("���M����" 				, 24.9961960 , 121.4810440 ));
        globalVariable.Pois.add(new Poi("�s����" 					, 24.9955800 , 121.4829930 ));
        globalVariable.Pois.add(new Poi("�s���������f" 			, 24.9962400 , 121.4869480 ));
        globalVariable.Pois.add(new Poi("�s���A�M���f" 			, 24.9961980 , 121.4901330 ));
        globalVariable.Pois.add(new Poi("�x�T�@��" 				, 24.9967320 , 121.4922860 ));
        globalVariable.Pois.add(new Poi("�s���O�n��" 				, 24.9979020 , 121.4937040 ));
        globalVariable.Pois.add(new Poi("�s��������" 				, 25.0001290 , 121.4969000 ));
        globalVariable.Pois.add(new Poi("�ؤ���" 					, 25.0031030 , 121.4967900 ));
        globalVariable.Pois.add(new Poi("�G�楫��" 				, 25.0203350 , 121.4981290 ));
        globalVariable.Pois.add(new Poi("�U�j��p" 				, 25.0235070 , 121.4996810 ));
        globalVariable.Pois.add(new Poi("�w����f" 				, 25.0257280 , 121.5003120 ));
        globalVariable.Pois.add(new Poi("���ø��f" 				, 25.0282930 , 121.5007360 ));
        globalVariable.Pois.add(new Poi("���ø�" 					, 25.0293380 , 121.5020620 ));
        globalVariable.Pois.add(new Poi("�H�w��" 					, 25.0307720 , 121.5042430 ));
        globalVariable.Pois.add(new Poi("�U�j��" 		 			, 25.0307980 , 121.5007510 ));
        globalVariable.Pois.add(new Poi("�������X��" 				, 25.0311060 , 121.5027580 ));
        globalVariable.Pois.add(new Poi("�j�H��" 					, 25.0322700 , 121.5045490 ));
        globalVariable.Pois.add(new Poi("�p�X��|�M���|��" 			, 25.0363690 , 121.5068580 ));
        globalVariable.Pois.add(new Poi("���B�����" 				, 25.0421740 , 121.5082930 ));
        globalVariable.Pois.add(new Poi("���ظ��_��" 				, 25.0456990 , 121.5097560 ));
        globalVariable.Pois.add(new Poi("�O�_����(����)" 			, 25.0463600 , 121.5176050 ));
        globalVariable.Pois.add(new Poi("��F�|" 					, 25.0463170 , 121.5209660 ));
        globalVariable.Pois.add(new Poi("�C�q�L�˸��f" 			, 25.0436700 , 121.5223310 ));
        globalVariable.Pois.add(new Poi("���B���ɦx��" 			, 25.0450250 , 121.5231060 ));
        globalVariable.Pois.add(new Poi("�ؤs����" 				, 25.0481840 , 121.5220180 ));
        globalVariable.Pois.add(new Poi("�L�˥_���@" 				, 25.0505060 , 121.5250850 ));
        globalVariable.Pois.add(new Poi("�n�ʦN�L���f" 			, 25.0520970 , 121.5303190 ));
        globalVariable.Pois.add(new Poi("���B�Q���n�ʯ�" 			, 25.0520110 , 121.5330580 ));
        globalVariable.Pois.add(new Poi("�n�ʫذ���f" 			, 25.0519980 , 121.5372540 ));
        globalVariable.Pois.add(new Poi("�n���s�����f" 			, 25.0519390 , 121.5407100 ));
        globalVariable.Pois.add(new Poi("���B�n�ʴ_����" 			, 25.0522410 , 121.5440400 ));
        globalVariable.Pois.add(new Poi("�n�ʴ��Ƹ��f(�p���J)" 		, 25.0517630 , 121.5495220 ));
        globalVariable.Pois.add(new Poi("�n�ʹ�w��f" 			, 25.0515570 , 121.5547400 ));
        globalVariable.Pois.add(new Poi("�n�ʤT�����f" 			, 25.0513990 , 121.5639810 ));
        globalVariable.Pois.add(new Poi("�n�ʤ��J(���B�n�ʤT��)"		, 25.0512290 , 121.5649260 ));
        globalVariable.Pois.add(new Poi("�n�Q�s(�n��)" 			, 25.0510890 , 121.5686880 ));
        globalVariable.Pois.add(new Poi("�n�Q�s(��y)" 			, 25.0521270 , 121.5704340 ));
        globalVariable.Pois.add(new Poi("�o�q��" 					, 25.0549170 , 121.5700210 ));
        globalVariable.Pois.add(new Poi("�s�F��" 					, 25.0574020 , 121.5695860 ));
        globalVariable.Pois.add(new Poi("���Ͱꤤ" 	 			, 25.0602210 , 121.5678770 ));
        globalVariable.Pois.add(new Poi("�s�q��" 					, 25.0624320 , 121.5663430 ));
        globalVariable.Pois.add(new Poi("���q��" 					, 25.0650770 , 121.5656950 ));                 
        Log.d("aaa", "Listsize: " + globalVariable.Pois.size());
        
        final Spinner spin1 = (Spinner) rootView.findViewById(R.id.spinner1);
        final Spinner spin2 = (Spinner) rootView.findViewById(R.id.spinner2);
		final Spinner spin3 = (Spinner) rootView.findViewById(R.id.spinner3);
		final Spinner spin4 = (Spinner) rootView.findViewById(R.id.spinner4);
		Button  Startbtn	= (Button)	rootView.findViewById(R.id.Startbtn);
		
		ArrayAdapter<CharSequence> aa =  ArrayAdapter.createFromResource(
				getActivity(),R.array.Bus_stop, android.R.layout.simple_spinner_item);
		ArrayAdapter<CharSequence> bb =  ArrayAdapter.createFromResource(
				getActivity(),R.array.setting_spinner3, android.R.layout.simple_spinner_item);
		ArrayAdapter<CharSequence> cc =  ArrayAdapter.createFromResource(
				getActivity(),R.array.setting_spinner4, android.R.layout.simple_spinner_item);
		
		aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		spin1.setAdapter(aa);
		spin2.setAdapter(aa);
		spin3.setAdapter(bb);
		spin4.setAdapter(cc);
		
		Startbtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String position1 = spin1.getSelectedItem().toString();
				String position2 = spin2.getSelectedItem().toString();
				int EndlocationIndex = spin2.getSelectedItemPosition();
				int position3	 	 = spin3.getSelectedItemPosition();
				int position4	 	 = spin3.getSelectedItemPosition();
				
				GlobalVariable globalVariable = (GlobalVariable)getActivity().getApplicationContext();
				globalVariable.Start = position1;
				globalVariable.End 	 = position2;
				globalVariable.skake = position3;
				globalVariable.music = position4;
				globalVariable.mEndlocationIndex = EndlocationIndex;
				Log.d("globalVariable.mEndlocationIndex", globalVariable.mEndlocationIndex+"");
				
			    FragmentTransaction trasection = getFragmentManager().beginTransaction();
			       try {		           
			    	   trasection
			           .replace(R.id.frame_container,new ShowFragment(),null)
			           .addToBackStack(null)
			           .commit();

			       } catch (Exception e) {
			           
			       }
			       
			       Intent intent = new Intent(getActivity().getApplicationContext(), MyService.class);
			       getActivity().startService(intent);
			}
		    });	
				         
        return rootView;
    }
	
}
