package info.adamjsmith.intents;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {
	
	int request_Code = 1;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void onClickWebBrowser(View view) {
		Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.amazon.co.uk"));
		startActivity(i);
	}
	
	public void onClickMakeCalls(View view) {
		Intent i = new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:+651234567"));
		startActivity(i);
	}
	
	public void onClickShowMap(View view) {
		Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:37.827500,-122.481670"));
		startActivity(i);
	}
	
	public void onClickLaunchMyBrowser(View view) {
		Intent i = new Intent("info.adamjsmith.MyBrowser");
		i.setData(Uri.parse("http://www.amazon.com"));
		startActivity(i);
	}
}
