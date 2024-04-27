package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class GhFlower3Grow1Tile extends Tile {
    private final Sprite wallTile;
    private final Sprite shelfTile;
    private final Sprite potTile;
    private final Sprite grow1;

    public GhFlower3Grow1Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        wallTile = spriteSheet.getWallTile();
        shelfTile = spriteSheet.getShelfTile();
        potTile = spriteSheet.getPotTile();
        grow1 = spriteSheet.getGhGrow1();

    }

    @Override
    public void draw(Canvas canvas) {
        wallTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        shelfTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        potTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        grow1.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
