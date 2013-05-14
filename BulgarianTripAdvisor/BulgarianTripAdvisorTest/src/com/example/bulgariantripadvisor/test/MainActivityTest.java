package com.example.bulgariantripadvisor.test;

import com.example.bulgariantripadvisor.*;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.test.ActivityUnitTestCase;

public class MainActivityTest extends ActivityUnitTestCase<MainActivity> {
	  private int buttonId;
	  private MainActivity activity;

	  public MainActivityTest() {
	    super(MainActivity.class);
	  }
	  @Override
	  protected void setUp() throws Exception {
	    super.setUp();
	    Intent intent = new Intent(getInstrumentation().getTargetContext(),MainActivity.class);
	    startActivity(intent, null, null);
	    activity = getActivity();
	  }

	  public void testRegisterActivity() {
	    buttonId = com.example.bulgariantripadvisor.R.id.button1;
	    Button view = (Button) activity.findViewById(buttonId);
	    assertNotNull("Button not allowed to be null", view);

	    getActivity().RegisterActivity(view);

	    Intent triggeredIntent = getStartedActivityIntent();
	    assertNotNull("Intent was null", triggeredIntent);
	  }
	  
	  public void testLoginActivity() {
		    buttonId = com.example.bulgariantripadvisor.R.id.button2;
		    Button view = (Button) activity.findViewById(buttonId);
		    assertNotNull("Button not allowed to be null", view);

		    getActivity().LoginActivity(view);

		    Intent triggeredIntent = getStartedActivityIntent();
		    assertNotNull("Intent was null", triggeredIntent);
		  }


	  @Override
	  protected void tearDown() throws Exception {
	    super.tearDown();
	  }
}
