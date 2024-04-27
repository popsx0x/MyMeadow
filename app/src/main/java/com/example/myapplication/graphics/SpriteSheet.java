package com.example.myapplication.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

import com.example.myapplication.R;

public class SpriteSheet {

    private static final int SPRITE_WIDTH_PIXELS = 6;
    private static final int SPRITE_HEIGHT_PIXELS = 32;

    //private Bitmap bitmap;

    private Bitmap bitmapPlayer;
    private Bitmap bitmapOther;
    private Bitmap bitmapNew;

    private Bitmap greenhouse1Sheet;
    private Bitmap greenhouse2Sheet;
    private Bitmap greenhouse3Sheet;




    //constructor
    //bringing in tilesheet
    public SpriteSheet(Context context){
        BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();
        bitmapOptions.inScaled = false;

        //load player sprite sheet
        bitmapPlayer  = BitmapFactory.decodeResource(context.getResources(), R.drawable.gardening, bitmapOptions);

        bitmapOther = BitmapFactory.decodeResource(context.getResources(), R.drawable.tileset, bitmapOptions);

        bitmapNew = BitmapFactory.decodeResource(context.getResources(), R.drawable.tileset2, bitmapOptions);

        greenhouse1Sheet = BitmapFactory.decodeResource(context.getResources(), R.drawable.blue, bitmapOptions);
        greenhouse2Sheet = BitmapFactory.decodeResource(context.getResources(), R.drawable.shelf, bitmapOptions);
        greenhouse3Sheet = BitmapFactory.decodeResource(context.getResources(), R.drawable.flowerpots, bitmapOptions);
    }

    //GARDEN TILES
    public Sprite getGrassSprite(){
        return new Sprite(bitmapOther, new Rect(0, 0,32, 32));
        //return getSpriteByIndex(3, 0);
    }
    public Sprite getDirtSprite(){
        return new Sprite(bitmapOther, new Rect(0, 128,32, 160));
        //return getSpriteByIndex(1, 2);
    }
    public Sprite getCleanDirtSprite(){
        return new Sprite(bitmapOther, new Rect(0, 32,32, 64));
        //return getSpriteByIndex(1, 0);

    }
    public Sprite getFertilizedDirtSprite(){
        return new Sprite(bitmapOther, new Rect(96, 128,128, 160));
        //return getSpriteByIndex(1, 0);

    }
    public Sprite getGrow1Sprite(){
        return new Sprite(bitmapOther, new Rect(64, 32,96, 64));
        //return getSpriteByIndex(1, 4);
    }
    public Sprite getGrow2Sprite(){
        return new Sprite(bitmapOther, new Rect(96, 32,128, 64));
    }
    public Sprite getGrow3Sprite(){
        return new Sprite(bitmapOther, new Rect(128, 32,160, 64));
    }
    public Sprite getFlower1Sprite(){
        return new Sprite(bitmapOther, new Rect(0, 64,32, 96));
        //return getSpriteByIndex(1, 3);
    }
    public Sprite getFlower2Sprite(){
        return new Sprite(bitmapOther, new Rect(32, 64,64, 96));
    }
    public Sprite getFlower3Sprite(){
        return new Sprite(bitmapOther, new Rect(64, 64,96, 96));
    }
    public Sprite getFlower4Sprite(){
        return new Sprite(bitmapOther, new Rect(96, 64,128, 96));
    }
    public Sprite getFlower5Sprite(){
        return new Sprite(bitmapOther, new Rect(128, 64,160, 96));
    }

    //SELECTED GARDEN TILES

    public Sprite SelectedDirtSprite(){
        return new Sprite(bitmapNew, new Rect(0, 0,32, 32));
    }
    public Sprite SelectedCleanDirtSprite(){
        return new Sprite(bitmapOther, new Rect(32, 32,64, 64));
        //return getSpriteByIndex(1, 0);
    }
    public Sprite getSelectedFertilizedDirtSprite(){
        return new Sprite(bitmapOther, new Rect(64, 128,96, 160));
        //return getSpriteByIndex(1, 0);

    }
    public Sprite SelectedGrow1Sprite(){
        return new Sprite(bitmapNew, new Rect(32, 0,64, 32));
    }
    public Sprite SelectedGrow2Sprite(){
        return new Sprite(bitmapNew, new Rect(64, 0,96, 32));
    }
    public Sprite SelectedGrow3Sprite(){
        return new Sprite(bitmapNew, new Rect(96, 0,128, 32));
    }
    public Sprite SelectedFlower1Tile(){
        return new Sprite(bitmapNew, new Rect(0, 32,32, 64));
    }
    public Sprite SelectedFlower2Tile(){
        return new Sprite(bitmapNew, new Rect(32, 32,64, 64));
    }
    public Sprite SelectedFlower3Tile(){
        return new Sprite(bitmapNew, new Rect(64, 32,96, 64));
    }
    public Sprite SelectedFlower4Tile(){
        return new Sprite(bitmapNew, new Rect(96, 32,128, 64));
    }
    public Sprite SelectedFlower5Tile(){
        return new Sprite(bitmapNew, new Rect(128, 32,160, 64));
    }


    //GREENHOUSE TILES

    public Sprite getWallTile(){
        return new Sprite(greenhouse1Sheet, new Rect(0, 0,32, 32));
    }
    public Sprite getShelfTile(){
        return new Sprite(greenhouse2Sheet, new Rect(65, 192,96, 215));
    }

    public Sprite getPotTile(){
        return new Sprite(greenhouse3Sheet, new Rect(0, 156,48, 190));
    }

    //GROW 1
    public Sprite getGhGrow1(){
         return new Sprite(greenhouse3Sheet, new Rect(340, 200,380, 250));
     }

     //GROW 2
     //red
    public Sprite getGhFlower1Grow2(){
        return new Sprite(greenhouse3Sheet, new Rect(340, 250,380, 300));
    }
    //orange
    public Sprite getGhFlower2Grow2(){
        return new Sprite(greenhouse3Sheet, new Rect(0, 300,45, 345));
    }
    //yellow
    public Sprite getGhFlower3Grow2(){
        return new Sprite(greenhouse3Sheet, new Rect(45, 300,95, 345));
    }
    //purple
    public Sprite getGhFlower4Grow2(){
        return new Sprite(greenhouse3Sheet, new Rect(195, 300,240, 345));
    }
    //pink
    public Sprite getGhFlower5Grow2(){
        return new Sprite(greenhouse3Sheet, new Rect(240, 300,290, 345));
    }
    //GROW 3
    //red
    public Sprite getGhFlower1Grow3(){
        return new Sprite(greenhouse3Sheet, new Rect(190, 440,240, 490));
    }
    //orange
    public Sprite getGhFlower2Grow3(){
        return new Sprite(greenhouse3Sheet, new Rect(240, 440,290, 490));
    }
    //yellow
    public Sprite getGhFlower3Grow3(){
        return new Sprite(greenhouse3Sheet, new Rect(285, 440,335, 490));
    }
    //purple
    public Sprite getGhFlower4Grow3(){
        return new Sprite(greenhouse3Sheet, new Rect(335, 440,385, 490));
    }
    //pink
    public Sprite getGhFlower5Grow3(){
        return new Sprite(greenhouse3Sheet, new Rect(0, 375,45, 415));
    }
    //GROWN
    //red
    public Sprite ghFlower1(){
        return new Sprite(greenhouse3Sheet, new Rect(45, 350,100, 400));
    }
    //orange
    public Sprite ghFlower2(){
        return new Sprite(greenhouse3Sheet, new Rect(95, 350,145, 400));
    }
    //yellow
    public Sprite ghFlower3(){
        return new Sprite(greenhouse3Sheet, new Rect(140, 350,195, 400));
    }
    //purple
    public Sprite ghFlower4(){
        return new Sprite(greenhouse3Sheet, new Rect(285, 350,340, 400));
    }
    //pink
    public Sprite ghFlower5(){
        return new Sprite(greenhouse3Sheet, new Rect(335, 350,385, 400));
    }
    public Sprite geSelectedPotTile(){ return new Sprite(greenhouse3Sheet, new Rect(140, 155,190, 190));}

    private Sprite getSpriteByIndex(int idxRow, int idxCol) {
        return new Sprite(bitmapOther, new Rect(
                idxCol * SPRITE_WIDTH_PIXELS,
                idxRow * SPRITE_HEIGHT_PIXELS,
                (idxCol + 1) * SPRITE_WIDTH_PIXELS,
                (idxRow + 1) * SPRITE_HEIGHT_PIXELS
        ));
    }





}

