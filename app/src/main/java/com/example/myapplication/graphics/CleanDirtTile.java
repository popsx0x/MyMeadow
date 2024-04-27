package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class CleanDirtTile extends Tile {
    private final Sprite sprite;

    public CleanDirtTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getCleanDirtSprite();
    }

    @Override
    public void draw(Canvas canvas) {
       sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
