package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class SelectedFlower4Tile extends Tile {
    private final Sprite sprite;

    public SelectedFlower4Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.SelectedFlower4Tile();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
