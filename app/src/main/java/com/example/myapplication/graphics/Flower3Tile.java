package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class Flower3Tile extends Tile {
    private final Sprite sprite;

    public Flower3Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getFlower3Sprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
