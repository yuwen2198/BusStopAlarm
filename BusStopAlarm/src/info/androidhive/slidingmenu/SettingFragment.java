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
        globalVariable.Pois.add(new Poi("新海抽水站" 				, 25.0283120 , 121.4556500 ));
        globalVariable.Pois.add(new Poi("名來新城" 				, 25.0260810 , 121.4546580 ));
        globalVariable.Pois.add(new Poi("板橋國中(435藝文特區)" 	, 25.0224970 , 121.4543910 ));
        globalVariable.Pois.add(new Poi("307公車站社后" 			, 25.0206850 , 121.4545980 ));
        globalVariable.Pois.add(new Poi("和平一村" 				, 25.0193250 , 121.4553370 ));
        globalVariable.Pois.add(new Poi("大庭新村" 				, 25.0170150 , 121.4564200 ));
        globalVariable.Pois.add(new Poi("育樂中心" 				, 25.0151880 , 121.4566870 ));
        globalVariable.Pois.add(new Poi("板橋區戶政事務所" 			, 25.0127050 , 121.4564580 ));
        globalVariable.Pois.add(new Poi("307公車站北門街" 			, 25.0113870 , 121.4567210 ));
        globalVariable.Pois.add(new Poi("捷運府中站(府中路)" 		, 25.0089790 , 121.4584090 ));
        globalVariable.Pois.add(new Poi("萬坪公園" 	 			, 25.0135170 , 121.4606700 ));
        globalVariable.Pois.add(new Poi("板橋公車站" 				, 25.0129430 , 121.4624860 ));
        globalVariable.Pois.add(new Poi("新北市政府(新府路)" 		, 25.0120440 , 121.4645460 ));
        globalVariable.Pois.add(new Poi("深丘里" 					, 25.0095250 , 121.4653730 ));
        globalVariable.Pois.add(new Poi("民族區運路口" 			, 25.0083000 , 121.4659570 ));
        globalVariable.Pois.add(new Poi("電信訓練所" 				, 25.0079930 , 121.4666600 ));
        globalVariable.Pois.add(new Poi("國泰街口" 				, 25.0066750 , 121.4705040 ));
        globalVariable.Pois.add(new Poi("中和環球購物中心" 			, 25.0067220 , 121.4749740 ));
        globalVariable.Pois.add(new Poi("板橋監理站" 				, 25.0057580 , 121.4758220 ));
        globalVariable.Pois.add(new Poi("積穗" 					, 25.0055990 , 121.4785760 ));
        globalVariable.Pois.add(new Poi("員山" 					, 25.0038480 , 121.4806400 ));
        globalVariable.Pois.add(new Poi("積穗國中" 				, 25.0005550 , 121.4814200 ));
        globalVariable.Pois.add(new Poi("員山派出所" 				, 24.9981390 , 121.4811540 ));
        globalVariable.Pois.add(new Poi("中和高中" 				, 24.9961960 , 121.4810440 ));
        globalVariable.Pois.add(new Poi("連城路" 					, 24.9955800 , 121.4829930 ));
        globalVariable.Pois.add(new Poi("連城中正路口" 			, 24.9962400 , 121.4869480 ));
        globalVariable.Pois.add(new Poi("連城錦和路口" 			, 24.9961980 , 121.4901330 ));
        globalVariable.Pois.add(new Poi("台貿一村" 				, 24.9967320 , 121.4922860 ));
        globalVariable.Pois.add(new Poi("連城板南路" 				, 24.9979020 , 121.4937040 ));
        globalVariable.Pois.add(new Poi("連城景平路" 				, 25.0001290 , 121.4969000 ));
        globalVariable.Pois.add(new Poi("華中橋" 					, 25.0031030 , 121.4967900 ));
        globalVariable.Pois.add(new Poi("果菜市場" 				, 25.0203350 , 121.4981290 ));
        globalVariable.Pois.add(new Poi("萬大國小" 				, 25.0235070 , 121.4996810 ));
        globalVariable.Pois.add(new Poi("德昌街口" 				, 25.0257280 , 121.5003120 ));
        globalVariable.Pois.add(new Poi("西藏路口" 				, 25.0282930 , 121.5007360 ));
        globalVariable.Pois.add(new Poi("西藏路" 					, 25.0293380 , 121.5020620 ));
        globalVariable.Pois.add(new Poi("廈安里" 					, 25.0307720 , 121.5042430 ));
        globalVariable.Pois.add(new Poi("萬大路" 		 			, 25.0307980 , 121.5007510 ));
        globalVariable.Pois.add(new Poi("莒光派出所" 				, 25.0311060 , 121.5027580 ));
        globalVariable.Pois.add(new Poi("大埔街" 					, 25.0322700 , 121.5045490 ));
        globalVariable.Pois.add(new Poi("聯合醫院和平院區" 			, 25.0363690 , 121.5068580 ));
        globalVariable.Pois.add(new Poi("捷運西門站" 				, 25.0421740 , 121.5082930 ));
        globalVariable.Pois.add(new Poi("中華路北站" 				, 25.0456990 , 121.5097560 ));
        globalVariable.Pois.add(new Poi("臺北車站(忠孝)" 			, 25.0463600 , 121.5176050 ));
        globalVariable.Pois.add(new Poi("行政院" 					, 25.0463170 , 121.5209660 ));
        globalVariable.Pois.add(new Poi("青島林森路口" 			, 25.0436700 , 121.5223310 ));
        globalVariable.Pois.add(new Poi("捷運善導寺站" 			, 25.0450250 , 121.5231060 ));
        globalVariable.Pois.add(new Poi("華山公園" 				, 25.0481840 , 121.5220180 ));
        globalVariable.Pois.add(new Poi("林森北路一" 				, 25.0505060 , 121.5250850 ));
        globalVariable.Pois.add(new Poi("南京吉林路口" 			, 25.0520970 , 121.5303190 ));
        globalVariable.Pois.add(new Poi("捷運松江南京站" 			, 25.0520110 , 121.5330580 ));
        globalVariable.Pois.add(new Poi("南京建國路口" 			, 25.0519980 , 121.5372540 ));
        globalVariable.Pois.add(new Poi("南京龍江路口" 			, 25.0519390 , 121.5407100 ));
        globalVariable.Pois.add(new Poi("捷運南京復興站" 			, 25.0522410 , 121.5440400 ));
        globalVariable.Pois.add(new Poi("南京敦化路口(小巨蛋)" 		, 25.0517630 , 121.5495220 ));
        globalVariable.Pois.add(new Poi("南京寧安街口" 			, 25.0515570 , 121.5547400 ));
        globalVariable.Pois.add(new Poi("南京三民路口" 			, 25.0513990 , 121.5639810 ));
        globalVariable.Pois.add(new Poi("南京公寓(捷運南京三民)"		, 25.0512290 , 121.5649260 ));
        globalVariable.Pois.add(new Poi("南松山(南京)" 			, 25.0510890 , 121.5686880 ));
        globalVariable.Pois.add(new Poi("南松山(塔悠)" 			, 25.0521270 , 121.5704340 ));
        globalVariable.Pois.add(new Poi("發電所" 					, 25.0549170 , 121.5700210 ));
        globalVariable.Pois.add(new Poi("新東里" 					, 25.0574020 , 121.5695860 ));
        globalVariable.Pois.add(new Poi("民生國中" 	 			, 25.0602210 , 121.5678770 ));
        globalVariable.Pois.add(new Poi("新益里" 					, 25.0624320 , 121.5663430 ));
        globalVariable.Pois.add(new Poi("莊敬里" 					, 25.0650770 , 121.5656950 ));                 
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
