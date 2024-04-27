package com.example.myapplication.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

import static com.example.myapplication.graphics.Map.NUM_COLLUMN_TILES;
import static com.example.myapplication.graphics.Map.NUM_ROW_TILES;
import static com.example.myapplication.graphics.Map.TILE_HEIGHT_PIXELS;
import static com.example.myapplication.graphics.Map.TILE_WIDTH_PIXELS;

import com.example.myapplication.GameDisplay;

public class Tilemap {

    public final Map map;
    private final SpriteSheet spriteSheet;
    public Tile[][] tilemap;

    private Bitmap mapBitmap;


    public Tilemap(SpriteSheet spriteSheet) {
        this.map = new Map();
        this.spriteSheet = spriteSheet;
        initialiseTilemap();
    }





    private void initialiseTilemap() {
        int[][] layout = map.getLayout();
        // Initialize the tilemap array
        tilemap = new Tile[NUM_ROW_TILES][NUM_COLLUMN_TILES];
        for (int iRow = 0; iRow < NUM_ROW_TILES; iRow++) {
            for (int iCol = 0; iCol < NUM_COLLUMN_TILES; iCol++) {
                tilemap[iRow][iCol] = Tile.getTile(
                        layout[iRow][iCol],
                        spriteSheet,
                        getRectByIndex(iRow, iCol)
                );
            }
        }

        //alpha (transparency), red, green, blue
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        mapBitmap = Bitmap.createBitmap(
                NUM_COLLUMN_TILES * TILE_WIDTH_PIXELS,
                NUM_ROW_TILES * TILE_HEIGHT_PIXELS,
                config

        );

        Canvas mapCanvas = new Canvas(mapBitmap);


        for (int iRow = 0; iRow < NUM_ROW_TILES; iRow++) {
            for (int iCol = 0; iCol < NUM_COLLUMN_TILES; iCol++) {
                tilemap[iRow][iCol].draw(mapCanvas);
            }
        }

    }

    private void initialiseGreenhouseTilemap() {
        int[][] greenhouseLayout = map.getGreenhouseLayout();
        // Initialize the tilemap array
        tilemap = new Tile[NUM_ROW_TILES][NUM_COLLUMN_TILES];
        for (int iRow = 0; iRow < NUM_ROW_TILES; iRow++) {
            for (int iCol = 0; iCol < NUM_COLLUMN_TILES; iCol++) {
                tilemap[iRow][iCol] = Tile.getTile(
                        greenhouseLayout[iRow][iCol],
                        //sheet
                        spriteSheet,
                        getRectByIndex(iRow, iCol)
                );
            }
        }
        //alpha (transparency), red, green, blue
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        mapBitmap = Bitmap.createBitmap(
                NUM_COLLUMN_TILES * TILE_WIDTH_PIXELS,
                NUM_ROW_TILES * TILE_HEIGHT_PIXELS,
                config

        );

        Canvas mapCanvas = new Canvas(mapBitmap);


        for (int iRow = 0; iRow < NUM_ROW_TILES; iRow++) {
            for (int iCol = 0; iCol < NUM_COLLUMN_TILES; iCol++) {
                tilemap[iRow][iCol].draw(mapCanvas);
            }
        }
    }


    //calculates the screen coordinates (left, top, right, and bottom) for a specific tile in the map based on its row and column indices
    public Rect getRectByIndex(int idxRow, int idxCol) {
        return new Rect(
                idxCol * TILE_WIDTH_PIXELS,
                idxRow * TILE_HEIGHT_PIXELS,
                (idxCol + 1) * TILE_WIDTH_PIXELS,
                (idxRow + 1) * TILE_HEIGHT_PIXELS
        );
    }

///
// Update a specific tile and redraw the mapBitmap
    public void updateTile(int row, int column, int newTileType) {

    System.out.println(">>> updateTile row=" + row + " column=" + column);
    tilemap[row][column] = Tile.getTile(newTileType, spriteSheet, getRectByIndex(row, column));

        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        mapBitmap = Bitmap.createBitmap(
                NUM_COLLUMN_TILES * TILE_WIDTH_PIXELS,
                NUM_ROW_TILES * TILE_HEIGHT_PIXELS,
                config

        );

        Canvas mapCanvas = new Canvas(mapBitmap);

    // Redraw the updated tile on the mapBitmap

        for (int iRow = 0; iRow < NUM_ROW_TILES; iRow++) {
            for (int iCol = 0; iCol < NUM_COLLUMN_TILES; iCol++) {
                tilemap[iRow][iCol].draw(mapCanvas);
            }
        }
}
    ///

    public void draw(Canvas canvas, GameDisplay gameDisplay) {
        canvas.drawBitmap(
                mapBitmap,
                    gameDisplay.getGameRect(),
                    gameDisplay.DISPLAY_RECT,
                null
        );
    }

}
