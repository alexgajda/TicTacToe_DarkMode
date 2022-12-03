package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class giveNamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_names);

        //create vibrator
        Vibrator vib = (Vibrator)getSystemService(VIBRATOR_SERVICE);


        //back to main arrow
        ImageButton returnToMain =  findViewById(R.id.returnToMain2);
        returnToMain.setOnClickListener(v -> {
            //intent to MainActivity
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            //vibrate
            vib.vibrate(20);
            //animation
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        //initialize
        EditText name1 = findViewById(R.id.player1input);
        EditText name2 = findViewById(R.id.player2input);
        Button button = findViewById(R.id.playButton2);

        //button play
        button.setOnClickListener(v -> {
            //vibrate
            vib.vibrate(40);
            //gets text from user input
            String n1 = name1.getText().toString();
            String n2 = name2.getText().toString();
            //checks if user input is empty or has only spaces
            if (n1.isEmpty() || (n1.trim().length() == 0)){
                //sets n1 and n2
                n1 = "Player 1";
            }
            if ((n2.isEmpty()) || (n2.trim().length() == 0)){
                n2 = "Player 2";
            }
            //start activityGame with the user's input
            Intent intent = new Intent(giveNamesActivity.this, gameActivity.class);
            //gives users' name
            intent.putExtra("Player1", n1);
            intent.putExtra("Player2", n2);
            //starts activity
            startActivity(intent);
        });





    }


}