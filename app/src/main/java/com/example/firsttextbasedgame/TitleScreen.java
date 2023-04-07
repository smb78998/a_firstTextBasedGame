package com.example.firsttextbasedgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class TitleScreen extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        //Button startB = (Button) findViewById(R.id.startButton);
        //startB.setText("Hello ");
    }

    public void goGameScreen(View view){
        //we want to move to game screen

        Intent gameScreen = new Intent(this, GameScreen.class);
        startActivity(gameScreen);
    }

}
