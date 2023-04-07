package com.example.firsttextbasedgame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class GameScreen extends AppCompatActivity{

    //initialize all components on the GameScreen Page
    ImageView image;
    TextView text;
    Button button1, button2, button3, button4 ;


    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        //Declare all coponents of the game screen page
        image = (ImageView) findViewById(R.id.gameImageView);
        text = (TextView)  findViewById(R.id.gameTextView);
        button1 = (Button) findViewById(R.id.choiceButton1);
        button2 = (Button) findViewById(R.id.choiceButton2);
        button3 = (Button) findViewById(R.id.choiceButton3);
        button4 = (Button) findViewById(R.id.choiceButton4);



    }
}
