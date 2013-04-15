package com.example.bulgariantripadvisor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.util.Log;
import android.view.Menu;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class HotelActivity extends Activity {

	private DatabaseHelper dbIngredientHelper = null;
	private Cursor ourCursor = null;
	private String name;
	private String tablename;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hotel);
		
		Intent intent = this.getIntent();
		name = intent.getExtras().getString("hotelname");
		tablename = intent.getExtras().getString("tablename");
		
		setBackgrount();  
		
		try{
			  dbIngredientHelper=new DatabaseHelper(this,tablename); 
			  dbIngredientHelper.createDatabase(); 
			  dbIngredientHelper.openDataBase();
			  ourCursor=dbIngredientHelper.getCursor();
              while(ourCursor.moveToNext() ){
            	  String something = dbIngredientHelper.getName(ourCursor).toString();
				  if ( something.equals(name)){
					  String description = dbIngredientHelper.getDescription(ourCursor).toString();
					  String prices = dbIngredientHelper.getPrices(ourCursor).toString();
					  String includes = dbIngredientHelper.getIncludes(ourCursor).toString();
					  String stars = dbIngredientHelper.getStars(ourCursor).toString();
					  String contacts = dbIngredientHelper.getContacts(ourCursor).toString();
					  
					  TextView textName = (TextView) findViewById(R.id.hotelname);
					  textName.setText(name);
					  TextView textDescription = (TextView) findViewById(R.id.hoteldescription);
					  textDescription.setText("Description: "+description);
					  TextView textPrices = (TextView) findViewById(R.id.hotelprices);
					  textPrices.setText("Prices: "+prices);
					  TextView textIncludes = (TextView) findViewById(R.id.hotelincludes);
					  textIncludes.setText("Amenities: "+includes);
					  TextView textStars = (TextView) findViewById(R.id.hotelstars);
					  textStars.setText("Hotel Stars: "+stars);
					  TextView textContacts = (TextView) findViewById(R.id.hotelcontacts);
					  textContacts.setText("Contact information: \n"+contacts);
					  break;
				  }
			  }
             			  
			  dbIngredientHelper.closeDB();
			  ourCursor.close();
			  
		}catch(Exception e) { 
			   Log.e("ERROR", "ERROR IN CODE: " + e.toString()); 
			   e.printStackTrace(); 
		}
	}

	private void setBackgrount() {
		RelativeLayout rlayout= (RelativeLayout) findViewById(R.id.hotellayout);
		if(name.equals("Budapest Hotel")){
		       rlayout.setBackgroundResource(R.drawable.backgroundbudapesthotel);
		        this.setContentView(rlayout);
		}
		if(name.equals("Grand Hotel Sofia")){
		       rlayout.setBackgroundResource(R.drawable.backgroundgrandhotelsofia);
		        this.setContentView(rlayout);
		}  
		if(name.equals("Hilton Sofia")){
		       rlayout.setBackgroundResource(R.drawable.backgroundhiltonsofia);
		        this.setContentView(rlayout);
		}  
		if(name.equals("Holiday Inn Sofia")){
		       rlayout.setBackgroundResource(R.drawable.backgroundholidayinnsofia);
		        this.setContentView(rlayout);
		}
		if(name.equals("Central Park Hotel")){
		       rlayout.setBackgroundResource(R.drawable.backgroundcentralparkhotel);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Hotel Anel")){
		       rlayout.setBackgroundResource(R.drawable.backgroundhotelanel);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Hotel Maria Luisa")){
		       rlayout.setBackgroundResource(R.drawable.backgroundhotelmarialuisa);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Metropolitan Hotel")){
		       rlayout.setBackgroundResource(R.drawable.backgroundmetropolitanhotel);
		        this.setContentView(rlayout);
		}
		if(name.equals("Radisson Blu Grand Hotel")){
		       rlayout.setBackgroundResource(R.drawable.backgroundradissonblugrandhotelsofia);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Sheraton Sofia Hotel Balkan")){
		       rlayout.setBackgroundResource(R.drawable.backgroundsheratonsofiahotelbalkan);
		        this.setContentView(rlayout);
		} 
		
		if(name.equals("Balneo Complex and Spa Aquatonik")){
		       rlayout.setBackgroundResource(R.drawable.backgroundbalneocomplexandspaaquatonik);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Bor Spa-Club")){
		       rlayout.setBackgroundResource(R.drawable.backgroundborspaclub);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Spa Hotel Dvoretsa")){
		       rlayout.setBackgroundResource(R.drawable.backgroundspahoteldvoretsa);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Grand Hotel Velingrad")){
		       rlayout.setBackgroundResource(R.drawable.backgroundgrandhotelvelingrad);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Park Hotel Olymp")){
		       rlayout.setBackgroundResource(R.drawable.backgroundparkhotelolymp);
		        this.setContentView(rlayout);
		} 
		
		if(name.equals("Majestic Hotel")){
		       rlayout.setBackgroundResource(R.drawable.backgroundmajestichotel);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Iberostar Sunny Beach Resort")){
		       rlayout.setBackgroundResource(R.drawable.backgroundiberostarsunnybeachresort);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Helena Sands Hotel")){
		       rlayout.setBackgroundResource(R.drawable.backgroundhelenasandshotel);
		        this.setContentView(rlayout);
		} 
		if(name.equals("MPM Orpheus Boutique Hotel")){
		       rlayout.setBackgroundResource(R.drawable.backgroundmpmorpheusboutiquehotel);
		        this.setContentView(rlayout);
		} 
		if(name.equals("Dune Hotel")){
		       rlayout.setBackgroundResource(R.drawable.backgrounddunehotel);
		        this.setContentView(rlayout);
		} 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.hotel, menu);
		return true;
	}

}
