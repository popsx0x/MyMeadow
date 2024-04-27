package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public class SelectedCleanDirt extends Tile {
    private final Sprite sprite;

    public SelectedCleanDirt(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.SelectedCleanDirtSprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}

