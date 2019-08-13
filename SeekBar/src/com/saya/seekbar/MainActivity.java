package com.saya.seekbar;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/* Add "implements OnSeekBarChangeListener" and "Add Unimplemented Method" to MainActivity */

public class MainActivity extends Activity implements OnSeekBarChangeListener { 
	
	
	SeekBar red, green, blue;   // Three SeekBars
	RelativeLayout MainScreen;  // Screen

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MainScreen=(RelativeLayout) findViewById(R.id.screen);  // To change color of MainScreen 
		
		
		/* id's for SeekBars */
		red=(SeekBar)findViewById(R.id.seekBar1);
		green=(SeekBar) findViewById(R.id.seekBar2);
		blue=(SeekBar)findViewById(R.id.seekBar3);
		
		/* Current objects of colors(SeekBars) */
		red.setOnSeekBarChangeListener(this);
		green.setOnSeekBarChangeListener(this);
		blue.setOnSeekBarChangeListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
		// TODO Auto-generated method stub
		MainScreen.setBackgroundColor(Color.rgb(red.getProgress(), green.getProgress(), blue.getProgress()));
		
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}

}
