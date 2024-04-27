package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class GhSelectedPotTile extends Tile {
    private final Sprite wallTile;
    private final Sprite shelfTile;
    private final Sprite selectedPotTile;

    public GhSelectedPotTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        wallTile = spriteSheet.getWallTile();
        shelfTile = spriteSheet.getShelfTile();
        selectedPotTile = spriteSheet.geSelectedPotTile();
    }

    @Override
    public void draw(Canvas canvas) {
        wallTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        shelfTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        selectedPotTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
