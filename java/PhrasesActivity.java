package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;
import com.example.android.miwok.Word;
import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
      @Override
	  protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.word_list);
			final ArrayList<Word> words = new ArrayList<Word>();
			words.add(new Word("where are you going ?","minto wuksus"));
			words.add(new Word("what is your name","tinna oyaasina"));
			words.add(new Word("my name is","oyyasit"));
			words.add(new Word("how are you feeling","michaksas"));
			words.add(new Word("i'm feeling good","kuchi achit"));
			words.add(new Word("Are you coming ","aanas'aa"));
			words.add(new Word("yes , i'm coming","haa'aanam"));
			words.add(new Word("i'm coming","aanam"));
			WordAdapter newAdapter = new WordAdapter(this, words, R.color.category_phrases);
			ListView listView = (ListView) findViewById(R.id.list);
			listView.setAdapter(newAdapter);
	  }
}
