package com.example.android.miwok;

import android.widget.Toast;

public class Word {
	  private String mDefaultText;
	  private String mEnglishText;
	  private static final int NO_IMAGE_PROVIDED = -1;
	  private int mImageResourceId = NO_IMAGE_PROVIDED;
	  public Word(String DefaultText, String EnglishText) {
			mDefaultText = DefaultText;
			mEnglishText = EnglishText;
	  }
	  public Word(String DefaultText, String EnglishText, int ImageResourceId) {
			mDefaultText = DefaultText;
			mEnglishText = EnglishText;
			mImageResourceId = ImageResourceId;
	  }
	  public String getDefaultText() {
			return mDefaultText;
	  }
	  public String getEnglishText() {
			return mEnglishText;
	  }
	  public int getImageResourceId(){
			return mImageResourceId;
	  }
	  public boolean hasImage() {
			return mImageResourceId != NO_IMAGE_PROVIDED;
		}
}
