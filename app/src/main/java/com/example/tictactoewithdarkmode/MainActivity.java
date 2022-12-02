package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private boolean hasTurned = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creates vibrator
        Vibrator vib = (Vibrator)getSystemService(VIBRATOR_SERVICE);

        //goes from main to names
        Button buttonGame = findViewById(R.id.playButton);
        buttonGame.setOnClickListener(v -> {
            //vibrates when button clicked
            vib.vibrate(40);
            //intent that goe from Main to names
            Intent intent = new Intent(this,giveNamesActivity.class);
            startActivity(intent); //start the activity
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out); //animation
        });

        //github icon
        ImageView img = findViewById(R.id.github);
        img.setOnClickListener(v -> {
            //vibrate
            vib.vibrate(40);
            //intent that opens web browser to my github project link
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/alexgajda/TicTacToe_DarkMode"));
            startActivity(intent2);
        });




        //todo
        TextView darkMod = findViewById(R.id.darkMode);

        boolean isNight =  AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES;
        darkMod.setOnClickListener(view -> {

            vib.vibrate(50);
            if (isNight){
                Log.d("1", "first:");
                hasTurned = true;
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

            }else{
                Log.d("2", "second");
                hasTurned = true;
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        });

    }
}