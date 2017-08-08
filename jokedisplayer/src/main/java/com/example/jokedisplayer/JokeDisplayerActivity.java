package com.example.jokedisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayerActivity extends AppCompatActivity {

    public final static String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_displayer);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE);
        TextView jokeTextView = (TextView) findViewById(R.id.joke_tv_inLib);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
