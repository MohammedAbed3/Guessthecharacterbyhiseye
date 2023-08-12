package com.tegogames.guessthecharacterbyhiseye;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.tegogames.guessthecharacterbyhiseye.Language.AppCompat;
import com.tegogames.guessthecharacterbyhiseye.Language.LanguageManager;

public class MainActivity extends AppCompat {

    ImageView settings;
    LanguageManager languageManager;
    String lang;

    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languageManager = new LanguageManager(this);
        lang= languageManager.getLang();



        play = findViewById(R.id.btn_play);

        settings = findViewById(R.id.settings);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),QuestionActivity.class);
                startActivity(intent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));

            }
        });

    }
}