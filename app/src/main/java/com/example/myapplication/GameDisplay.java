package com.example.myapplication;

import android.graphics.Rect;

import com.example.myapplication.object.GameObject;

public class GameDisplay {


    public final Rect GH_RECT;
    public final Rect DISPLAY_RECT;
    private final int heightPixels;
    private final int widthPixels;
    private double gameToDisplayCoordinatesOffsetX;
    private double gameToDisplayCoordinatesOffsetY;
    private double displayCenterX;
    private double displayCenterY;
    private double gameCenterX;
    private double gameCenterY;
    private GameObject centerObject;


    //display area of game
    //public GameDisplay(int widthPixels, int heightPixels, GameObject centerObject){
    public GameDisplay(int widthPixels, int heightPixels){
        //height and width of display area
        this.widthPixels = widthPixels;
        this.heightPixels = heightPixels;
        int ghWidth = this.widthPixels;
        int ghHeight = this.heightPixels;

        DISPLAY_RECT = new Rect(0,0, widthPixels, heightPixels);
        GH_RECT = new Rect(0,0, ghWidth, ghHeight);

        //this.centerObject = centerObject;

        //converts game world coordinates to display coordinates based on the center of the display
        //displayCenterX = widthPixels/2.0;
        //displayCenterY = heightPixels/2.0;

    }

    public void update(){

        //coordinates of the center of the game world
        //gameCenterX = centerObject.getPositionX();
        //gameCenterY = centerObject.getPositionY();

        //updates the display based on the position of center object
        //gameToDisplayCoordinatesOffsetX = displayCenterX - gameCenterX;
        //gameToDisplayCoordinatesOffsetY = displayCenterY - gameCenterY;
    }

    /*
    public double gameToDisplayCoordinatesX(double x){
        return x + gameToDisplayCoordinatesOffsetX;
    }

    public double gameToDisplayCoordinatesY(double y){
        return y + gameToDisplayCoordinatesOffsetY;
    }
/*
    public Rect getGameRect() {
        return new Rect(
                (int)(gameCenterX - widthPixels/2),
                (int)(gameCenterY - heightPixels/2),
                (int)(gameCenterX + widthPixels/2),
                (int)(gameCenterY + heightPixels/2)
        );


     */


    public Rect getGameRect() {
        return new Rect(
                (int)(0),
                (int)(0),
                (int)(widthPixels),
                (int)(heightPixels)
        );
    }




}


