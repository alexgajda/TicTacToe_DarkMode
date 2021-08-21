package com.example.tictactoewithdarkmode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class giveNamesActivity extends AppCompatActivity {

    String playerX, playerO;

    EditText playerX_input;
    EditText playerO_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_give_names);

        ImageButton returntomain = (ImageButton) findViewById(R.id.returnToMain2);
        returntomain.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        });

    }

    public void handleText(View v) {
        playerX_input = (EditText) findViewById(R.id.playerX_input);
        playerO_input = (EditText) findViewById(R.id.playerO_input);

        playerX = playerX_input.getText().toString();
        playerO = playerO_input.getText().toString();

        if (playerX.equals("")) {
            playerX = "Player X";
        }
        if (playerO.equals("")) {
            playerO = "Player O";
        }

        Intent intent = new Intent(giveNamesActivity.this, gameActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);

        Log.d("playerX:", playerX);
        Log.d("playerO:", playerO);

    }

    public String getPlayerX() {
        return playerX;
    }

    public String getPlayerO() {
        return playerO;
    }
}