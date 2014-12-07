package com.anioutkazharkova.scrollviewwithlistener;



import com.anioutkazharkova.scrollviewwithlistener.views.OnScrollViewListener;
import com.anioutkazharkova.scrollviewwithlistener.views.ScrollViewWithListener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ScrollViewWithListener scroll;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		scroll=(ScrollViewWithListener)findViewById(R.id.scroll);
		
		scroll.setOnScrollViewListener(new OnScrollViewListener() {
			
			@Override
			public void onScrollChanged(ScrollView scroll, int x, int y, int oldx,
					int oldy) {
				if (y > oldy)
				{
					Toast.makeText(getApplicationContext(), "Scrolling down", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Scrolling up", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
	}


}
