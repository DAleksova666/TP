package com.example.bulgariantripadvisor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class HotelsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hotels);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hotels, menu);
		return true;
	}

	public void OpenGallery(View view){
		Intent intent = new Intent(this, GalleryActivity.class);
		startActivity(intent);
	}
}
