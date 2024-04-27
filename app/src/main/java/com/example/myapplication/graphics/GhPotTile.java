package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class GhPotTile extends Tile {
    private final Sprite wallTile;
    private final Sprite shelfTile;
    private final Sprite potTile;

    public GhPotTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        wallTile = spriteSheet.getWallTile();
        shelfTile = spriteSheet.getShelfTile();
        potTile = spriteSheet.getPotTile();
    }

    @Override
    public void draw(Canvas canvas) {
        wallTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        shelfTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        potTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
