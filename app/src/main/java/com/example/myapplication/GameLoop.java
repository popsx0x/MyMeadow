package com.example.myapplication;

import android.view.Surface;
import android.view.SurfaceHolder;

import android.graphics.Canvas;

public class GameLoop extends Thread{

    // const and variables
    public static final double MAX_UPS = 240;
    private static final double UPS_PERIOD = 1E+3/MAX_UPS;

    //reference to gameView object associated with game loop
    private com.example.myapplication.GameView game;

    //reference to surface holder associated with the game view for drawing on surface
    private SurfaceHolder surfaceHolder;

    // indicates if game loop is running
    private boolean isRunning = false;

    //variables storing updates per second and frames per second
    private double averageUPS;
    private double averageFPS;

    //canvas - object used rendering
    private Canvas canvas = null;

    //constructor Takes a GameView and a SurfaceHolder as parameters and initializes the corresponding fields
    public GameLoop(com.example.myapplication.GameView game, SurfaceHolder surfaceHolder) {
        this.game = game;
        this.surfaceHolder = surfaceHolder;
    }
    @Override
    //run method - main loop of game
    public void run() {
        super.run();
        // Declare time and cycle count variables
        int updateCount = 0;
        int frameCount = 0;

        long startTime;
        long elapsedTime;
        long sleepTime;
        // Game loop
        canvas = null;
        startTime = System.currentTimeMillis();

        //updates and renders the game while is running is true
        while(isRunning) {
            // Try to update and render game
            try {
                canvas = surfaceHolder.lockCanvas();//Renders on the CPU rather than the GPU
                //canvas = surfaceHolder.lockHardwareCanvas();//Renders on the GPU rather than the CPU
                synchronized (surfaceHolder) {
                    game.update();
                    updateCount++;
                    game.draw(canvas);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } finally {
                try{
                    if(canvas != null) {
                        //sends the buffer to the compositor
                        surfaceHolder.unlockCanvasAndPost(canvas);
                        frameCount++;
                    }
                }catch (Surface.OutOfResourcesException outOfResourcesException){
                }
            }
            // Pause game loop to not exceed target UPS
            elapsedTime = System.currentTimeMillis() - startTime;
            sleepTime = (long) (updateCount*UPS_PERIOD - elapsedTime);
            if(sleepTime > 0) {
                try {
                    sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // Skip frames to keep up with target UPS
            while(sleepTime < 0 && updateCount < MAX_UPS-1) {
                updateCount++;
                elapsedTime = System.currentTimeMillis() - startTime;
                sleepTime = (long) (updateCount*UPS_PERIOD - elapsedTime);
            }
            // Calculate average UPS and FPS
            elapsedTime = System.currentTimeMillis() - startTime;
            if(elapsedTime >= 1000) {
                averageUPS = updateCount / (1E-3 * elapsedTime);
                averageFPS = frameCount / (1E-3 * elapsedTime);
                updateCount = 0;
                frameCount = 0;
                startTime = System.currentTimeMillis();
            }
        }
    }
    public double getAverageUPS() {
        return averageUPS;
    }

    public double getAverageFPS() {
        return averageFPS;
    }

    public void startLoop() {
        isRunning = true;
        start();
    }

    public void stopLoop() {
        isRunning = false;
        try {
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


