package com.anioutkazharkova.customizedsearchview;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import com.anioutkazharkova.customizedsearchview.views.MySearchView;


public class MainActivity extends Activity {

	MySearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchView=(MySearchView)findViewById(R.id.searchView);
       
       searchView.setTextSize(20);
       searchView.setFont(Typeface.createFromAsset(getAssets(), "font.ttf"),Typeface.ITALIC);
       searchView.setTextStyle(getResources().getColor(R.color.text_white), getResources().getColor(R.color.hint_gray));
       searchView.setHintStyle("Enter text", R.drawable.search_light_icon);
       searchView.setBackgroundFrame(R.drawable.editframe);
       
       searchView.getSearchIcon().setVisibility(View.GONE);
    }


  
}
