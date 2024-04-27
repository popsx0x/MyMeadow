package com.example.myapplication.UI;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.example.myapplication.GameView;

public class GardenButtonObj {

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
    public GardenButtonObj(GameView gameView, Bitmap tilemapImage, Context context) {
        this.gameView = gameView;
        this.context = context;

        this.tilemapImage = tilemapImage; // Pass the tilemap image to the constructor

        scenePaint.setColor(Color.BLUE);
        // pos
        this.x = 40;
        this.y = 35;


    }


    public void draw(Canvas canvas) {


        Rect gardenButton = new Rect(0, 2120,350, 2500); // Entire tilemap
        // Define the destination rectangle based on this.x and this.y
        int width = 80; // Adjust this value according to your preference
        int height = 100; // Adjust this value according to your preference
        Rect garden = new Rect((int) this.x, (int) this.y, (int) (this.x + width), (int) (this.y + height));

        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, gardenButton, garden, scenePaint);

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
