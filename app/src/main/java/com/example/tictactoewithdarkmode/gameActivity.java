package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class gameActivity extends AppCompatActivity {

    //initialize
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
    private TextView s1;
    private TextView s2;

    @Override
    //if the back arrow from navigation bar of the phone is pressed
    public void onBackPressed() {
        //makes alert
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", (dialog, id) -> {
                    Intent intent = new Intent(gameActivity.this, MainActivity.class);
                    startActivity(intent);
                })
                .setNegativeButton("No", null)
                .show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        playAgain = findViewById(R.id.playAgainButton);

        //intent of giveNames activity
        Intent intent = getIntent();
        //gets users' input from giveNamesActivity
        String player1 = intent.getStringExtra("Player1");
        String player2 = intent.getStringExtra("Player2");

        //create Textview
        TextView text1 = findViewById(R.id.player1_text);
        TextView text2 = findViewById(R.id.player2_text);

        //set the two Textview to the users' input
        text1.setText(player1);
        text2.setText(player2);


        ///////////////initialize
        //vibrator
        Vibrator vib = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        //creates scoreboard
        s1 = findViewById(R.id.player1score);
        s2 = findViewById(R.id.player2score);

        //initializes score to 0
        s1.setText(String.valueOf(scoreX));
        s2.setText(String.valueOf(scoreO));

        //creates buttons
        tl = findViewById(R.id.buttonTL);
        tm = findViewById(R.id.buttonTM);
        tr = findViewById(R.id.buttonTR);
        ml = findViewById(R.id.buttonML);
        mm = findViewById(R.id.buttonMM);
        mr = findViewById(R.id.buttonMR);
        bl = findViewById(R.id.buttonBL);
        bm = findViewById(R.id.buttonBM);
        br = findViewById(R.id.buttonBR);

        //upper back arrow that returns to main
        ImageButton returnToMain = findViewById(R.id.button_exit);
        returnToMain.setOnClickListener(v -> {
            //vibrates
            vib.vibrate(60);
            //Alert (YES / NO)
            new AlertDialog.Builder(this)
                    .setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", (dialog, id) -> {
                       Intent intent1 = new Intent(gameActivity.this, MainActivity.class);
                       startActivity(intent1);
                    })
                    .setNegativeButton("No", null)
                    .show();
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });



            tl.setOnClickListener(view -> {
                printChar(tl);
                tl.setClickable(false);
                num++;
                vib.vibrate(50);
                checkWin();
            });


            tm.setOnClickListener(view -> {
                printChar(tm);
                tm.setClickable(false);
                num++;
                vib.vibrate(50);
                checkWin();
            });



            tr.setOnClickListener(view -> {
                printChar(tr);
                tr.setClickable(false);
                num++;
                vib.vibrate(50);
                checkWin();
            });

            ml.setOnClickListener(view -> {
                printChar(ml);
                ml.setClickable(false);
                vib.vibrate(50);
                num++;
                checkWin();
            });

            mm.setOnClickListener(view -> {
                printChar(mm);
                mm.setClickable(false);
                vib.vibrate(50);
                num++;
                checkWin();
            });

            mr.setOnClickListener(view -> {
                printChar(mr);
                mr.setClickable(false);
                vib.vibrate(50);
                num++;
                checkWin();
            });

            bl.setOnClickListener(view -> {
                printChar(bl);
                bl.setClickable(false);
                vib.vibrate(50);
                num++;
                checkWin();
            });

            bm.setOnClickListener(view -> {
                printChar(bm);
                bm.setClickable(false);
                vib.vibrate(50);
                num++;
                checkWin();
            });

            br.setOnClickListener(view -> {
                printChar(br);
                br.setClickable(false);
                vib.vibrate(50);
                num++;
                checkWin();
            });
        }

        //print x or y to textview
        void printChar(Button but){
            if ((num % 2) == 0){
                but.setText("X");
            }else{
                but.setText("O");
            }
        }

    //checks if someone won
    private void checkWin() {
        //creates vibrator
        Vibrator vib = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        //boolean if 1 of bellow statements came true
        boolean didWin = false;
        if (tl.getText().equals("X") && tm.getText().equals("X") && tr.getText().equals("X")) {
            num = 9;
            didWin = true;
            //sets 3 buttons that won text to red
            s1.setText(String.valueOf(++scoreX));
            tl.setTextColor(Color.RED);
            tm.setTextColor(Color.RED);
            tr.setTextColor(Color.RED);
        } else if (tl.getText().equals("O") && tm.getText().equals("O") && tr.getText().equals("O")) {
            num = 9;
            didWin = true;
            tl.setTextColor(Color.RED);
            tm.setTextColor(Color.RED);
            tr.setTextColor(Color.RED);
            s2.setText(String.valueOf(++scoreO));
        } else if (tr.getText().equals("X") && mr.getText().equals("X") && br.getText().equals("X")) {
            num = 9;
            didWin = true;
            tr.setTextColor(Color.RED);
            mr.setTextColor(Color.RED);
            br.setTextColor(Color.RED);
            s1.setText(String.valueOf(++scoreX));
        } else if (tr.getText().equals("O") && mr.getText().equals("O") && br.getText().equals("O")) {
            num = 9;
            didWin = true;
            tr.setTextColor(Color.RED);
            mr.setTextColor(Color.RED);
            br.setTextColor(Color.RED);
            s2.setText(String.valueOf(++scoreO));
        } else if (tr.getText().equals("X") && mm.getText().equals("X") && bl.getText().equals("X")) {
            num = 9;
            didWin = true;
            tr.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            s1.setText(String.valueOf(++scoreX));
        } else if (tr.getText().equals("O") && mm.getText().equals("O") && bl.getText().equals("O")) {
            num = 9;
            didWin = true;
            tr.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            s2.setText(String.valueOf(++scoreO));
        } else if (tl.getText().equals("X") && ml.getText().equals("X") && bl.getText().equals("X")) {
            num = 9;
            didWin = true;
            tl.setTextColor(Color.RED);
            ml.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            s1.setText(String.valueOf(++scoreX));
        } else if (tl.getText().equals("O") && ml.getText().equals("O") && bl.getText().equals("O")) {
            num = 9;
            didWin = true;
            tl.setTextColor(Color.RED);
            ml.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            s2.setText(String.valueOf(++scoreO));
        } else if (br.getText().equals("X") && bm.getText().equals("X") && bl.getText().equals("X")) {
            num = 9;
            didWin = true;
            br.setTextColor(Color.RED);
            bm.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            s1.setText(String.valueOf(++scoreX));
        } else if (br.getText().equals("O") && bm.getText().equals("O") && bl.getText().equals("O")) {
            num = 9;
            didWin = true;
            br.setTextColor(Color.RED);
            bm.setTextColor(Color.RED);
            bl.setTextColor(Color.RED);
            s2.setText(String.valueOf(++scoreO));
        } else if (tl.getText().equals("X") && mm.getText().equals("X") && br.getText().equals("X")) {
            num = 9;
            didWin = true;
            tl.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            br.setTextColor(Color.RED);
            s1.setText(String.valueOf(++scoreX));
        } else if (tl.getText().equals("O") && mm.getText().equals("O") && br.getText().equals("O")) {
            num = 9;
            didWin = true;
            tl.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            br.setTextColor(Color.RED);
            s2.setText(String.valueOf(++scoreO));
        } else if (ml.getText().equals("X") && mm.getText().equals("X") && mr.getText().equals("X")) {
            num = 9;
            didWin = true;
            ml.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            mr.setTextColor(Color.RED);
            s1.setText(String.valueOf(++scoreX));
        } else if (ml.getText().equals("O") && mm.getText().equals("O") && mr.getText().equals("O")) {
            num = 9;
            didWin = true;
            ml.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            mr.setTextColor(Color.RED);
            s2.setText(String.valueOf(++scoreO));
        } else if (tm.getText().equals("X") && mm.getText().equals("X") && bm.getText().equals("X")) {
            num = 9;
            didWin = true;
            tm.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            bm.setTextColor(Color.RED);
            s1.setText(String.valueOf(++scoreX));
        } else if (tm.getText().equals("O") && mm.getText().equals("O") && bm.getText().equals("O")) {
            num = 9;
            didWin = true;
            tm.setTextColor(Color.RED);
            mm.setTextColor(Color.RED);
            bm.setTextColor(Color.RED);
            s2.setText(String.valueOf(++scoreO));
        }

        //if someone won
        if (didWin){
            //big vibration
            vib.vibrate(160);
            //sets all buttons not clickable
            tl.setClickable(false);
            tm.setClickable(false);
            tr.setClickable(false);
            ml.setClickable(false);
            mm.setClickable(false);
            mr.setClickable(false);
            bl.setClickable(false);
            bm.setClickable(false);
            br.setClickable(false);
        }


        //when the round ends
        if (num == 9){
            //makes the play again Button Visible and Clickable
            playAgain.setVisibility(View.VISIBLE);
            playAgain.setClickable(true);
            //when the Play again Button is pressed
            playAgain.setOnClickListener(v -> {
                vib.vibrate(60);
                num = 0;
                //empty all buttons' text
                tl.setText("");
                tm.setText("");
                tr.setText("");
                ml.setText("");
                mm.setText("");
                mr.setText("");
                bl.setText("");
                bm.setText("");
                br.setText("");
                //sets all the Buttons to clickable
                tl.setClickable(true);
                tm.setClickable(true);
                tr.setClickable(true);
                ml.setClickable(true);
                mm.setClickable(true);
                mr.setClickable(true);
                bl.setClickable(true);
                bm.setClickable(true);
                br.setClickable(true);
                //sets all the Buttons' text to green
                tr.setTextColor(getResources().getColor((R.color.green)));
                tm.setTextColor(getResources().getColor((R.color.green)));
                tl.setTextColor(getResources().getColor((R.color.green)));
                ml.setTextColor(getResources().getColor((R.color.green)));
                mm.setTextColor(getResources().getColor((R.color.green)));
                mr.setTextColor(getResources().getColor((R.color.green)));
                bl.setTextColor(getResources().getColor((R.color.green)));
                bm.setTextColor(getResources().getColor((R.color.green)));
                br.setTextColor(getResources().getColor((R.color.green)));
                //make Play again button Invisible again
                playAgain.setVisibility(View.INVISIBLE);
                playAgain.setClickable(false);
            });
        }

    }


}