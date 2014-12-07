package com.anioutkazharkova.customizedsearchview.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

public class MySearchView extends SearchView {

	 private Typeface mFont;
	 private Context mContext;
	 
	 private View mSearchEditFrame;
	 private View mSearchPlate;
	 private View mSubmitArea;
	 private ImageView mSearchButton;
	 private ImageView mSubmitButton;
	 private ImageView mCloseButton;
	 private ImageView mVoiceButton;
	 private ImageView mSearchHintIcon;
	 
	 
	public MySearchView(Context context) {
		super(context);
		mContext=context;
		
		initFields();
		
		
	}
	public MySearchView(Context context,AttributeSet attrs)
	{
		super(context,attrs);
		mContext=context;
		
		initFields();
	}
	
	public void setTypeFace(Typeface font)
	{
		this.mFont=font;
	}

	private void initFields()
	{
		int editFrameId=mContext.getResources().getIdentifier("android:id/search_src_text", null, null);
		mSearchEditFrame=findViewById(editFrameId);
		
		int plateId=mContext.getResources().getIdentifier("android:id/search_plate", null, null);
		mSearchPlate=findViewById(plateId);
		
		int areaId=mContext.getResources().getIdentifier("android:id/submit_area", null, null);
		mSubmitArea=findViewById(areaId);
		
		int subBtnId=mContext.getResources().getIdentifier("android:id/search_go_btn", null, null);
		mSubmitButton=(ImageView) findViewById(subBtnId);
		
		int closeBtnId=mContext.getResources().getIdentifier("android:id/search_close_btn", null, null);
		mCloseButton=(ImageView) findViewById(closeBtnId);
		
		int hintId=mContext.getResources().getIdentifier("android:id/search_mag_icon", null, null);
		mSearchHintIcon=(ImageView) findViewById(hintId);
		
		int voiceId=mContext.getResources().getIdentifier("android:id/search_voice_btn", null, null);
		mVoiceButton=(ImageView) findViewById(voiceId);
	}
	
	
}
