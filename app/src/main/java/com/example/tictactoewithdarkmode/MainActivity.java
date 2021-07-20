package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //goes from main to settings
        Button buttonSetting = (Button) findViewById(R.id.settingsButton);
        buttonSetting.setOnClickListener(v -> {
            Intent intent = new Intent(this,settingsActivity.class);
            startActivity(intent); //starts the activity
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out); //animations
        });

        //goes from main to names
        Button buttonGame = (Button) findViewById(R.id.playButton);
        buttonGame.setOnClickListener(v -> {
            Intent intent = new Intent(this,giveNamesActivity.class);
            startActivity(intent); //start the activity
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out); //animation
        });

    }
}