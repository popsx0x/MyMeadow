package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;


import com.example.myapplication.UI.AudioOffObj;
import com.example.myapplication.UI.AudioOnObj;
import com.example.myapplication.UI.GardenButtonObj;
import com.example.myapplication.UI.GreenhouseButtonObj;
import com.example.myapplication.UI.GreenhousePopupObj;
import com.example.myapplication.UI.HelpObj;
import com.example.myapplication.UI.IconsObj;
import com.example.myapplication.UI.PopupObj;
import com.example.myapplication.UI.ShovelObj;
import com.example.myapplication.UI.SpraylObj;
import com.example.myapplication.UI.WateringcanObj;
import com.example.myapplication.UI.SeedObj;
import com.example.myapplication.graphics.FertilisedDirtTile;
import com.example.myapplication.graphics.Flower2Grow1Tile;
import com.example.myapplication.graphics.Flower2Grow2Tile;
import com.example.myapplication.graphics.Flower2Grow3Tile;
import com.example.myapplication.graphics.Flower3Grow1Tile;
import com.example.myapplication.graphics.Flower3Grow2Tile;
import com.example.myapplication.graphics.Flower3Grow3Tile;
import com.example.myapplication.graphics.Flower4Grow1Tile;
import com.example.myapplication.graphics.Flower4Grow2Tile;
import com.example.myapplication.graphics.Flower4Grow3Tile;
import com.example.myapplication.graphics.Flower5Grow1Tile;
import com.example.myapplication.graphics.Flower5Grow2Tile;
import com.example.myapplication.graphics.Flower5Grow3Tile;
import com.example.myapplication.graphics.GhFlower1Grow1Tile;
import com.example.myapplication.graphics.GhFlower1Grow2Tile;
import com.example.myapplication.graphics.GhFlower1Grow3Tile;
import com.example.myapplication.graphics.GhFlower1Tile;
import com.example.myapplication.graphics.GhFlower2Grow1Tile;
import com.example.myapplication.graphics.GhFlower2Grow2Tile;
import com.example.myapplication.graphics.GhFlower2Grow3Tile;
import com.example.myapplication.graphics.GhFlower2Tile;
import com.example.myapplication.graphics.GhFlower3Grow1Tile;
import com.example.myapplication.graphics.GhFlower3Grow2Tile;
import com.example.myapplication.graphics.GhFlower3Grow3Tile;
import com.example.myapplication.graphics.GhFlower3Tile;
import com.example.myapplication.graphics.GhFlower4Grow1Tile;
import com.example.myapplication.graphics.GhFlower4Grow2Tile;
import com.example.myapplication.graphics.GhFlower4Grow3Tile;
import com.example.myapplication.graphics.GhFlower4Tile;
import com.example.myapplication.graphics.GhFlower5Grow1Tile;
import com.example.myapplication.graphics.GhFlower5Grow2Tile;
import com.example.myapplication.graphics.GhFlower5Grow3Tile;
import com.example.myapplication.graphics.GhFlower5Tile;
import com.example.myapplication.graphics.GhSelectedFlower1Grow1Tile;
import com.example.myapplication.graphics.GhSelectedFlower1Grow2Tile;
import com.example.myapplication.graphics.GhSelectedFlower1Grow3Tile;
import com.example.myapplication.graphics.GhSelectedFlower1Tile;
import com.example.myapplication.graphics.GhSelectedFlower2Grow1Tile;
import com.example.myapplication.graphics.GhSelectedFlower2Grow2Tile;
import com.example.myapplication.graphics.GhSelectedFlower2Grow3Tile;
import com.example.myapplication.graphics.GhSelectedFlower2Tile;
import com.example.myapplication.graphics.GhSelectedFlower3Grow1Tile;
import com.example.myapplication.graphics.GhSelectedFlower3Grow2Tile;
import com.example.myapplication.graphics.GhSelectedFlower3Grow3Tile;
import com.example.myapplication.graphics.GhSelectedFlower3Tile;
import com.example.myapplication.graphics.GhSelectedFlower4Grow1Tile;
import com.example.myapplication.graphics.GhSelectedFlower4Grow2Tile;
import com.example.myapplication.graphics.GhSelectedFlower4Grow3Tile;
import com.example.myapplication.graphics.GhSelectedFlower4Tile;
import com.example.myapplication.graphics.GhSelectedFlower5Grow1Tile;
import com.example.myapplication.graphics.GhSelectedFlower5Grow2Tile;
import com.example.myapplication.graphics.GhSelectedFlower5Grow3Tile;
import com.example.myapplication.graphics.GhSelectedFlower5Tile;
import com.example.myapplication.graphics.GreenhouseTilemap;
import com.example.myapplication.graphics.GhPotTile;
import com.example.myapplication.graphics.SelectedFertilizedDirt;
import com.example.myapplication.graphics.SelectedFlower2Grow1Tile;
import com.example.myapplication.graphics.SelectedFlower2Grow2Tile;
import com.example.myapplication.graphics.SelectedFlower2Grow3Tile;
import com.example.myapplication.graphics.SelectedFlower3Grow1Tile;
import com.example.myapplication.graphics.SelectedFlower3Grow2Tile;
import com.example.myapplication.graphics.SelectedFlower3Grow3Tile;
import com.example.myapplication.graphics.SelectedFlower4Grow1Tile;
import com.example.myapplication.graphics.SelectedFlower4Grow2Tile;
import com.example.myapplication.graphics.SelectedFlower4Grow3Tile;
import com.example.myapplication.graphics.SelectedFlower5Grow1Tile;
import com.example.myapplication.graphics.SelectedFlower5Grow2Tile;
import com.example.myapplication.graphics.SelectedFlower5Grow3Tile;
import com.example.myapplication.graphics.GhSelectedPotTile;
import com.example.myapplication.graphics.SpriteSheet;
import com.example.myapplication.graphics.Tile;
import com.example.myapplication.graphics.Tilemap;


import com.example.myapplication.graphics.DirtTile;
import com.example.myapplication.graphics.SelectedDirtTile;
import com.example.myapplication.graphics.CleanDirtTile;
import com.example.myapplication.graphics.SelectedCleanDirt;
import com.example.myapplication.graphics.Flower1Grow1Tile;
import com.example.myapplication.graphics.SelectedFlower1Grow1Tile;
import com.example.myapplication.graphics.Flower1Grow2Tile;
import com.example.myapplication.graphics.SelectedFlower1Grow2Tile;
import com.example.myapplication.graphics.Flower1Grow3Tile;
import com.example.myapplication.graphics.SelectedFlower1Grow3Tile;
import com.example.myapplication.graphics.Flower1Tile;
import com.example.myapplication.graphics.SelectedFlower1Tile;
import com.example.myapplication.graphics.Flower2Tile;
import com.example.myapplication.graphics.SelectedFlower2Tile;
import com.example.myapplication.graphics.Flower3Tile;
import com.example.myapplication.graphics.SelectedFlower3Tile;
import com.example.myapplication.graphics.Flower4Tile;
import com.example.myapplication.graphics.SelectedFlower4Tile;
import com.example.myapplication.graphics.Flower5Tile;
import com.example.myapplication.graphics.SelectedFlower5Tile;


// gameView manages all objects in the game and is responsible for updating all states + render all objects to screen

public class GameView extends SurfaceView implements SurfaceHolder.Callback {
    private final Tilemap tilemap;
    private final GreenhouseTilemap greenhouseTilemap;
    public SurfaceHolder surfaceHolder;
    public GameLoop gameLoop;
    public String buttonPressed = "none";
    private MediaPlayer mediaPlayer;

    private final GameDisplay gameDisplay;

    private final WateringcanObj wateringcan;

    private final ShovelObj shovel;

    private final SpraylObj spray;
    private final SeedObj seed;
    private final PopupObj popup;

    private final HelpObj help;
    private final IconsObj icons;
    private final AudioOnObj audioOn;
    private final AudioOffObj audioOff;
    private final GreenhousePopupObj greenhouseFlowers;

    private final GreenhouseButtonObj greenhouse;
    private final GardenButtonObj garden;
    private boolean showSeeds = false;
    private boolean showHelp = false;
    private boolean tileSelected = false;
    private boolean greenhouseScreen = false;
    private boolean gardenScreen = true;
    private boolean flower1Selected;
    private boolean flower2Selected;

    private boolean flower3Selected;
    private boolean flower4Selected;
    private boolean flower5Selected;

    private boolean ghFlower1Selected;
    private boolean ghFlower2Selected;

    private boolean ghFlower3Selected;
    private boolean ghFlower4Selected;
    private boolean ghFlower5Selected;

    private Tile pointerTile;
    private Tile ghPointerTile;

    private String hoverText = "";

    private boolean audio = true;

    private float xPos;
    private float yPos;
    private final Context context;

    private static final String LOG_TAG = "MEADOW_TAG";

    public GameView(Context context) {
        super(context);
        //get surface holder
        //allows surface holder to render on screen
        // surface holder is used to control the surface's size and format
        surfaceHolder = getHolder();
        //add call back
        surfaceHolder.addCallback(this);

        //responsible for running the game loop
        //game loop manages the updating and rendering of the game
        gameLoop = new GameLoop(this, surfaceHolder);
        //GameLoop gameLoop = new GameLoop(this, surfaceHolder);

        this.context = context;

        //INITIALIZE SPRITE SHEET
        SpriteSheet spriteSheet = new SpriteSheet(context);

        //INITIALIZE game display and center around player

        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        //gameDisplay = new GameDisplay(displayMetrics.widthPixels, displayMetrics.heightPixels, player);
        gameDisplay = new GameDisplay(displayMetrics.widthPixels, displayMetrics.heightPixels);

        //INITIALIZE TILE MAP

        tilemap = new Tilemap(spriteSheet);
        greenhouseTilemap = new GreenhouseTilemap(spriteSheet);

        // Load tilemap image
        Bitmap gardeningImage = BitmapFactory.decodeResource(getResources(), R.drawable.gardening);
        //Bitmap greenhouseImage = BitmapFactory.decodeResource(getResources(), R.drawable.tileset);
        Bitmap helpIcon = BitmapFactory.decodeResource(getResources(), R.drawable.icons);

        // Create and initialize tryDrag object
        wateringcan = new WateringcanObj(this, gardeningImage);
        shovel = new ShovelObj(this, gardeningImage);
        spray = new SpraylObj(this,gardeningImage);

        seed = new SeedObj(this,gardeningImage);
        popup = new PopupObj(this);

        help = new HelpObj(this, helpIcon);
        icons = new IconsObj(this);

        audioOn = new AudioOnObj(this, helpIcon);
        audioOff = new AudioOffObj(this, helpIcon);

        greenhouseFlowers = new GreenhousePopupObj(this);

        //garden button takes you to garden
        garden = new GardenButtonObj(this, gardeningImage, getContext());
        //greenhouse button takes you to greenhouse
        greenhouse = new GreenhouseButtonObj(this, gardeningImage, getContext());


    }

    //AUDIO
    public void playSelectBlock(){
        if (audio) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this.getContext(), R.raw.select_block);
            mediaPlayer.start();
        }
    }

    public void playSelectSeed(){
        if (audio) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this.getContext(), R.raw.select_seed);
            mediaPlayer.start();
        }
    }

    public void playSelectTool(){
        if (audio) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this.getContext(), R.raw.select);
            mediaPlayer.start();
        }
    }

    public void playSpray(){
        if (audio) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this.getContext(), R.raw.spray);
            mediaPlayer.start();
        }
    }
    public void playWater(){
        if (audio) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this.getContext(), R.raw.water);
            mediaPlayer.start();
        }
    }

    public void playGrow(){
        if (audio) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this.getContext(), R.raw.grow);
            mediaPlayer.start();
        }
    }

    public void playSwitchScreen(){
        if (audio) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this.getContext(), R.raw.changescreen);
            mediaPlayer.start();
        }
    }

    //handles motion / touch event
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i(LOG_TAG, "onTouchEvent");

        //position of mouse
        xPos = event.getX();
        yPos = event.getY();

        //if (checkIfTileMapContainsSelected(xPos,yPos)){}


        int row = 0;
        int column = 0;



        while (row < 10) {
            Rect rect = tilemap.getRectByIndex(row, column);
            //finding the position of the tiles
            float exactCentreX = rect.exactCenterX();
            float exactCentreY = rect.exactCenterY();

            //seeing if the position of mouse matches with a tile
            if ((xPos > exactCentreX - 46 && xPos < exactCentreX + 46) && (yPos > exactCentreY - 46 && yPos < exactCentreY + 46)) {
                pointerTile = tilemap.tilemap[row][column];
                Log.d(LOG_TAG, "Tile type is: " + pointerTile);
                //find which row and column this tile is
                ghPointerTile = greenhouseTilemap.tilemap[row][column];

                if (event.getActionMasked() == MotionEvent.ACTION_DOWN) {
                    if (gardenScreen){
                    //selecting dirt tile
                        if (pointerTile instanceof DirtTile && !tileSelected) {
                            playSelectBlock();
                            //tilemap.map.getLayout()[row][column] = 1;
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 24);
                            tileSelected = true;

                            //text popup
                            hoverText = "dirt";

                            // unselecting dirt tile
                        } else if (pointerTile instanceof SelectedDirtTile && tileSelected) {
                            playSelectBlock();
                            //tilemap.map.getLayout()[row][column] = 1;
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 1);
                            tileSelected = false;

                            //text popup
                            hoverText = "dirt";
                        } else if (pointerTile instanceof CleanDirtTile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 25);
                            tileSelected = true;

                            //text popup
                            hoverText = "clean dirt";
                        } else if (pointerTile instanceof SelectedCleanDirt && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 2);
                            tileSelected = false;
                            //text popup
                            hoverText = "clean dirt";
                        } else if (pointerTile instanceof FertilisedDirtTile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 26);
                            tileSelected = true;
                            //text popup
                            hoverText = "fertilized dirt";
                        } else if (pointerTile instanceof SelectedFertilizedDirt && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 3);
                            tileSelected = false;
                            //text popup
                            hoverText = "fertilized dirt";
                        } else if (pointerTile instanceof Flower1Grow1Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 27);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower1Grow1Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 4);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower2Grow1Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 28);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower2Grow1Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 5);
                            tileSelected = false;
                        } else if (pointerTile instanceof Flower3Grow1Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 29);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower3Grow1Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 6);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower4Grow1Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 30);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower4Grow1Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 7);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower5Grow1Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 31);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower5Grow1Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 8);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower1Grow2Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 32);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower1Grow2Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 9);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower2Grow2Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 33);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower2Grow2Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 10);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower3Grow2Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 34);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower3Grow2Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 11);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower4Grow2Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 35);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower4Grow2Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 12);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower5Grow2Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 36);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof SelectedFlower5Grow2Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 13);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower1Grow3Tile) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 37);
                            //tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting flower1grow3 tile
                        else if (pointerTile instanceof SelectedFlower1Grow3Tile) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 14);
                            //tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower2Grow3Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 38);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting flower2grow3 tile
                        else if (pointerTile instanceof SelectedFlower2Grow3Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 15);
                            tileSelected = false;
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower3Grow3Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 39);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting flower3grow3 tile
                        else if (pointerTile instanceof SelectedFlower3Grow3Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 16);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower4Grow3Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 40);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting flower4grow3 tile
                        else if (pointerTile instanceof SelectedFlower4Grow3Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 17);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower5Grow3Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 41);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";

                        }
                        //unselecting flower5grow3 tile
                        else if (pointerTile instanceof SelectedFlower5Grow3Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 18);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (pointerTile instanceof Flower1Tile) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 42);
                            //tileSelected = true;
                            //text popup
                            hoverText = "flower";
                        }

                        //unselecting flower1 tile
                        else if (pointerTile instanceof SelectedFlower1Tile) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 19);
                            //tileSelected = false;
                            //text popup
                            hoverText = "flower";
                        } else if (pointerTile instanceof Flower2Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 43);
                            tileSelected = true;
                            //text popup
                            hoverText = "flower";
                        }

                        //unselecting flower2 tile
                        else if (pointerTile instanceof SelectedFlower2Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 20);
                            tileSelected = false;
                            //text popup
                            hoverText = "flower";
                        } else if (pointerTile instanceof Flower3Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 44);
                            tileSelected = true;
                            //text popup
                            hoverText = "flower";
                        }
                        //unselecting flower3 tile
                        else if (pointerTile instanceof SelectedFlower3Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 21);
                            tileSelected = false;
                            //text popup
                            hoverText = "flower";
                        } else if (pointerTile instanceof Flower4Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 45);
                            tileSelected = true;
                            //text popup
                            hoverText = "flower";
                        }
                        //unselecting flower4 tile
                        else if (pointerTile instanceof SelectedFlower4Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 22);
                            tileSelected = false;
                            //text popup
                            hoverText = "flower";
                        } else if (pointerTile instanceof Flower5Tile && !tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 46);
                            tileSelected = true;
                            //text popup
                            hoverText = "flower";
                        }
                        //unselecting flower5 tile
                        else if (pointerTile instanceof SelectedFlower5Tile && tileSelected) {
                            // Redraw the map bitmap with the updated tile
                            tilemap.updateTile(row, column, 23);
                            tileSelected = false;//text popup
                            hoverText = "flower";

                        }
                }
                else {
                        if (ghPointerTile instanceof GhPotTile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 70);
                            tileSelected = true;
                            //text popup
                            hoverText = "empty plant pot";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedPotTile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 49);
                            tileSelected = false;
                            //text popup
                            hoverText = "empty plant pot";
                        } else if (ghPointerTile instanceof GhFlower1Grow1Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 71);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower1Grow1Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 50);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";

                        } else if (ghPointerTile instanceof GhFlower2Grow1Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 72);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower2Grow1Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 51);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";

                        } else if (ghPointerTile instanceof GhFlower3Grow1Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 73);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower3Grow1Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 52);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower4Grow1Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 74);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower4Grow1Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 53);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower5Grow1Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 75);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower5Grow1Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 54);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower1Grow2Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 76);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower1Grow2Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 55);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower2Grow2Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 77);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower2Grow2Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 56);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower3Grow2Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 78);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower3Grow2Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 57);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower4Grow2Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 79);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower4Grow2Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 58);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower5Grow2Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 80);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower5Grow2Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 59);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower1Grow3Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 81);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower1Grow3Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 60);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower2Grow3Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 82);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower2Grow3Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 61);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower3Grow3Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 83);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower3Grow3Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 62);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower4Grow3Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 84);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower4Grow3Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 63);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower5Grow3Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 85);
                            tileSelected = true;
                            //text popup
                            hoverText = "growing flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower5Grow3Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 64);
                            tileSelected = false;
                            //text popup
                            hoverText = "growing flower";
                        } else if (ghPointerTile instanceof GhFlower1Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 86);
                            tileSelected = true;//text popup
                            hoverText = "growing flower";

                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower1Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 65);
                            tileSelected = false;
                            //text popup
                            hoverText = "flower";
                        } else if (ghPointerTile instanceof GhFlower2Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 87);
                            tileSelected = true;
                            //text popup
                            hoverText = "flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower2Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 66);
                            tileSelected = false;
                            //text popup
                            hoverText = "flower";
                        } else if (ghPointerTile instanceof GhFlower3Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 88);
                            tileSelected = true;
                            //text popup
                            hoverText = "flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower3Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 67);
                            tileSelected = false;
                            //text popup
                            hoverText = "flower";
                        } else if (ghPointerTile instanceof GhFlower4Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 89);
                            tileSelected = true;
                            //text popup
                            hoverText = "flower";
                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower4Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 68);
                            tileSelected = false;
                            //text popup
                            hoverText = "flower";
                        } else if (ghPointerTile instanceof GhFlower5Tile && !tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 90);
                            tileSelected = true;
                            //text popup
                            hoverText = "flower";

                        }
                        //unselecting
                        else if (ghPointerTile instanceof GhSelectedFlower5Tile && tileSelected) {
                            playSelectBlock();
                            greenhouseTilemap.updateTile(row, column, 69);
                            tileSelected = false;
                            //text popup
                            hoverText = "flower";
                        }
                    }
                }



                //DRAG OBJECTS
                if (event.getActionMasked() == MotionEvent.ACTION_MOVE) {
                    //shovel
                    if (shovel.getActionDown()) {
                        shovel.setPosition(event.getX(), event.getY());

                        //if shovel touches the dirt tile selected
                        if (pointerTile instanceof SelectedDirtTile) {
                            //change to unselected clean dirt tile
                            tilemap.updateTile(row, column, 2);
                            //pointer tile is set to null so no more tiles change
                            MediaPlayer mediaPlayer = MediaPlayer.create(this.getContext(), R.raw.shovel);
                            mediaPlayer.start();
                            pointerTile = null;
                            tileSelected = false;
                        }

                    }
                    else if (spray.getActionDown()) {
                        spray.setPosition(event.getX(), event.getY());


                        //calls 'getSprayNextTile' checks which tile is next
                        int nextTile = getSprayNextTile(pointerTile);
                        if (nextTile != 0) {
                            tilemap.updateTile(row, column, nextTile);
                            playSpray();
                            tileSelected = false;
                        }
                        pointerTile = null;
                        //tileSelected = false;

                        //calls 'getGhSprayNextTile' checks which tile is next
                        int ghNextTile = getGhSprayNextTile(ghPointerTile);
                        if (ghNextTile != 0) {
                            greenhouseTilemap.updateTile(row, column, ghNextTile);
                            playSpray();
                            tileSelected = false;
                        }
                        ghPointerTile = null;

                    }
                    else if (wateringcan.getActionDown()) {
                        wateringcan.setPosition(event.getX(), event.getY());

                        //calls 'getWateringNextTile' checks which tile is next
                        int nextTile = getWateringNextTile(pointerTile);
                        if (nextTile != 0) {
                            tilemap.updateTile(row, column, nextTile);
                            playWater();
                            playGrow();
                            tileSelected = false;
                        }
                        pointerTile = null;

                        //calls 'getGgWateringNextTile' checks which tile is next
                        int ghNextTile = getGhWaterNextTile(ghPointerTile);
                        if (ghNextTile != 0) {
                            greenhouseTilemap.updateTile(row, column, ghNextTile);
                            playWater();
                            playGrow();
                            tileSelected = false;
                        }
                        ghPointerTile = null;

                    }
                }

            }

            column ++;
            if(column == 21){
                column = 0;
                row++;
            }
        }



        switch(event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:

                checkFlowerPressed(event.getX(), event.getY());
                ghCheckFlowerPressed(event.getX(), event.getY());

                if (shovel.isTouched(event.getX(), event.getY()) && !(shovel.getActionDown())) {
                    shovel.setActionDown(true);
                    playSelectTool();
                    //text popup
                    hoverText = "shovel";
                }

                if (spray.isTouched(event.getX(), event.getY()) && !(spray.getActionDown())) {
                    spray.setActionDown(true);
                    playSelectTool();
                    //text popup
                    hoverText = "spray";
                }
                if (wateringcan.isTouched(event.getX(), event.getY()) && !(wateringcan.getActionDown())) {
                    wateringcan.setActionDown(true);
                    playSelectTool();
                    //text popup
                    hoverText = "watering can";
                }

                if (!showSeeds) {
                    if (seed.isTouched(event.getX(), event.getY()) && !(seed.getActionDown())) {
                        seed.setActionDown(true);
                        Log.i(LOG_TAG, "Show seed");
                        playSelectTool();
                        showSeeds = true;
                        //text popup
                        hoverText = "seeds";
                    }
                } else { //if (showSeeds){
                    if (seed.isTouched(event.getX(), event.getY()) && !(seed.getActionDown())) {
                        seed.setActionDown(true);
                        Log.i(LOG_TAG, "Hide seed");
                        playSelectTool();
                        showSeeds = false; //text popup
                        hoverText = "seeds";

                    }
                }

                if (!showHelp) {
                    if (help.isTouched(event.getX(), event.getY()) && !(help.getActionDown())) {
                        help.setActionDown(true);
                        Log.i(LOG_TAG, "Show help");
                        playSelectTool();
                        showHelp = true;
                    }
                } else { //if (showHelp){
                    if (help.isTouched(event.getX(), event.getY()) && !(help.getActionDown())) {
                        help.setActionDown(true);
                        Log.i(LOG_TAG, "Hide help");
                        playSelectTool();
                        showHelp = false;
                    }
                }

                if (audio) {
                    if (audioOn.isTouched(event.getX(), event.getY()) && !(audioOn.getActionDown())) {
                        audioOn.setActionDown(true);
                        Log.i(LOG_TAG, "Audio off");
                        audio = false;
                    }
                } else { //if (showHelp){
                    if (audioOff.isTouched(event.getX(), event.getY()) && !(audioOff.getActionDown())) {
                        audioOff.setActionDown(true);
                        Log.i(LOG_TAG, "Audio on");
                        audio = true;
                    }
                }

                if (gardenScreen) {
                    Log.i(LOG_TAG, "Garden screen is true");
                    if (greenhouse.isTouched(event.getX(), event.getY()) && !(greenhouse.getActionDown())) {
                        greenhouse.setActionDown(true);
                        playSwitchScreen();
                        greenhouseScreen = true;
                        gardenScreen = false;
                        //text popup
                        hoverText = "greenhouse";
                    }
                }
                //if (greenhouseScreen) {
                else {
                    Log.i(LOG_TAG, "Greenhouse screen is true");
                    if (garden.isTouched(event.getX(), event.getY()) && !(garden.getActionDown())) {
                        garden.setActionDown(true);
                        playSwitchScreen();
                        gardenScreen = true;
                        greenhouseScreen = false;
                        //text popup
                        hoverText = "garden";
                    }
                }

                return true;


            //when use has released from button
            case MotionEvent.ACTION_UP:

                //text popup
                hoverText = "";
                buttonPressed = "none";

                if (wateringcan.getActionDown()) {
                    wateringcan.setActionDown(false);
                    wateringcan.resetPosition();
                }
                if (shovel.getActionDown()) {
                    shovel.setActionDown(false);
                    shovel.resetPosition();
                }
                if (spray.getActionDown()) {
                    spray.setActionDown(false);
                    spray.resetPosition();
                }
                if (seed.getActionDown()) {
                    seed.setActionDown(false);
                    //seed.resetPosition();
                }

                if (greenhouse.getActionDown()) {
                    greenhouse.setActionDown(false);
                }
                if (garden.getActionDown()) {
                    garden.setActionDown(false);
                }

                if (help.getActionDown()) {
                    help.setActionDown(false);
                }

                if (audioOn.getActionDown()) {
                    audioOn.setActionDown(false);
                }
                if (audioOff.getActionDown()) {
                    audioOff.setActionDown(false);
                }


                return true;

        }

        return super.onTouchEvent(event);

    }

    public void showHoverText(Canvas canvas){

        Paint textPaint = new Paint();
        int textColor = ContextCompat.getColor(context, R.color.black);
        textPaint.setColor(textColor);
        textPaint.setTextSize(40f);

        Paint boxPaint = new Paint();
        int boxColor = ContextCompat.getColor(context, R.color.white); // White color for the box
        boxPaint.setColor(boxColor);

        //hoverText = "slay";
        float textWidth = textPaint.measureText(hoverText);
        float textHeight = textPaint.descent() - textPaint.ascent();

        float rectLeft = xPos; // X-coordinate of the left side of the rectangle
        float rectTop = yPos - textHeight; // Y-coordinate of the top side of the rectangle
        float rectRight = rectLeft + textWidth; // X-coordinate of the right side of the rectangle
        float rectBottom = yPos; // Y-coordinate of the bottom side of the rectangle

        // Draw the white box
        canvas.drawRect(rectLeft, rectTop, rectRight, rectBottom, boxPaint);

        // Draw the text on top of the box
        canvas.drawText(hoverText, xPos, yPos, textPaint);
    }

    public void checkFlowerPressed(float getX, float getY){
        if (getX > popup.flower1X
                && getX < popup.flower1X + popup.flowerWidth
                && getY > popup.flower1Y
                && getY < popup.flower1Y + popup.flowerHeight) {
            Log.i(LOG_TAG, "Flower1 pressed");
            flower1Selected = true;
            //audio
            playSelectSeed();

        }
        else if (getX > popup.flower2X
                && getX < popup.flower2X + popup.flowerWidth
                && getY > popup.flower2Y
                && getY < popup.flower2Y + popup.flowerHeight) {
            Log.i(LOG_TAG, "Flower2 pressed");
            flower2Selected = true;
            //audio
            playSelectSeed();
        }
        else if (getX > popup.flower3X
                && getX < popup.flower3X + popup.flowerWidth
                && getY > popup.flower3Y
                && getY < popup.flower3Y + popup.flowerHeight) {
            Log.i(LOG_TAG, "Flower3 pressed");
            flower3Selected = true;
            //audio
            playSelectSeed();
        }
        else if (getX > popup.flower4X
                && getX < popup.flower4X + popup.flowerWidth
                && getY > popup.flower4Y
                && getY < popup.flower4Y + popup.flowerHeight) {
            Log.i(LOG_TAG, "Flower4 pressed");
            flower4Selected = true;
            //audio
            playSelectSeed();
        }
        else if (getX > popup.flower5X
                && getX < popup.flower5X + popup.flowerWidth
                && getY > popup.flower5Y
                && getY < popup.flower5Y + popup.flowerHeight) {
            Log.i(LOG_TAG, "Flower5 pressed");
            flower5Selected = true;
            //audio
            playSelectSeed();
        }
    }
    public void ghCheckFlowerPressed(float getX, float getY){

        if (getX > greenhouseFlowers.flower1X
                && getX < greenhouseFlowers.flower1X + greenhouseFlowers.flowerWidth
                && getY > greenhouseFlowers.flower1Y
                && getY < greenhouseFlowers.flower1Y + greenhouseFlowers.flowerHeight) {
            Log.i(LOG_TAG, "GH Flower1 pressed");
            ghFlower1Selected = true;
            //audio
            playSelectSeed();

        }
        else if (getX > greenhouseFlowers.flower2X
                && getX < greenhouseFlowers.flower2X + greenhouseFlowers.flowerWidth
                && getY > greenhouseFlowers.flower2Y
                && getY < greenhouseFlowers.flower2Y + greenhouseFlowers.flowerHeight) {
            Log.i(LOG_TAG, "GH Flower2 pressed");
            ghFlower2Selected = true;
            //audio
            playSelectSeed();
        }
        else if (getX > greenhouseFlowers.flower3X
                && getX < greenhouseFlowers.flower3X + greenhouseFlowers.flowerWidth
                && getY > greenhouseFlowers.flower3Y
                && getY < greenhouseFlowers.flower3Y + greenhouseFlowers.flowerHeight) {
            Log.i(LOG_TAG, "GH Flower3 pressed");
            ghFlower3Selected = true;
            //audio
            playSelectSeed();
        }
        else if (getX > greenhouseFlowers.flower4X
                && getX < greenhouseFlowers.flower4X + greenhouseFlowers.flowerWidth
                && getY > greenhouseFlowers.flower4Y
                && getY < greenhouseFlowers.flower4Y + greenhouseFlowers.flowerHeight) {
            Log.i(LOG_TAG, "GH Flower4 pressed");
            ghFlower4Selected = true;
            //audio
            playSelectSeed();
        }
        else if (getX > greenhouseFlowers.flower5X
                && getX < greenhouseFlowers.flower5X + greenhouseFlowers.flowerWidth
                && getY > greenhouseFlowers.flower5Y
                && getY < greenhouseFlowers.flower5Y + greenhouseFlowers.flowerHeight) {
            Log.i(LOG_TAG, "GH Flower5 pressed");
            ghFlower5Selected = true;
            //audio
            playSelectSeed();
        }
    }


    public int getSprayNextTile(Tile selectedTile){
        int nextSprayTile = 0;

        //if spray touches the clean dirt tile
        if (pointerTile instanceof SelectedCleanDirt) {
            //change to unselected fertilised dirt, ready to add a seed
            nextSprayTile = 3;


            //CHANGING FLOWER GROW1 TILES TO UNSELECTED
            //if flower1grow1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower1Grow1Tile) {
            nextSprayTile = 4;
            //if flower2grow1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower2Grow1Tile) {
            nextSprayTile = 5;
            //if flower3grow1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower3Grow1Tile) {
            nextSprayTile = 6;
            //if flower4grow1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower4Grow1Tile) {
            nextSprayTile = 7;
            //if flower5grow1 is selected, fertilized, change to unselected tile2
        } else if (selectedTile instanceof SelectedFlower5Grow1Tile) {
            nextSprayTile = 8;


            //CHANGING FLOWER GROW2 TILES TO UNSELECTED
            //if flower1grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower1Grow2Tile) {
            nextSprayTile = 9;
            //if flower2grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower2Grow2Tile) {
            nextSprayTile = 10;
            //if flower3grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower3Grow2Tile) {
            nextSprayTile = 11;
            //if flower4grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower4Grow2Tile) {
            nextSprayTile = 12;
            //if flower5grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower5Grow2Tile) {
            nextSprayTile = 13;


            //CHANGING FLOWER GROW3 TILES TO UNSELECTED
            //if flower1grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower1Grow3Tile) {
            nextSprayTile = 14;
            //if flower2grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower2Grow3Tile) {
            nextSprayTile = 15;
            //if flower3grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower3Grow3Tile) {
            nextSprayTile = 16;
            //if flower4grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower4Grow3Tile) {
            nextSprayTile = 17;
            //if flower5grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower5Grow3Tile) {
            nextSprayTile = 18;


            //CHANGING FLOWER TILES TO UNSELECTED
            //if flower1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower1Tile){
            nextSprayTile = 19;
            //if flower2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower2Tile){
            nextSprayTile = 20;
            //if flower3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower3Tile){
            nextSprayTile = 21;
            //if flower4 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower4Tile){
            nextSprayTile = 22;
            //if flower5 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof SelectedFlower5Tile){
            nextSprayTile = 23;
        }

        return nextSprayTile;
    }

    //Changing tiles depending on what the current selected tile is, when water is used
    private int getWateringNextTile(Tile selectedTile) {
        int nextWaterTile = 0;

        //CHANGING FERTILIZED DIRT TO FLOWER GROW1 TILES
        //if flower is chosen, ground is fertilised and watered tile will change to selected flower grow1
        if (selectedTile instanceof SelectedFertilizedDirt) {
            checkFlowerPressed(getX(), getY());
            if (flower1Selected) {
                nextWaterTile = 4;
            }
            else if (flower2Selected) {
                nextWaterTile = 5;
            }
            else if (flower3Selected) {
                nextWaterTile = 6;
            }
            else if (flower4Selected) {
                nextWaterTile = 7;
            }
            else if (flower5Selected) {
                nextWaterTile = 8;
            }


            //CHANGING FLOWER GROW1 TILES TO FLOWER GROW 2 TILES
            //if flower1grow1 is selected and watered, change to flower1grow2
        }else if (selectedTile instanceof SelectedFlower1Grow1Tile) {
            nextWaterTile = 9;
            //if flower2grow1 is selected and watered, change to flower2grow2
        } else if (selectedTile instanceof SelectedFlower2Grow1Tile) {
            nextWaterTile = 10;
            //if flower3grow1 is selected and watered, change to flower3grow2
        } else if (selectedTile instanceof SelectedFlower3Grow1Tile) {
            nextWaterTile = 11;
            //if flower4grow1 is selected and watered, change to flower4grow2
        } else if (selectedTile instanceof SelectedFlower4Grow1Tile) {
            nextWaterTile = 12;
            //if flower5grow1 is selected and watered, change to flower5grow2
        } else if (selectedTile instanceof SelectedFlower5Grow1Tile) {
            nextWaterTile = 13;


            //CHANGING FLOWER GROW2 TILES TO FLOWER GROW 3 TILES
            //if flower1grow2 is selected and watered, change to flower1grow3
        } else if (selectedTile instanceof SelectedFlower1Grow2Tile) {
            nextWaterTile = 14;
            //if flower2grow2 is selected and watered, change to flower2grow3
        } else if (selectedTile instanceof SelectedFlower2Grow2Tile) {
            nextWaterTile = 15;
            //if flower3grow2 is selected and watered, change to flower3grow3
        } else if (selectedTile instanceof SelectedFlower3Grow2Tile) {
            nextWaterTile = 16;
            //if flower4grow2 is selected and watered, change to flower4grow3
        } else if (selectedTile instanceof SelectedFlower4Grow2Tile) {
            nextWaterTile = 17;
            //if flower5grow2 is selected and watered, change to flower5grow3
        } else if (selectedTile instanceof SelectedFlower5Grow2Tile) {
            nextWaterTile = 18;


            //CHANGING FLOWER GROW2 TILES TO FLOWER GROW 3 TILES
            //if flower1grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof SelectedFlower1Grow3Tile) {
            nextWaterTile = 19;
            //if flower2grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof SelectedFlower2Grow3Tile) {
            nextWaterTile = 20;
            //if flower3grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof SelectedFlower3Grow3Tile) {
            nextWaterTile = 21;
            //if flower4grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof SelectedFlower4Grow3Tile) {
            nextWaterTile = 22;
            //if flower5grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof SelectedFlower5Grow3Tile) {
            nextWaterTile = 23;


        }
        return nextWaterTile;

    }

    public int getGhSprayNextTile(Tile selectedTile){
        int ghNextSprayTile = 0;

        //if spray touches the clean dirt tile
        if (ghPointerTile instanceof GhSelectedPotTile) {
            //change to unselected fertilised pot, ready to add a seed
            ghNextSprayTile = 49;

            //CHANGING FLOWER GROW1 TILES TO UNSELECTED
            //if flower1grow1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower1Grow1Tile) {
            ghNextSprayTile = 50;
            //if flower2grow1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower2Grow1Tile) {
            ghNextSprayTile = 51;
            //if flower3grow1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower3Grow1Tile) {
            ghNextSprayTile = 52;
            //if flower4grow1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower4Grow1Tile) {
            ghNextSprayTile = 53;
            //if flower5grow1 is selected, fertilized, change to unselected tile2
        } else if (selectedTile instanceof GhSelectedFlower5Grow1Tile) {
            ghNextSprayTile = 54;


            //CHANGING FLOWER GROW2 TILES TO UNSELECTED
            //if flower1grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower1Grow2Tile) {
            ghNextSprayTile = 55;
            //if flower2grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower2Grow2Tile) {
            ghNextSprayTile = 56;
            //if flower3grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower3Grow2Tile) {
            ghNextSprayTile = 57;
            //if flower4grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower4Grow2Tile) {
            ghNextSprayTile = 58;
            //if flower5grow2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower5Grow2Tile) {
            ghNextSprayTile = 59;


            //CHANGING FLOWER GROW3 TILES TO UNSELECTED
            //if flower1grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower1Grow3Tile) {
            ghNextSprayTile = 60;
            //if flower2grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower2Grow3Tile) {
            ghNextSprayTile = 61;
            //if flower3grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower3Grow3Tile) {
            ghNextSprayTile = 62;
            //if flower4grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower4Grow3Tile) {
            ghNextSprayTile = 63;
            //if flower5grow3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower5Grow3Tile) {
            ghNextSprayTile = 64;


            //CHANGING FLOWER TILES TO UNSELECTED
            //if flower1 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower1Tile){
            ghNextSprayTile = 65;
            //if flower2 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower2Tile){
            ghNextSprayTile = 66;
            //if flower3 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower3Tile){
            ghNextSprayTile = 67;
            //if flower4 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower4Tile){
            ghNextSprayTile = 68;
            //if flower5 is selected, fertilized, change to unselected tile
        } else if (selectedTile instanceof GhSelectedFlower5Tile){
            ghNextSprayTile = 69;
        }

        return ghNextSprayTile;
    }

    public int getGhWaterNextTile(Tile selectedTile){
        int ghNextWaterTile = 0;

        //CHANGING FERTILIZED DIRT TO FLOWER GROW1 TILES
        //if flower is chosen, ground is fertilised and watered tile will change to selected flower grow1
        if (selectedTile instanceof GhSelectedPotTile) {
            ghCheckFlowerPressed(getX(), getY());
            if (ghFlower1Selected) {
                ghNextWaterTile = 50;
            }
            else if (ghFlower2Selected) {
                ghNextWaterTile = 51;
            }
            else if (ghFlower3Selected) {
                ghNextWaterTile = 52;
            }
            else if (ghFlower4Selected) {
                ghNextWaterTile = 53;
            }
            else if (ghFlower5Selected) {
                ghNextWaterTile = 54;
            }


            //CHANGING FLOWER GROW1 TILES TO FLOWER GROW 2 TILES
            //if flower1grow1 is selected and watered, change to flower1grow2
        } else if (selectedTile instanceof GhSelectedFlower1Grow1Tile) {
            ghNextWaterTile = 55;
            //if flower2grow1 is selected and watered, change to flower2grow2
        } else if (selectedTile instanceof GhSelectedFlower2Grow1Tile) {
            ghNextWaterTile = 56;
            //if flower3grow1 is selected and watered, change to flower3grow2
        } else if (selectedTile instanceof GhSelectedFlower3Grow1Tile) {
            ghNextWaterTile = 57;
            //if flower4grow1 is selected and watered, change to flower4grow2
        } else if (selectedTile instanceof GhSelectedFlower4Grow1Tile) {
            ghNextWaterTile = 58;
            //if flower5grow1 is selected and watered, change to flower5grow2
        } else if (selectedTile instanceof GhSelectedFlower5Grow1Tile) {
            ghNextWaterTile = 59;


            //CHANGING FLOWER GROW2 TILES TO FLOWER GROW 3 TILES
            //if flower1grow2 is selected and watered, change to flower1grow3
        } else if (selectedTile instanceof GhSelectedFlower1Grow2Tile) {
            ghNextWaterTile = 60;
            //if flower2grow2 is selected and watered, change to flower2grow3
        } else if (selectedTile instanceof GhSelectedFlower2Grow2Tile) {
            ghNextWaterTile = 61;
            //if flower3grow2 is selected and watered, change to flower3grow3
        } else if (selectedTile instanceof GhSelectedFlower3Grow2Tile) {
            ghNextWaterTile = 62;
            //if flower4grow2 is selected and watered, change to flower4grow3
        } else if (selectedTile instanceof GhSelectedFlower4Grow2Tile) {
            ghNextWaterTile = 63;
            //if flower5grow2 is selected and watered, change to flower5grow3
        } else if (selectedTile instanceof GhSelectedFlower5Grow2Tile) {
            ghNextWaterTile = 64;


            //CHANGING FLOWER GROW2 TILES TO FLOWER GROW 3 TILES
            //if flower1grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof GhSelectedFlower1Grow3Tile) {
            ghNextWaterTile = 65;
            //if flower2grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof GhSelectedFlower2Grow3Tile) {
            ghNextWaterTile = 66;
            //if flower3grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof GhSelectedFlower3Grow3Tile) {
            ghNextWaterTile = 67;
            //if flower4grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof GhSelectedFlower4Grow3Tile) {
            ghNextWaterTile = 68;
            //if flower5grow3 is selected and watered, change to flower selected
        } else if (selectedTile instanceof GhSelectedFlower5Grow3Tile) {
            ghNextWaterTile = 69;

        }

        return ghNextWaterTile;
    }


    public void update(){

        //update game state;
        gameDisplay.update();

    }

    public void draw(Canvas canvas){

        super.draw(canvas);

        //draw tilemap
        if (gardenScreen) {
            tilemap.draw(canvas, gameDisplay);
            greenhouse.draw(canvas);
            shovel.draw(canvas);

            Bitmap flowerImage = BitmapFactory.decodeResource(getResources(), R.drawable.tileset);
            if (showSeeds) {
                popup.draw(canvas, flowerImage);
            }
            Bitmap gardeningImage = BitmapFactory.decodeResource(getResources(), R.drawable.gardening);
            if (showHelp) {
                icons.draw(canvas, gardeningImage);
            }

        }

        else if (greenhouseScreen) {
            greenhouseTilemap.draw(canvas, gameDisplay);
            garden.draw(canvas);

            Bitmap greenhouseFlowerImage = BitmapFactory.decodeResource(getResources(), R.drawable.flowerpots);
            if (showSeeds) {
                greenhouseFlowers.draw(canvas, greenhouseFlowerImage);
            }
            Bitmap gardeningImage = BitmapFactory.decodeResource(getResources(), R.drawable.gardening);
            if (showHelp) {
                icons.draw(canvas, gardeningImage);
            }

        }

        spray.draw(canvas);
        wateringcan.draw(canvas);
        seed.draw(canvas);
        help.draw(canvas);

        if(audio){
            audioOn.draw(canvas);
        }
        else{
            audioOff.draw(canvas);
        }

        showHoverText(canvas);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {
        //check game loop is running
        if (gameLoop.getState().equals(Thread.State.TERMINATED)){
            surfaceHolder = getHolder();
            surfaceHolder.addCallback(this);
            gameLoop = new GameLoop(this, surfaceHolder);
        }
        gameLoop.startLoop();

        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(getContext(), R.raw.backround);
            mediaPlayer.setLooping(true);
            mediaPlayer.start();
        }

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
