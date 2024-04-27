package com.example.myapplication.UI;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.example.myapplication.GameView;

public class GreenhousePopupObj {

    public int flowerWidth;
    public int flowerHeight;

    private float x;
    private float y;

    private boolean actionDown = false;

    public GameView gameView;

    private Bitmap tilemapImage;

    public int popupWidth, popupHeight = 0;
    public Paint popupPaint = new Paint();
    public int popupX, popupY = 0;

    public int flower1X, flower1Y = 0;
    public int flower2X, flower2Y = 0;
    public int flower3X, flower3Y = 0;
    public int flower4X, flower4Y = 0;
    public int flower5X, flower5Y = 0;

    //initialise
    public GreenhousePopupObj(GameView gameView) {
        this.gameView = gameView;

        popupWidth = 505;
        popupHeight = 105;
        popupPaint.setColor(Color.WHITE);
        //popup pos
        popupX = 1300;
        popupY = 800;

        flower1X = popupX + 5;
        flower1Y = popupY + 5;

        flower2X = flower1X + 100;
        flower2Y = flower1Y;

        flower3X = flower2X + 100;
        flower3Y = flower1Y;

        flower4X = flower3X + 100;
        flower4Y = flower1Y;

        flower5X = flower4X + 100;
        flower5Y = flower1Y;


    }


    public void draw(Canvas canvas, Bitmap tilemapImage) {

        ///
        canvas.drawRect(popupX,
                popupY,
                popupX + popupWidth,
                popupY + popupHeight,
                popupPaint);


        //1
        // Define the source rectangle (part of the tilemap you want to draw)
        Rect flower1Rect = new Rect(130, 950,260, 1065); // Entire tilemap

        // Define the destination rectangle based on this.x and this.y
        flowerWidth = 96; // Adjust this value according to your preference
        flowerHeight = 96; // Adjust this value according to your preference
        Rect flower1Pos = new Rect((int) this.flower1X, (int) this.flower1Y, (int) (this.flower1X + flowerWidth), (int) (this.flower1Y + flowerWidth));

        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, flower1Rect, flower1Pos, popupPaint);

        //2
        Rect flower2Rect = new Rect(260, 950,390, 1065);


        Rect flower2Pos = new Rect((int) this.flower2X, (int) this.flower2Y, (int) (this.flower2X + flowerWidth), (int) (this.flower2Y + flowerWidth));

        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, flower2Rect, flower2Pos, popupPaint);

        //3
        Rect flower3Rect = new Rect(390, 950,520, 1065);

        Rect flower3Pos = new Rect((int) this.flower3X, (int) this.flower3Y, (int) (this.flower3X + flowerWidth), (int) (this.flower3Y + flowerWidth));

        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, flower3Rect, flower3Pos, popupPaint);

        //4
        Rect flower4Rect = new Rect(790, 950,920, 1065);

        Rect flower4Pos = new Rect((int) this.flower4X, (int) this.flower4Y, (int) (this.flower4X + flowerWidth), (int) (this.flower4Y + flowerWidth));

        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, flower4Rect, flower4Pos, popupPaint);

        //5
        Rect flower5Rect = new Rect(920, 950,1060, 1065);

        Rect flower5Pos = new Rect((int) this.flower5X, (int) this.flower5Y, (int) (this.flower5X + flowerWidth), (int) (this.flower5Y + flowerWidth));

        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, flower5Rect, flower5Pos, popupPaint);

    }
    ////

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


