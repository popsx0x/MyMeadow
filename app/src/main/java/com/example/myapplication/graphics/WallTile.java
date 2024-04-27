package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class WallTile extends Tile {
    private final Sprite sprite;

    public WallTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getWallTile();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
