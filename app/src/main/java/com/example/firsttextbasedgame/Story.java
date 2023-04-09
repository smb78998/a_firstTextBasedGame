package com.example.firsttextbasedgame;

public class Story {

    GameScreen gs;

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    public Story(GameScreen gs){ //make object of GameScreen , called gs

        this.gs = gs;

    }

    public void selectPosition(String Position){
        
    }

    public void startingPoint(){
        gs.text.setText("You are on the road. There is a wooden sign nearby.\n \nWhat will you do?");

        gs.button1.setText("Got north");
        gs.button2.setText("Got east");
        gs.button3.setText("Got west");
        gs.button4.setText("Read Sign");

        nextPosition1 = "monster";
        nextPosition2 = "sword";
        nextPosition3 = "pipe";
        nextPosition4 = "sign";
    }

    public void sign(){
        gs.text.setText("the sign says: ");

        gs.image.setImageResource(R.drawable.woodensign); //r is folder, drawble is folder, then sign is the sign picture
        gs.button1.setText("");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");

        nextPosition1 = "startingPoint";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";

    }
}
