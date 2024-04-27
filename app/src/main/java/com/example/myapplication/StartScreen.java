package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class StartScreen extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.backround);
        mediaPlayer.start();
        //set an image for the background
        RelativeLayout background = new RelativeLayout(this);
        background.setBackgroundResource(R.drawable.bg2);

        // Create a Button dynamically
        Button myButton = new Button(this);

        // Set background image for the button
        Drawable buttonBackground = getResources().getDrawable(R.drawable.startbutton);
        myButton.setBackground(buttonBackground);

        // Set layout parameters to adjust the size of the button
        RelativeLayout.LayoutParams buttonParams = new RelativeLayout.LayoutParams(
                // Set width and height for the button
                350, // Width in pixels
                150  // Height in pixels
        );

        // Set the initial position (X and Y coordinates)
        buttonParams.leftMargin = 200; // Set the X coordinate
        buttonParams.topMargin = 200;  // Set the Y coordinate

        myButton.setLayoutParams(buttonParams);

        // Set an OnClickListener for the button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the MainActivity when the button is clicked
                startActivity(new Intent(StartScreen.this, MainActivity.class));
                MediaPlayer mediaPlayer = MediaPlayer.create(StartScreen.this, R.raw.select);
                mediaPlayer.start();
            }
        });

        //add button to background
        background.addView(myButton);
        //myButton.setLayoutParams(buttonParams);
        // Set the background as the content view
        setContentView(background);
    }
}







