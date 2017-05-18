package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;


public class ShowFragment extends Fragment {
	
	public ShowFragment(){}
	
	private static final String MAP_URL = "file:///android_asset/map_v3.html";
	private WebView webView;
	private TextView startaddressText, endaddressText;
	View rootView;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_show, container, false);          
        
        startaddressText 	= (TextView) rootView.findViewById(R.id.startaddressText);  
        endaddressText 		= (TextView) rootView.findViewById(R.id.endaddressText);

        setupWebView();
        return rootView;
    }

	private void setupWebView() {
		// TODO Auto-generated method stub
		   webView = (WebView) rootView.findViewById(R.id.webview01);
		   webView.getSettings().setJavaScriptEnabled(true);//啟用Webview的JavaScript功能
		   webView.setWebViewClient(new WebViewClient(){
			   public void onPageFinished(WebView view, String url) {
				   
			        GlobalVariable globalVariable = (GlobalVariable)getActivity().getApplicationContext();
			        final String Start 	= globalVariable.Start;
			        final String End 	= globalVariable.End;
			        
			        if(Start==null){
			        	startaddressText.setText("");
			        	endaddressText.setText("");
			        	}
			        else{
			        	startaddressText.setText(Start); 
			        	endaddressText.setText(End);
			        	webView.loadUrl("javascript:calcRoute('"+ Start +"','" + End +"')");
			        }

			    }
		   });
		   webView.loadUrl(MAP_URL);
		
	}


}
