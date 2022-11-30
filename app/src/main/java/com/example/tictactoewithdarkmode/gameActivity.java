package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class gameActivity extends AppCompatActivity {

    private int num = 0;

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
        int scoreX = 0;
        int scoreO = 0;

        TextView sX = findViewById(R.id.playerXscore);
        TextView sY = findViewById(R.id.playerO_score);


        sX.setText(String.valueOf(scoreX));
        sY.setText(String.valueOf(scoreO));

        Button tl = findViewById(R.id.buttonTL);
        Button tm = findViewById(R.id.buttonTM);
        Button tr = findViewById(R.id.buttonTR);
        Button ml = findViewById(R.id.buttonML);
        Button mm = findViewById(R.id.buttonMM);
        Button mr = findViewById(R.id.buttonMR);
        Button bl = findViewById(R.id.buttonBL);
        Button bm = findViewById(R.id.buttonBM);
        Button br = findViewById(R.id.buttonBR);




            tl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((num % 2) == 0){
                        tl.setText("X");
                    }else{
                        tl.setText("O");
                    }
                    tl.setClickable(false);
                    num++;
                }
            });

            tm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((num % 2) == 0){
                        tm.setText("X");
                    }else{
                        tm.setText("O");
                    }
                    tm.setClickable(false);
                    num++;
                }
            });

            tr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((num % 2) == 0){
                        tr.setText("X");
                    }else{
                        tr.setText("O");
                    }
                    tr.setClickable(false);
                    num++;
                }
            });

            ml.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((num % 2) == 0){
                        ml.setText("X");
                    }else{
                        ml.setText("O");
                    }
                    ml.setClickable(false);
                    num++;
                }
            });

            mm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((num % 2) == 0){
                        mm.setText("X");
                    }else{
                        mm.setText("O");
                    }
                    mm.setClickable(false);
                    num++;
                }
            });

            mr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((num % 2) == 0){
                        mr.setText("X");
                    }else{
                        mr.setText("O");
                    }
                    mr.setClickable(false);
                    num++;
                }
            });

            bl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((num % 2) == 0){
                        bl.setText("X");
                    }else{
                        bl.setText("O");
                    }
                    bl.setClickable(false);
                    num++;
                }
            });

            bm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((num % 2) == 0){
                        bm.setText("X");
                    }else{
                        bm.setText("O");
                    }
                    bm.setClickable(false);
                    num++;
                }
            });

            br.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((num % 2) == 0){
                        br.setText("X");
                    }else{
                        br.setText("O");
                    }
                    br.setClickable(false);
                    num++;
                }
            });




        }
}