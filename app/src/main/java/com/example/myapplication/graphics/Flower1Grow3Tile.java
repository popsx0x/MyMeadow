package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class Flower1Grow3Tile extends Tile {
    private final Sprite sprite;

    public Flower1Grow3Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getGrow3Sprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
