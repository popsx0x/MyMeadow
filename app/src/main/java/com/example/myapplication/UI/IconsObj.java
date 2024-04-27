package com.example.myapplication.UI;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;

import com.example.myapplication.GameView;

public class IconsObj {

    public int iconWidth;
    public int iconHeight;

    public int bgWidth;
    public int bgHeight;
    private float x;
    private float y;

    private boolean actionDown = false;

    public GameView gameView;

    private Bitmap tilemapImage;

    public int popupWidth, popupHeight = 0;
    public Paint popupPaint = new Paint();
    public int popupX, popupY = 0;

    public int bgX, bgY = 0;
    public int flowerpotX, flowerpotY = 0;
    public int fenceX, fenceY = 0;
    public int shovelX, shovelY = 0;
    public int sprayX, sprayY = 0;
    public int waterX, waterY = 0;
    public int seedX, seedY = 0;

    //initialise
    public IconsObj(GameView gameView) {
        this.gameView = gameView;


        popupWidth = 1000;
        popupHeight = 600;
        popupPaint.setColor(Color.WHITE);
        //popup pos
        popupX = 150;
        popupY = 100;

        bgX = 150;
        bgY = 100;

        flowerpotX = popupX + 5;
        flowerpotY = popupY + 5;

        fenceX = flowerpotX;
        fenceY = flowerpotY+ 100;

        shovelX = flowerpotX;
        shovelY = fenceY+ 100;

        sprayX = flowerpotX;
        sprayY = shovelY + 100;

        waterX = flowerpotX;
        waterY = sprayY + 100;

        seedX = flowerpotX;
        seedY = waterY + 100;


    }


    public void draw(Canvas canvas, Bitmap tilemapImage) {

        ///
        canvas.drawRect(popupX,
                popupY,
                popupX + popupWidth,
                popupY + popupHeight,
                popupPaint);

        Paint textPaint = new Paint();
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(30f);

        // Define the source rectangle (part of the tilemap you want to draw)
        Rect bgPos = new Rect(980, 1000,200, 500); // Entire tilemap
        // Define the destination rectangle based on this.x and this.y
        bgWidth = 900; // Adjust this value according to your preference
        bgHeight = 700; // Adjust this value according to your preference
        Rect bgRect = new Rect((int) this.bgX, (int) this.bgY, (int) (this.bgX + bgWidth), (int) (this.bgY + bgHeight));
        canvas.drawBitmap(tilemapImage, bgRect, bgPos, popupPaint);



        //flowerpot icon
        // Define the source rectangle (part of the tilemap you want to draw)
        Rect flowerpotRect = new Rect(600, 0,840, 195); // Entire tilemap
        // Define the destination rectangle based on this.x and this.y
        iconWidth = 75; // Adjust this value according to your preference
        iconHeight = 85; // Adjust this value according to your preference
        Rect flowerpotPos = new Rect((int) this.flowerpotX, (int) this.flowerpotY, (int) (this.flowerpotX + iconWidth), (int) (this.flowerpotY + iconHeight));
        canvas.drawText("Click on this flowerpot in the garden to go to your greenhouse!", flowerpotX + 100, flowerpotY + iconHeight /2 +10, textPaint);
        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, flowerpotRect, flowerpotPos, popupPaint);

        //fence icon
        Rect fenceRect = new Rect(0, 2120,350, 2480);
        Rect fencePos = new Rect((int) this.fenceX, (int) this.fenceY, (int) (this.fenceX + iconWidth), (int) (this.fenceY + iconHeight));
        canvas.drawText("Click on this fence in the greenhouse to go to your garden!", fenceX + 100, fenceY + iconHeight /2, textPaint);
        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, fenceRect, fencePos, popupPaint);

        //shovel icon
        Rect shovelRect = new Rect(1160, 0,1450, 270);
        Rect shovelPos = new Rect((int) this.shovelX, (int) this.shovelY, (int) (this.shovelX + iconWidth), (int) (this.shovelY + iconHeight));
        canvas.drawText("Use this spade to clean dirt!", shovelX + 100, shovelY + iconHeight /2, textPaint);
        canvas.drawText("Select a section of dirt and hover the spade over.", shovelX + 100, shovelY + iconHeight /2 + 40, textPaint);
        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, shovelRect, shovelPos, popupPaint);

        //fertilizer icon
        Rect sprayRect = new Rect(980, 300,1165, 590);
        Rect sprayPos = new Rect((int) this.sprayX, (int) this.sprayY, (int) (this.sprayX + iconWidth), (int) (this.sprayY + iconHeight));
        canvas.drawText("Use this fertilizer to get the clean dirt ready for planting!", sprayX + 100, sprayY + iconHeight /2, textPaint);
        canvas.drawText("Select a section of clean dirt and hover the fertilizer over.", sprayX + 100, sprayY + iconHeight /2 + 40, textPaint);
        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, sprayRect, sprayPos, popupPaint);

        //watering can icon
        Rect waterRect = new Rect(840, 0,1195, 275);
        Rect waterPos = new Rect((int) this.waterX, (int) this.waterY, (int) (this.waterX + iconWidth), (int) (this.waterY + iconHeight));
        canvas.drawText("Use this watering can to grow the flowers!", waterX + 100, waterY + iconHeight /2, textPaint);
        canvas.drawText("Select one of the growing flowers and hover the water over.", waterX + 100, waterY + iconHeight /2 + 40, textPaint);
        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, waterRect, waterPos, popupPaint);

        //seed icon
        Rect seedRect = new Rect(1970, 240, 2110, 450);
        Rect seedPos = new Rect((int) this.seedX, (int) this.seedY, (int) (this.seedX + iconWidth), (int) (this.seedY + iconHeight));
        canvas.drawText("Click on this seed to choose a flower to plant!", seedX + 100, seedY + iconHeight /2, textPaint);
        canvas.drawText("Select a section of fertilized dirt and select a flower from the popup.", seedX + 100, seedY + iconHeight /2 + 40, textPaint);
        // Draw the specified part of the tilemap on the canvas
        canvas.drawBitmap(tilemapImage, seedRect, seedPos, popupPaint);

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


