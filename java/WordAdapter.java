package com.example.android.miwok;
import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
public class WordAdapter extends ArrayAdapter<Word> {
	  private int mColorResourceId;
	  public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
			super(context, 0, words);
			mColorResourceId = colorResourceId;
	  }
	  @Override
	  public View getView(int position, View convertView, ViewGroup parent) {
			View listItemView = convertView;
			if (listItemView == null) {
				  listItemView = LayoutInflater.from(getContext()).inflate(
						R.layout.list_item,parent, false);
			}
			Word currentWord = getItem(position);
			TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
			nameTextView.setText(currentWord.getEnglishText());
			TextView numberTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
			numberTextView.setText(currentWord.getDefaultText());
			View textContainer = listItemView.findViewById(R.id.text_container);
			int color = ContextCompat.getColor(getContext(),mColorResourceId);
			textContainer.setBackgroundColor(color);
			ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
			if(currentWord.hasImage()){
				  imageView.setImageResource(currentWord.getImageResourceId());
				  imageView.setVisibility(View.VISIBLE);
			}else{
				  imageView.setVisibility(View.GONE);
			}
			return listItemView;
	  }
}
