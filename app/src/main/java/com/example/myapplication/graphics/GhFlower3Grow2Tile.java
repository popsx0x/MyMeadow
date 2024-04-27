package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class GhFlower3Grow2Tile extends Tile {
    private final Sprite wallTile;
    private final Sprite shelfTile;
    private final Sprite potTile;
    private final Sprite grow2;

    public GhFlower3Grow2Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        wallTile = spriteSheet.getWallTile();
        shelfTile = spriteSheet.getShelfTile();
        potTile = spriteSheet.getPotTile();
        grow2 = spriteSheet.getGhFlower3Grow2();

    }

    @Override
    public void draw(Canvas canvas) {
        wallTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        shelfTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        potTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        grow2.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
