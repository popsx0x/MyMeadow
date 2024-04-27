package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class ShelfTile extends Tile {
    private final Sprite wallSprite;
    private final Sprite shelfSprite;

    public ShelfTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        wallSprite = spriteSheet.getWallTile();
        shelfSprite = spriteSheet.getShelfTile();

    }

    @Override
    public void draw(Canvas canvas) {
        wallSprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
        shelfSprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);

    }
}

