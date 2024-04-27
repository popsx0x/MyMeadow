package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class GhSelectedFlower1Grow1Tile extends Tile {
    private final Sprite wallTile;
    private final Sprite shelfTile;
    private final Sprite selectedPotTile;
    private final Sprite grow1;

    public GhSelectedFlower1Grow1Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        wallTile = spriteSheet.getWallTile();
        shelfTile = spriteSheet.getShelfTile();
        selectedPotTile = spriteSheet.geSelectedPotTile();
        grow1 = spriteSheet.getGhGrow1();

    }

    @Override
    public void draw(Canvas canvas) {
        wallTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        shelfTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        selectedPotTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        grow1.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
