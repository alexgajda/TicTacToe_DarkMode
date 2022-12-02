package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vibrator vib = (Vibrator)getSystemService(VIBRATOR_SERVICE);

        //goes from main to names

        Button buttonGame = findViewById(R.id.playButton);
        buttonGame.setOnClickListener(v -> {
            vib.vibrate(40);

            Intent intent = new Intent(this,giveNamesActivity.class);
            startActivity(intent); //start the activity
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out); //animation
        });

        ImageView img = findViewById(R.id.github);
        img.setOnClickListener(v -> {
            vib.vibrate(40);
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/alexgajda/TicTacToe_DarkMode"));
            startActivity(intent2);
        });
    }
}