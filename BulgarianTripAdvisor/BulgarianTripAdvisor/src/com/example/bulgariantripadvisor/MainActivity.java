/* Bulgarian Trip Advisor - Mobile App for Android
 * Made by Daniela Aleksova and Anton Dedikov 
 * 
 * In Login please enter: 
 * email: "foo@abv.bg" or "bar@abv.bg"
 * password: "hello" or "world"
 * 
 * In Register enter data and click create.To see your data press Show Table
 * 
 * In Hotels only button Gallery is functioning at this moment.
 * 
 * Functionality and other information here:
 * https://docs.google.com/document/d/1lujG7cZifu6yJ8kiwWxPN0QS9IlkfGpqQMQtIXNB1X4/edit?usp=sharing
 * 
 * 
 */

package com.example.bulgariantripadvisor;

import android.view.View;
import android.view.Window;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.window_title);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		    
	public void RegisterActivity(View view){
		Intent intent = new Intent(this, RegisterActivity.class);
		startActivity(intent);
	}

	public void LoginActivity(View view){
		Intent intent = new Intent(this, LoginActivity.class);
		startActivity(intent);
	}
	
	public void HotelsActivity(View view){
		Intent intent = new Intent(this, HotelsActivity.class);
		startActivity(intent);
	}
}
