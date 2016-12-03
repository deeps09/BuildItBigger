package com.udacity.builditbigger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    private TextView mJokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        mJokeText = (TextView) findViewById(R.id.joketext);

        Intent receiveIntent = getIntent();
        mJokeText.setText(receiveIntent.getStringExtra("joke"));
    }
}
