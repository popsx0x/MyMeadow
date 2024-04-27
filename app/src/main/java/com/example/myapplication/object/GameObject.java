package com.example.myapplication.object;

import android.graphics.Canvas;

import com.example.myapplication.GameDisplay;

//for each objects created
public abstract class GameObject {
    protected double positionX;
    protected double positionY;


    public GameObject(double positionX, double positionY){
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public abstract void draw(Canvas canvas, GameDisplay gameDisplay);
    public abstract void update();

    public double getPositionX() { return positionX; }
    public double getPositionY() { return positionY; }



}
