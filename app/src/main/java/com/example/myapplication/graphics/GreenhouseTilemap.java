package com.example.myapplication.graphics;

import static com.example.myapplication.graphics.Map.GH_NUM_COLLUMN_TILES;
import static com.example.myapplication.graphics.Map.GH_NUM_ROW_TILES;
import static com.example.myapplication.graphics.Map.GH_TILE_HEIGHT_PIXELS;
import static com.example.myapplication.graphics.Map.GH_TILE_WIDTH_PIXELS;
//import static com.example.myapplication.graphics.Map.TILE_HEIGHT_PIXELS;
//import static com.example.myapplication.graphics.Map.TILE_WIDTH_PIXELS;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

import com.example.myapplication.GameDisplay;

public class GreenhouseTilemap {

    public final Map map;
    private final SpriteSheet spriteSheet;
    public Tile[][] tilemap;

    private Bitmap mapBitmap;


    public GreenhouseTilemap(SpriteSheet spriteSheet) {
        this.map = new Map();
        this.spriteSheet = spriteSheet;
        initialiseGreenhouseTilemap();
    }


    private void initialiseGreenhouseTilemap() {
        int[][] greenhouseLayout = map.getGreenhouseLayout();
        // Initialize the tilemap array
        tilemap = new Tile[GH_NUM_ROW_TILES][GH_NUM_COLLUMN_TILES];
        for (int iRow = 0; iRow < GH_NUM_ROW_TILES; iRow++) {
            for (int iCol = 0; iCol < GH_NUM_COLLUMN_TILES; iCol++) {
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
                GH_NUM_COLLUMN_TILES * GH_TILE_WIDTH_PIXELS,
                GH_NUM_ROW_TILES * GH_TILE_HEIGHT_PIXELS,
                config

        );

        Canvas mapCanvas = new Canvas(mapBitmap);


        for (int iRow = 0; iRow < GH_NUM_ROW_TILES; iRow++) {
            for (int iCol = 0; iCol < GH_NUM_COLLUMN_TILES; iCol++) {
                tilemap[iRow][iCol].draw(mapCanvas);
            }
        }
    }


    //calculates the screen coordinates (left, top, right, and bottom) for a specific tile in the map based on its row and column indices
    public Rect getRectByIndex(int idxRow, int idxCol) {
        return new Rect(
                idxCol * GH_TILE_WIDTH_PIXELS,
                idxRow * GH_TILE_HEIGHT_PIXELS,
                (idxCol + 1) * GH_TILE_WIDTH_PIXELS,
                (idxRow + 1) * GH_TILE_HEIGHT_PIXELS
        );
    }

///
// Update a specific tile and redraw the mapBitmap
    public void updateTile(int row, int column, int newTileType) {
    tilemap[row][column] = Tile.getTile(newTileType, spriteSheet, getRectByIndex(row, column));

        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        mapBitmap = Bitmap.createBitmap(
                GH_NUM_COLLUMN_TILES * GH_TILE_WIDTH_PIXELS,
                GH_NUM_ROW_TILES * GH_TILE_HEIGHT_PIXELS,
                config

        );

        Canvas mapCanvas = new Canvas(mapBitmap);

    // Redraw the updated tile on the mapBitmap

        for (int iRow = 0; iRow < GH_NUM_ROW_TILES; iRow++) {
            for (int iCol = 0; iCol < GH_NUM_COLLUMN_TILES; iCol++) {
                tilemap[iRow][iCol].draw(mapCanvas);
            }
        }
}
    ///

    public void draw(Canvas canvas, GameDisplay gameDisplay) {
        canvas.drawBitmap(
                mapBitmap,
                    gameDisplay.getGameRect(),
                    gameDisplay.GH_RECT,
                null
        );
    }

}
