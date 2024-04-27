package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class Flower5Grow1Tile extends Tile {
    private final Sprite sprite;

    public Flower5Grow1Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getGrow1Sprite();
    }

    @Override
    public void draw(Canvas canvas) {
       sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
