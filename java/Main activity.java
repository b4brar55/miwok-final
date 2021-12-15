package com.example.android.miwok;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.android.miwok.MainActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		  TextView family = (TextView)findViewById(R.id.family);
		  family.setOnClickListener(new View.OnClickListener() {
					  @Override
					  public void onClick(View view) {
							Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
							startActivity(familyIntent);
					  }
				});
		  TextView number = (TextView)findViewById(R.id.numbers);
		  number.setOnClickListener(new View.OnClickListener() {
					  @Override
					  public void onClick(View view) {
							Intent numberIntent = new Intent(MainActivity.this, NumbersActivity.class);
							startActivity(numberIntent);
					  }
				});
		  TextView phrases = (TextView)findViewById(R.id.phrases);
		  phrases.setOnClickListener(new View.OnClickListener() {
					  @Override
					  public void onClick(View view) {
							Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
							startActivity(phrasesIntent);
					  }
				});
		  TextView color = (TextView)findViewById(R.id.colors);
		  color.setOnClickListener(new View.OnClickListener() {
					  @Override
					  public void onClick(View view) {
							Intent colorIntent = new Intent(MainActivity.this, ColorsActivity.class);
							startActivity(colorIntent);
					  }
				});	
    }


}


