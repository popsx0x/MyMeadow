package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class GhFlower1Tile extends Tile {
    private final Sprite wallTile;
    private final Sprite shelfTile;
    private final Sprite potTile;
    private final Sprite flower1;

    public GhFlower1Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        wallTile = spriteSheet.getWallTile();
        shelfTile = spriteSheet.getShelfTile();
        potTile = spriteSheet.getPotTile();
        flower1 = spriteSheet.ghFlower1();

    }

    @Override
    public void draw(Canvas canvas) {
        wallTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        shelfTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        potTile.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        flower1.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
