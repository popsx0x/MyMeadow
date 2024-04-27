package com.example.myapplication.UI;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.example.myapplication.GameView;

public class AudioOffObj {

    private float x;
    private float y;

    private boolean actionDown = false;

    public GameView gameView;
    public Paint audioPaint = new Paint();

    private Bitmap tilemapImage;

    public int popupWidth, popupHeight = 0;
    public Paint popupPaint = new Paint();
    public int popupX, popupY = 0;

    //initialise
    public AudioOffObj(GameView gameView, Bitmap tilemapImage) {
        this.gameView = gameView;

        this.tilemapImage = tilemapImage; // Pass the tilemap image to the constructor

        audioPaint.setColor(Color.WHITE);
        // pos
        this.x = 140;
        this.y = 850;




    }


    public void draw(Canvas canvas) {

        // Define the source rectangle (part of the tilemap you want to draw)
        Rect srcRect = new Rect(25, 960, 125, 1090); // Entire tilemap

        // Define the destination rectangle based on this.x and this.y
        int desiredWidth = 50; // Adjust this value according to your preference
        int desiredHeight = 50; // Adjust this value according to your preference
        Rect dstRect = new Rect((int) this.x, (int) this.y, (int) (this.x + desiredWidth), (int) (this.y + desiredHeight));

        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, srcRect, dstRect, audioPaint);


    }

    public void setActionDown(boolean actionDown) {
        this.actionDown = actionDown;
    }

    public boolean getActionDown() {
        return actionDown;
    }

    public boolean isTouched(float x, float y) {
        boolean xInside = x > this.x && x < this.x + 100;
        boolean yInside = y > this.y && y < this.y + 100;
        return xInside && yInside;
    }

}


