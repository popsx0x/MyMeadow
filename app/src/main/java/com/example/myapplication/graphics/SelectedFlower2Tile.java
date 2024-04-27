package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class SelectedFlower2Tile extends Tile {
    private final Sprite sprite;

    public SelectedFlower2Tile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.SelectedFlower2Tile();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
