package com.example.myapplication.UI;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class DragObj {

    public boolean getActionDown;
    private float x, y;
    private boolean actionDown = false;
    private float originalX;
    private float originalY;

    public DragObj(int x, int y){
        this.x = x;
        this.y = y;
    }


    public void draw(Canvas canvas){
        Paint myPaint = new Paint();
        myPaint.setColor(Color.rgb(255,0,0));
        myPaint.setStrokeWidth(10);
        canvas.drawRect(x, y, x+200, y+200, myPaint);


    }

    public void setActionDown(boolean actionDown) {
        this.actionDown = actionDown;
    }

    public boolean getActionDown(){
        return actionDown;
    }

    public void setPosition(float x, float y) {
        //the -100 ensures the mouse stays in the middle of the square when being moved
        this.x = x -100;
        this.y = y -100;
    }

    public boolean isTouched(float x, float y) {
        boolean xInside = x > this.x && this.x < x + 200;
        boolean yInside = y > this.x && this.y < x + 200;
        return xInside && yInside;
    }
/*
    // Method to set the original position
    public void setOriginalPosition(float x, float y) {
        this.originalX = x;
        this.originalY = y;
    }

 */

    // Method to reset the position to the original one
    public void resetPosition() {
        this.x = 500;
        this.y = 500;
    }
}
