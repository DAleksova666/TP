package com.example.bulgariantripadvisor.test;
import com.example.bulgariantripadvisor.*;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.test.ActivityUnitTestCase;

public class ChooseActivityTest extends ActivityUnitTestCase<ChooseActivity> {
	  private int buttonId;
	  private ChooseActivity activity;

	  public ChooseActivityTest() {
	    super(ChooseActivity.class);
	  }
	  @Override
	  protected void setUp() throws Exception {
	    super.setUp();
	    Intent intent = new Intent(getInstrumentation().getTargetContext(),ChooseActivity.class);
	    startActivity(intent, null, null);
	    activity = getActivity();
	  }

	  public void testHotelsActivity() {
	    buttonId = com.example.bulgariantripadvisor.R.id.button1;
	    Button view = (Button) activity.findViewById(buttonId);
	    assertNotNull("Button not allowed to be null", view);

	    getActivity().HotelsActivity(view);

	    Intent triggeredIntent = getStartedActivityIntent();
	    assertNotNull("Intent was null", triggeredIntent);
	  }
	  
	  public void testThingsToDoActivity() {
		    buttonId = com.example.bulgariantripadvisor.R.id.button2;
		    Button view = (Button) activity.findViewById(buttonId);
		    assertNotNull("Button not allowed to be null", view);

		    getActivity().ThingsToDoActivity(view);

		    Intent triggeredIntent = getStartedActivityIntent();
		    assertNotNull("Intent was null", triggeredIntent);
		  }


	  @Override
	  protected void tearDown() throws Exception {
	    super.tearDown();
	  }
}
