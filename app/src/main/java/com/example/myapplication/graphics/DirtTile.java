package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class DirtTile extends Tile {
    private final Sprite sprite;

    public DirtTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getDirtSprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
