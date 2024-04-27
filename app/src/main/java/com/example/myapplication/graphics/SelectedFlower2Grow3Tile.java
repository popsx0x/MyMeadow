package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class SelectedFlower2Grow3Tile extends Tile {
    private final Sprite sprite;

    public SelectedFlower2Grow3Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.SelectedGrow3Sprite();
    }

    @Override
    public void draw(Canvas canvas) {
       sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
