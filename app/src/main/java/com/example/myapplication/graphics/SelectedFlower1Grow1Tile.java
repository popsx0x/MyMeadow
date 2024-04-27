package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class SelectedFlower1Grow1Tile extends Tile {
    private final Sprite sprite;

    public SelectedFlower1Grow1Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.SelectedGrow1Sprite();
    }

    @Override
    public void draw(Canvas canvas) {
       sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
