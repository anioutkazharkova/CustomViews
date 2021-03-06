package com.anioutkazharkova.customizedsearchview.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

public class MySearchView extends SearchView {

	 private Typeface mFont;
	 private Context mContext;
	 
	 private View mSearchEditFrame;
	 private EditText mSearchEditText;
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
		
		//initializing fields
		initFields();
	}
	
	//Setting font and style
	public void setFont(Typeface font,int style)
	{
		this.mFont=font;
		mSearchEditText.setTypeface(font,style);
	}
	
	//Text size
	public void setTextSize(float textSize)
	{
		mSearchEditText.setTextSize(textSize);
	}
	
	//Setting colors
	public void setTextStyle(int color,int hintColor)
	{
		mSearchEditText.setTextColor(color);
		mSearchEditText.setHintTextColor(hintColor);
		
	}
	
	//
	public void setHintStyle(String hintText,int icon)
	{
		mSearchEditText.setHint(changeSpannableIcon(hintText, icon));
	}
	
	//Changing frame view
	public void setBackgroundFrame(int backgroundFrame)
	{
		
		mSearchPlate.setBackgroundResource(backgroundFrame);
	}
	
	//Customizing hint text and hint icon
	private SpannableStringBuilder changeSpannableIcon(String hintText, int icon)
    {
        
        SpannableStringBuilder ssb = new SpannableStringBuilder("  ");
        ssb.append(hintText);
        
        Drawable searchIcon = mContext.getResources().getDrawable(icon);
        int textSize = (int)(mSearchEditText.getTextSize());
        searchIcon.setBounds(0, 0, textSize, textSize);
        ssb.setSpan(new ImageSpan(searchIcon),1, 2,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        
        return ssb;
    }
	
	public ImageView getSearchIcon()
	{
		return mSearchHintIcon;
	}
	public ImageView getCloseButton()
	{
		return mCloseButton;
	}
	public ImageView getSubmitButton()
	{
		return mSearchButton;
	}
	public ImageView getVoiceButton()
	{
		return mVoiceButton;
	}

	///Initializing fields using reflection
	private void initFields()
	{
		//EditFrame
		int editframeId=mContext.getResources().getIdentifier("android:id/search_edit_frame", null, null);
		mSearchEditFrame=findViewById(editframeId);
		
		//EditText
		int textId=mContext.getResources().getIdentifier("android:id/search_src_text", null, null);
		mSearchEditText=(EditText) findViewById(textId);
		
		//Layout of edittext
		int plateId=mContext.getResources().getIdentifier("android:id/search_plate", null, null);
		mSearchPlate=findViewById(plateId);
		
		//Layout of submit button and voice button
		int areaId=mContext.getResources().getIdentifier("android:id/submit_area", null, null);
		mSubmitArea=findViewById(areaId);
		
		//Submit button
		int subBtnId=mContext.getResources().getIdentifier("android:id/search_go_btn", null, null);
		mSubmitButton=(ImageView) findViewById(subBtnId);
		
		//Close button
		int closeBtnId=mContext.getResources().getIdentifier("android:id/search_close_btn", null, null);
		mCloseButton=(ImageView) findViewById(closeBtnId);
		
		//Search icon
		int hintId=mContext.getResources().getIdentifier("android:id/search_mag_icon", null, null);
		mSearchHintIcon=(ImageView) findViewById(hintId);
		
		//Voice button
		int voiceId=mContext.getResources().getIdentifier("android:id/search_voice_btn", null, null);
		mVoiceButton=(ImageView) findViewById(voiceId);
		
		mSearchHintIcon.setImageDrawable(null);
	}
	
	
}
