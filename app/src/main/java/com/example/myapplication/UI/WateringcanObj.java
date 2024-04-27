package com.example.myapplication.UI;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.example.myapplication.GameView;

public class WateringcanObj {
    private float x;

    private boolean actionDown = false;

    private float y;
    public GameView gameView;
    public Paint dragPaint = new Paint();

    private Bitmap tilemapImage;

    //initialise
    public WateringcanObj(GameView gameView, Bitmap tilemapImage){
        this.gameView = gameView;

        this.tilemapImage = tilemapImage; // Pass the tilemap image to the constructor

        dragPaint.setColor(Color.BLUE);

        // pos
        this.x = 1930;
        this.y = 25;

    }


    public void draw(Canvas canvas){

        // Define the source rectangle (part of the tilemap you want to draw)
        Rect srcRect = new Rect(850, 0, 1200, 250); // Entire tilemap

        // Define the destination rectangle based on this.x and this.y
        int desiredWidth = 120; // Adjust this value according to your preference
        int desiredHeight = 100; // Adjust this value according to your preference
        Rect dstRect = new Rect((int) this.x, (int) this.y, (int) (this.x + desiredWidth), (int) (this.y + desiredHeight));


        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, srcRect, dstRect, dragPaint);

}
    public void setActionDown(boolean actionDown) {
        this.actionDown = actionDown;
    }

    public boolean getActionDown(){
        return actionDown;
    }

    public void setPosition(float x, float y) {
        //the -100 ensures the mouse stays in the middle of the square when being moved
        this.x = x -100 ;
        this.y = y -100;
    }

    public boolean isTouched(float x, float y) {
        boolean xInside = x > this.x && x < this.x + 100;
        boolean yInside = y > this.y && y < this.y + 100;
        return xInside && yInside;
    }

    // Method to reset the position to the original one
    public void resetPosition() {
        this.x = 1930;
        this.y = 25;
    }

}
