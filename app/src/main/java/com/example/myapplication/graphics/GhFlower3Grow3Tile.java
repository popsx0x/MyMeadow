package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class GhFlower3Grow3Tile extends Tile {
    private final Sprite wallTile;
    private final Sprite shelfTile;
    private final Sprite potTile;
    private final Sprite growFlower3;

    public GhFlower3Grow3Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        wallTile = spriteSheet.getWallTile();
        shelfTile = spriteSheet.getShelfTile();
        potTile = spriteSheet.getPotTile();
        growFlower3 = spriteSheet.getGhFlower3Grow3();

    }

    @Override
    public void draw(Canvas canvas) {
        wallTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        shelfTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        potTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        growFlower3.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
