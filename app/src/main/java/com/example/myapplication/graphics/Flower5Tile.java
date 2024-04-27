package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class Flower5Tile extends Tile {
    private final Sprite sprite;

    public Flower5Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getFlower5Sprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
