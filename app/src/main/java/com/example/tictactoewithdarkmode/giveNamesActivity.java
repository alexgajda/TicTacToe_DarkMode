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

        Vibrator vib = (Vibrator)getSystemService(VIBRATOR_SERVICE);


        //back to main arrow
        ImageButton returntomain =  findViewById(R.id.returnToMain2);
        returntomain.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            vib.vibrate(20);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

        EditText nameX = findViewById(R.id.playerX_input);
        EditText nameO = findViewById(R.id.playerO_input);
        Button button = findViewById(R.id.playButton2);

        button.setOnClickListener(v -> {
            vib.vibrate(40);
            String x = nameX.getText().toString();
            String O = nameO.getText().toString();
            if (x.isEmpty() || (x.trim().length() == 0)){
                x = "PlayerX";
            }
            if ((O.isEmpty()) || (O.trim().length() == 0)){
                O = "PlayerO";
            }
            Intent intent = new Intent(giveNamesActivity.this, gameActivity.class);
            intent.putExtra("Playerx", x);
            intent.putExtra("Playero", O);
            startActivity(intent);
        });





    }


}