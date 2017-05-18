package info.androidhive.slidingmenu;

import java.util.ArrayList;

import android.app.Application;
import android.app.Service;
import android.os.Vibrator;

public class GlobalVariable extends Application {
	public static GlobalVariable gv = new GlobalVariable();
	 String Start ;
	 String End ;
	 int skake,music;
	 int mEndlocationIndex;
	 double dis;
	 Vibrator mVibrator;
	 ArrayList<Poi> Pois = new ArrayList<Poi>();
	 
	 public static GlobalVariable getInstance(){
		 return gv;
	 }	 

	 public  void getshake(){
		 mVibrator = (Vibrator) getSystemService(Service.VIBRATOR_SERVICE);
		 mVibrator.vibrate(10000);
	 }
	 
	 
	    	
	 
	 
	}
