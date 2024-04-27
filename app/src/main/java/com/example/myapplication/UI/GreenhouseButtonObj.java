package com.example.myapplication.UI;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.example.myapplication.GameView;

public class GreenhouseButtonObj {

    private float x;
    private float y;

    private boolean actionDown = false;

    public GameView gameView;

    private Context context;
    private Bitmap tilemapImage;

    public int greenhouseWidth, greenhouseHeight = 0;
    public Paint scenePaint = new Paint();
    public int greenhouseX, greenhouseY = 0;

    //initialise
    public GreenhouseButtonObj(GameView gameView, Bitmap tilemapImage, Context context) {
        this.gameView = gameView;
        this.context = context;

        this.tilemapImage = tilemapImage; // Pass the tilemap image to the constructor

        scenePaint.setColor(Color.BLUE);
        // pos
        this.x = 25;
        this.y = 25;


    }


    public void draw(Canvas canvas) {

        // Define the source rectangle (part of the tilemap you want to draw)
        Rect greenhouseButton = new Rect(570, 0,800, 190); // Entire tilemap
        // Define the destination rectangle based on this.x and this.y
        int ghWidth = 100; // Adjust this value according to your preference
        int ghHeight = 100; // Adjust this value according to your preference
        Rect greenhouse = new Rect((int) this.x, (int) this.y, (int) (this.x + ghWidth), (int) (this.y + ghHeight));

        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, greenhouseButton, greenhouse, scenePaint);

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
