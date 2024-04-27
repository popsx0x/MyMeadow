package com.example.myapplication;

//imports
import android.graphics.Canvas;
import android.view.SurfaceHolder;



//new class mainthread, this class will create a thread
//a thread is a bit of code that can run along the main part of the code
public class MainThread  extends Thread {
    //variables and references
    private SurfaceHolder surfaceHolder;
    private GameView gameView;
    private boolean running;
    public static Canvas canvas;

    //constructor - calls super, the superclass which refers to thread
    public MainThread(SurfaceHolder surfaceHolder, GameView gameView) {

        super();
        this.surfaceHolder = surfaceHolder;
        this.gameView = gameView;

        }

    //overriding the method run
    //main game loop
    @Override
    public void run() {
        while(running) {
            canvas = null;

            try {
                //each cycle will lock the canvas - prevents more than one thread trying to draw at once
                //update the positions of the characters and elements
                //then calls a method to draw the new image
                canvas = this.surfaceHolder.lockCanvas();
                synchronized (surfaceHolder) {
                    this.gameView.update();
                    this.gameView.draw(canvas);
                }
                //catch is there to handle errors
            } catch (Exception e) {
                System.out.println(">>> Error in Mainthread::run: " + e);
                break;
            }
            finally {
                if(canvas != null)
                {
                    //try and catch are requirements of java, handle errors that could occur
                    //..if canvas isnt ready yet
                    try {
                        surfaceHolder.unlockCanvasAndPost(canvas);
                    }
                    catch (Exception e){e.printStackTrace();}
                }
            }
        }
    }

    //this method sets running boolean
    public void setRunning (boolean isRunning) {
        running = isRunning; }
}
