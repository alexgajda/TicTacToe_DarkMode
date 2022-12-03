package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //when the back button is pressed it closes the app
    @Override
    public void onBackPressed() {
        //terminates app
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

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


        /////////DARK MODE BUTTON
        //textview
        TextView darkMod = findViewById(R.id.DarkMode);
        //shared preferences
        SharedPreferences shared = getSharedPreferences("AppSettingPrefs", Context.MODE_PRIVATE);
        SharedPreferences.Editor sharedPrefs = shared.edit();

        boolean isNightModeOn = shared.getBoolean("NightMode", false);

        if (isNightModeOn){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

        darkMod.setOnClickListener(view -> {
            //vibrate
            vib.vibrate(50);
            //on -> off
            if(isNightModeOn){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                sharedPrefs.putBoolean("NightMode", false);
                sharedPrefs.apply();
            //off -> on
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                sharedPrefs.putBoolean("NightMode", true);
                sharedPrefs.apply();
            }
        });

    }
}