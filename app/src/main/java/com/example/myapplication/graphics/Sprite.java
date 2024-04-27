package com.example.myapplication.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Sprite {

    //private final SpriteSheet spriteSheet;

    private boolean actionDown = false;
    private final Bitmap bitmap;
    private final Rect rect;
    private int x;
    private int y;


    //public Sprite(SpriteSheet spriteSheet, Rect rect) {
    public Sprite(Bitmap bitmap, Rect rect) {
        this.bitmap = bitmap;
        //this.spriteSheet = spriteSheet;
        this.rect = rect;

        this.x = 0;
        this.y = 0;
    }

    public void draw(Canvas canvas, int x, int y) {
        canvas.drawBitmap(
                //spriteSheet.getBitmap(),
                bitmap,
                rect,
                new Rect(x,y, x+100, y+100),
                null
        );
    }

    public boolean isTouched(float x, float y) {
        // Check if the touch coordinates are within the sprite's bounds
        return x >= this.x && x <= this.x + rect.width() &&
                y >= this.y && y <= this.y + rect.height();
    }

    public void setActionDown(boolean actionDown) {
        this.actionDown = actionDown;
    }

    public boolean getActionDown(){
        return actionDown;
    }

    public void setPosition(int x, int y) {
        // Set the position of the sprite
        this.x = x;
        this.y = y;
    }

    public void draw(Canvas canvas) {
    }


    //public int getHeight() {
        //return rect.height();
    //}

    //public int getWidth() {
        //return rect.width();
    //}
}
