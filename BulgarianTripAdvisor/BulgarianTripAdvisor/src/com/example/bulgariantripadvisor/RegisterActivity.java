package com.example.bulgariantripadvisor;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class RegisterActivity extends Activity{
	
	String username,password,email;

    public SQLiteDatabase db;

	TableRow tableRow;
	TextView textView,textView1,textView2,textView3,textView4,textView5;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        
        db=openOrCreateDatabase("MyDB1",MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS Users(username VARCHAR,password VARCHAR,email VARCHAR);");
    }
	public void data(View view)
	{
	  EditText edittext1=(EditText )findViewById(R.id.username);
	  EditText edittext2=(EditText )findViewById(R.id.password);
	  EditText edittext3=(EditText )findViewById(R.id.email);
	  username=edittext1.getText().toString();
	  password=edittext2.getText().toString();
	  email=edittext3.getText().toString();
	  db.execSQL("INSERT INTO  Users VALUES('"+username+"','"+password+"','"+email+"');");
		
		 
	}
	public void showdata(View view)
	{
	    Cursor c=db.rawQuery("SELECT * from Users", null);
	    int count= c.getCount();
	    c.moveToFirst();
	    
	    TableLayout tableLayout = new TableLayout(getApplicationContext());
	    tableLayout.setVerticalScrollBarEnabled(true);
	    TableRow tableRow;
	    
	    TextView textView,textView1,textView2,textView3,textView4,textView5;
	    
	    tableRow = new TableRow(getApplicationContext());
	    
	    textView=new TextView(getApplicationContext());
	    textView.setText("Username");
	    textView.setTextColor(Color.BLACK);
	  	textView.setTypeface(null, Typeface.ITALIC);
	  	textView.setPadding(20, 20, 20, 20);
	  	
	  	tableRow.addView(textView);
	  	
	    textView4=new TextView(getApplicationContext());
	  	textView4.setText("Password");
	  	textView4.setTextColor(Color.BLACK);
	  	textView4.setTypeface(null, Typeface.ITALIC);
	  	textView4.setPadding(20, 20, 20, 20);
	  	 
	  	tableRow.addView(textView4);
	  	
	    textView5=new TextView(getApplicationContext());
	  	textView5.setText("Email");
	  	textView5.setTextColor(Color.BLACK);
	  	textView5.setTypeface(null, Typeface.ITALIC);
	  	textView5.setPadding(20, 20, 20, 20);
	  	
	  	tableRow.addView(textView5);
	  	
	    tableLayout.addView(tableRow);
	     for (Integer j = 0; j < count; j++)
	     {
	         tableRow = new TableRow(getApplicationContext());
	         textView1 = new TextView(getApplicationContext());
	         textView1.setText(c.getString(c.getColumnIndex("username")));
	         textView2 = new TextView(getApplicationContext());
	         textView2.setText(c.getString(c.getColumnIndex("password")));
	         textView3 = new TextView(getApplicationContext());
	         textView3.setText(c.getString(c.getColumnIndex("email")));
	         textView1.setPadding(20, 20, 20, 20);
	         textView2.setPadding(20, 20, 20, 20);
	         textView3.setPadding(20, 20, 20, 20);
	         tableRow.addView(textView1);
	         tableRow.addView(textView2);
	         tableRow.addView(textView3);
	         tableLayout.addView(tableRow);
	         c.moveToNext() ;
	     }
	     setContentView(tableLayout);
	     
	db.close();
	}
	
	 

}
