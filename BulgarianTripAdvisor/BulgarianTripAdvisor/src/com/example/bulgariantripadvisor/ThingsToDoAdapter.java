package com.example.bulgariantripadvisor;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ThingsToDoAdapter extends ArrayAdapter<String> {
	private final Context context;
	private ArrayList<String> values = new ArrayList<String>();
	
	public ThingsToDoAdapter(Context context, ArrayList<String> values) {
		super(context, R.layout.activity_things_to_do, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.activity_things_to_do, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.text);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
		textView.setText(values.get(position));

		String s = values.get(position);

		if (s.equals("Alexander Nevski Church")) {
			imageView.setImageResource(R.drawable.alexandernevskichurch);
		}
		if (s.equals("Ivan Vazov National Theater")) {
			imageView.setImageResource(R.drawable.ivanvazovnationaltheater);
		}
		if (s.equals("Boyana Church")) {
			imageView.setImageResource(R.drawable.boyanachurch);
		}
		if (s.equals("Vitosha Mountain")) {
			imageView.setImageResource(R.drawable.vitoshamountain);
		}
		if(s.equals("National Opera and Ballet")){
			imageView.setImageResource(R.drawable.nationaloperaandballet);
		}
		if (s.equals("The Rotunda of St George (Sveti Georgi)")) {
			imageView.setImageResource(R.drawable.therotundaofstgeorge);
		}
		if (s.equals("Monument to the Unknown Warrior")) {
			imageView.setImageResource(R.drawable.monumenttotheunknownwarrior);
		}
		if (s.equals("Vitosha Boulevard")) {
			imageView.setImageResource(R.drawable.vitoshaboulevard);
		}
		if (s.equals("Vasil Levski Monument")) {
			imageView.setImageResource(R.drawable.vasillevskimonument);
		}
		if (s.equals("Statue of Tsar Alexander II")) {
			imageView.setImageResource(R.drawable.statueoftsaralexander);
		}
		
		return rowView;
	}
}