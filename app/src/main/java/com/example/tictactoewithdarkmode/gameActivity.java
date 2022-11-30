package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

public class gameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

//        ImageButton returntomain = (ImageButton) findViewById(R.id.button_exit);
//        returntomain.setOnClickListener(v -> {
//            Intent intent = new Intent(this, MainActivity.class);
//            startActivity(intent);
//            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
//        });

        //intent of giveNames activity
        Intent intent = getIntent();
        String playerX = intent.getStringExtra("Playerx");
        String playerO = intent.getStringExtra("Playero");

        TextView textX = findViewById(R.id.playerX_text);
        TextView textO = findViewById(R.id.playerO_text);

        textX.setText(playerX);
        textO.setText(playerO);
        Log.d(playerO, "player 0: ");

        //Scoreboard
        //////initialize
        String scoreX = "0";
        String scoreO = "0";

        TextView sX = findViewById(R.id.playerXscore);
        TextView sY = findViewById(R.id.playerO_score);

        sX.setText(scoreX);
        sY.setText(scoreO);


    }
}