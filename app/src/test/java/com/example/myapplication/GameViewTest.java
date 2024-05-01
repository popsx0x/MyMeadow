package com.example.myapplication;



import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.powermock.api.mockito.PowerMockito.spy;
import static org.powermock.api.mockito.PowerMockito.when;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;


import com.example.myapplication.graphics.SpriteSheet;
import com.example.myapplication.graphics.Tilemap;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.FieldSetter;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest({GameView.class, Tilemap.class})
public class GameViewTest {

 private MotionEvent touchEvent;

 @Before
 public void setUp() throws Exception {
  //touchEvent = MotionEvent.obtain(200, 300, MotionEvent.ACTION_MOVE, 15.0f, 10.0f, 0);
 }


    //@Mock
   // Tilemap tilemap;

 //@InjectMocks
 //GameView gameView;

  //  @Mock
  //  MotionEvent motionEvent;

  //@Mock
   //SurfaceView surfaceView;


   //SurfaceHolder surfaceHolder;


    @Test
    public void onTouchEvent() throws Exception {
     //PowerMockito.whenNew(GameView.class).withAnyArguments().thenReturn(gameView);
    // PowerMockito.whenNew(KafkaConsumer.class).withAnyArguments().thenReturn(mockConsumer);
     //PowerMockito.mock(GameView.class);
    // PowerMockito.mock(SurfaceView.class);
 //    PowerMockito.when(surfaceView.geHolder()).thenReturn(surfaceHolder);
     //when(surfaceView.getHolder()).thenReturn(surfaceHolder);
      //  SurfaceView mockedSurfaceView = PowerMockito.mock(SurfaceView.class);
      //  PowerMockito.whenNew(SurfaceView.class).withNoArguments().thenReturn(mockedSurfaceView);
       // GameView gameView = new GameView(cop);

   // MotionEvent motionEvent = MotionEvent.obtain(200, 300, MotionEvent.ACTION_MOVE, 1.0f, 0.0f, 0);
   //motionEvent.source = InputDevice.SOURCE_MOUSE;
   // MotionEvent mockMionEvent = PowerMockito.mock(MotionEvent.class);
   //  PowerMockito.whenNew(MotionEvent.class).withAnyArguments().thenReturn(mockMionEvent);
   //  MotionEvent motionEvent = new M

      GameView gameView = PowerMockito.mock(GameView.class);
       Context context = PowerMockito.mock(Context.class);
       //GameView gameView = new GameView(context, null);

        //BitmapFactory bitmapFactory = PowerMockito.mock(BitmapFactory.class);
          //PowerMockito.whenNew(BitmapFactory.class).withAnyArguments().thenReturn(bitmapFactory);
       // Bitmap bitmap = PowerMockito.mock(Bitmap.class);

        when(gameView.onTouchEvent(any())).thenCallRealMethod();


        //GameView gameView =  spy(new GameView(context));
  //   PowerMockito.whenNew(GameView.class).withAnyArguments().thenReturn(mockGameView);

      //Context context = PowerMockito.mock(Context.class);Context context = PowerMockito.mock(Context.class);
     //  PowerMockito.whenNew(Context.class).withAnyArguments().thenReturn(context);

   //SurfaceView surfaceView = PowerMockito.mock(SurfaceView.class);
      // PowerMockito.whenNew(SurfaceView.class).withAnyArguments().thenReturn(surfaceView);
   // /   mockGameView
      //SurfaceHolder surfaceHolder = Mockito.mock(SurfaceHolder.class);
       //PowerMockito.whenNew(SurfaceHolder.class).withAnyArguments().thenReturn(surfaceHolder);

       //when(gameView.getHolder()).thenReturn(surfaceHolder);

       //GameView gameView = new GameView(context);
        //PowerMockito.mockStatic(Log.class);
        Tilemap mockTileMap = PowerMockito.mock(Tilemap.class);

       //FieldSetter.setField(mockTileMap, mockTileMap.getClass().getDeclaredField("tilemap"), mockTileMap);

        SpriteSheet mockSpriteSheet = PowerMockito.mock(SpriteSheet.class);
        gameView.tilemap = mockTileMap;


        Rect rect = PowerMockito.mock(Rect.class);
        when(gameView.tilemap.getRectByIndex(anyInt(), anyInt())).thenReturn(rect);

        MotionEvent mockMionEvent = PowerMockito.mock(MotionEvent.class);
        when(mockMionEvent.getX()).thenReturn(5.0f);
        when(mockMionEvent.getY()).thenReturn(5.0f);

        boolean result =  gameView.onTouchEvent(mockMionEvent);

        assertEquals(true, result);

    }

}