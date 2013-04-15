package com.example.bulgariantripadvisor;

import com.example.bulgariantripadvisor.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class HotelsAdapter extends ArrayAdapter<String> {
	private final Context context;
	private String[] values;
	
	public HotelsAdapter(Context context, String[] values) {
		super(context, R.layout.activity_hotels, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.activity_hotels, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		textView.setText(values[position]);

		// Change icon based on name
		String s = values[position];

		System.out.println(s);

		return rowView;
	}
}
