package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class gameActivity extends AppCompatActivity {

    private int num = 0;
    private int scoreX = 0;
    private int scoreO = 0;
    private Button tl;
    private Button tm;
    private Button tr;
    private Button ml;
    private Button mm;
    private Button mr;
    private Button bl;
    private Button bm;
    private Button br;
    private Button playAgain;
    private TextView sX;
    private TextView sY;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageButton returntomain = findViewById(R.id.button_exit);
        returntomain.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        playAgain = findViewById(R.id.playAgainButton);

        //intent of giveNames activity
        Intent intent = getIntent();
        String playerX = intent.getStringExtra("Playerx");
        String playerO = intent.getStringExtra("Playero");

        TextView textX = findViewById(R.id.playerX_text);
        TextView textO = findViewById(R.id.playerO_text);

        textX.setText(playerX);
        textO.setText(playerO);


        ///////////////initialize
        sX = findViewById(R.id.playerXscore);
        sY = findViewById(R.id.playerO_score);


        sX.setText(String.valueOf(scoreX));
        sY.setText(String.valueOf(scoreO));

        tl = findViewById(R.id.buttonTL);
        tm = findViewById(R.id.buttonTM);
        tr = findViewById(R.id.buttonTR);
        ml = findViewById(R.id.buttonML);
        mm = findViewById(R.id.buttonMM);
        mr = findViewById(R.id.buttonMR);
        bl = findViewById(R.id.buttonBL);
        bm = findViewById(R.id.buttonBM);
        br = findViewById(R.id.buttonBR);



            tl.setOnClickListener(view -> {
                if ((num % 2) == 0){
                    tl.setText("X");
                }else{
                    tl.setText("O");
                }
                tl.setClickable(false);
                num++;
                checkWin();
            });


            tm.setOnClickListener(view -> {
                                      if ((num % 2) == 0) {
                                          tm.setText("X");
                                      } else {
                                          tm.setText("O");
                                      }
                                      tm.setClickable(false);
                                      num++;
                                      checkWin();
                                  });



            tr.setOnClickListener(view -> {
                if ((num % 2) == 0){
                    tr.setText("X");
                }else{
                    tr.setText("O");
                }
                tr.setClickable(false);
                num++;
                checkWin();
            });

            ml.setOnClickListener(view -> {
                if ((num % 2) == 0){
                    ml.setText("X");
                }else{
                    ml.setText("O");
                }
                ml.setClickable(false);
                num++;
                checkWin();
            });

            mm.setOnClickListener(view -> {
                if ((num % 2) == 0){
                    mm.setText("X");
                }else{
                    mm.setText("O");
                }
                mm.setClickable(false);
                num++;
                checkWin();
            });

            mr.setOnClickListener(view -> {
                if ((num % 2) == 0){
                    mr.setText("X");
                }else{
                    mr.setText("O");
                }
                mr.setClickable(false);
                num++;
                checkWin();
            });

            bl.setOnClickListener(view -> {
                if ((num % 2) == 0){
                    bl.setText("X");
                }else{
                    bl.setText("O");
                }
                bl.setClickable(false);
                num++;
                checkWin();
            });

            bm.setOnClickListener(view -> {
                if ((num % 2) == 0){
                    bm.setText("X");
                }else{
                    bm.setText("O");
                }
                bm.setClickable(false);
                num++;
                checkWin();
            });

            br.setOnClickListener(view -> {
                if ((num % 2) == 0){
                    br.setText("X");
                }else{
                    br.setText("O");
                }
                br.setClickable(false);
                num++;
                checkWin();
            });
        }

    private void checkWin() {
        if (tl.getText().equals("X") && tm.getText().equals("X") && tr.getText().equals("X")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            sX.setText(String.valueOf(++scoreX));
            tl.setTextColor(Color.RED);
            tm.setTextColor(Color.RED);
            tr.setTextColor(Color.RED);
        } else if (tl.getText().equals("O") && tm.getText().equals("O") && tr.getText().equals("O")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tl.setTextColor(Color.RED);
            tm.setTextColor(Color.RED);
            tr.setTextColor(Color.RED);
            sY.setText(String.valueOf(++scoreO));
        } else if (tr.getText().equals("X") && mr.getText().equals("X") && br.getText().equals("X")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tr.setTextColor(Color.RED);
            mr.setTextColor(Color.RED);
            br.setTextColor(Color.RED);
            sX.setText(String.valueOf(++scoreX));
        } else if (tr.getText().equals("O") && mr.getText().equals("O") && br.getText().equals("O")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tr.setTextColor(Color.RED);
            mr.setTextColor(Color.RED);
            br.setTextColor(Color.RED);
            sY.setText(String.valueOf(++scoreO));
        } else if (tr.getText().equals("X") && mm.getText().equals("X") && bl.getText().equals("X")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tr.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            sX.setText(String.valueOf(++scoreX));
        } else if (tr.getText().equals("O") && mm.getText().equals("O") && bl.getText().equals("O")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tr.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            sY.setText(String.valueOf(++scoreO));
        } else if (tl.getText().equals("X") && ml.getText().equals("X") && bl.getText().equals("X")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tl.setTextColor(Color.RED);
            ml.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            sX.setText(String.valueOf(++scoreX));
        } else if (tl.getText().equals("O") && ml.getText().equals("O") && bl.getText().equals("O")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tl.setTextColor(Color.RED);
            ml.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            sY.setText(String.valueOf(++scoreO));
        } else if (br.getText().equals("X") && bm.getText().equals("X") && bl.getText().equals("X")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            br.setTextColor(Color.RED);
            bm.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            sX.setText(String.valueOf(++scoreX));
        } else if (br.getText().equals("O") && bm.getText().equals("O") && bl.getText().equals("O")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            br.setTextColor(Color.RED);
            bm.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            sY.setText(String.valueOf(++scoreO));
        } else if (tl.getText().equals("X") && mm.getText().equals("X") && br.getText().equals("X")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tl.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            br.setTextColor(Color.RED);
            sX.setText(String.valueOf(++scoreX));
        } else if (tl.getText().equals("O") && mm.getText().equals("O") && br.getText().equals("O")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tl.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            br.setTextColor(Color.RED);
            sY.setText(String.valueOf(++scoreO));
        } else if (ml.getText().equals("X") && mm.getText().equals("X") && mr.getText().equals("X")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            ml.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            mr.setTextColor(Color.RED);
            sX.setText(String.valueOf(++scoreX));
        } else if (ml.getText().equals("O") && mm.getText().equals("O") && mr.getText().equals("O")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            ml.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            mr.setTextColor(Color.RED);
            sY.setText(String.valueOf(++scoreO));
        } else if (tm.getText().equals("X") && mm.getText().equals("X") && bm.getText().equals("X")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tm.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            bm.setTextColor(Color.RED);
            sX.setText(String.valueOf(++scoreX));
        } else if (tm.getText().equals("O") && mm.getText().equals("O") && bm.getText().equals("O")) {
            num = 9;
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
            tm.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            bm.setTextColor(Color.RED);
            sY.setText(String.valueOf(++scoreO));
        }



        if (num == 9){
            playAgain.setVisibility(View.VISIBLE);
            playAgain.setClickable(true);
            playAgain.setOnClickListener(v -> {
                num = 0;
                tl.setText("");
                tm.setText("");
                tr.setText("");
                ml.setText("");
                mm.setText("");
                mr.setText("");
                bl.setText("");
                bm.setText("");
                br.setText("");
                tl.setClickable(true);
                tm.setClickable(true);
                tr.setClickable(true);
                ml.setClickable(true);
                mm.setClickable(true);
                mr.setClickable(true);
                bl.setClickable(true);
                bm.setClickable(true);
                br.setClickable(true);
                tr.setTextColor(getResources().getColor((R.color.green)));
                tm.setTextColor(getResources().getColor((R.color.green)));
                tl.setTextColor(getResources().getColor((R.color.green)));
                ml.setTextColor(getResources().getColor((R.color.green)));
                mm.setTextColor(getResources().getColor((R.color.green)));
                mr.setTextColor(getResources().getColor((R.color.green)));
                bl.setTextColor(getResources().getColor((R.color.green)));
                bm.setTextColor(getResources().getColor((R.color.green)));
                br.setTextColor(getResources().getColor((R.color.green)));
                playAgain.setVisibility(View.INVISIBLE);
                playAgain.setClickable(false);
            });
        }

    }


}