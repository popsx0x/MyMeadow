package com.example.myapplication;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set content view to gameView, so objects in the gameView class can be rendered to the screen
        gameView = new GameView(this);
        setContentView(gameView);
    }


}

