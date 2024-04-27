package com.example.myapplication.graphics;

import android.graphics.Canvas;
import android.graphics.Rect;

public abstract class Tile {

    public final Rect mapLocationRect;

    public Tile(Rect mapLocationRect) {
        this.mapLocationRect = mapLocationRect;
    }

    public enum TileType{

        //GARDEN TILES
        //0
        GRASS_TILE,
        //1
        DIRT_TILE,
        //2
        CLEAN_DIRT_TILE,
        //3
        FERTILIZED_DIRT_TILE,
        //4
        FLOWER1_GROW1_TILE,
        //5
        FLOWER2_GROW1_TILE,
        //6
        FLOWER3_GROW1_TILE,
        //7
        FLOWER4_GROW1_TILE,
        //8
        FLOWER5_GROW1_TILE,
        //9
        FLOWER1_GROW2_TILE,
        //10
        FLOWER2_GROW2_TILE,
        //11
        FLOWER3_GROW2_TILE,
        //12
        FLOWER4_GROW2_TILE,
        //13
        FLOWER5_GROW2_TILE,
        //14
        FLOWER1_GROW3_TILE,
        //15
        FLOWER2_GROW3_TILE,
        //16
        FLOWER3_GROW3_TILE,
        //17
        FLOWER4_GROW3_TILE,
        //18
        FLOWER5_GROW3_TILE,
        //19
        FLOWER_1_TILE,
        //20
        FLOWER_2_TILE,
        //21
        FLOWER_3_TILE,
        //22
        FLOWER_4_TILE,
        //23
        FLOWER_5_TILE,
        //24
        SELECTED_DIRT,
        //25
        SELECTED_CLEAN_DIRT,
        //26
        SELECTED_FERTILIZED_DIRT,
        //27
        SELECTED_FLOWER1_GROW1_TILE,
        //28
        SELECTED_FLOWER2_GROW1_TILE,
        //29
        SELECTED_FLOWER3_GROW1_TILE,
        //30
        SELECTED_FLOWER4_GROW1_TILE,
        //31
        SELECTED_FLOWER5_GROW1_TILE,
        //32
        SELECTED_FLOWER1_GROW2_TILE,
        //33
        SELECTED_FLOWER2_GROW2_TILE,
        //34
        SELECTED_FLOWER3_GROW2_TILE,
        //35
        SELECTED_FLOWER4_GROW2_TILE,
        //36
        SELECTED_FLOWER5_GROW2_TILE,
        //37
        SELECTED_FLOWER1_GROW3_TILE,
        //38
        SELECTED_FLOWER2_GROW3_TILE,
        //39
        SELECTED_FLOWER3_GROW3_TILE,
        //40
        SELECTED_FLOWER4_GROW3_TILE,
        //41
        SELECTED_FLOWER5_GROW3_TILE,
       //42
        SELECTED_FLOWER1_TILE,
        //43
        SELECTED_FLOWER2_TILE,
        //44
        SELECTED_FLOWER3_TILE,
        //45
        SELECTED_FLOWER4_TILE,
        //46
        SELECTED_FLOWER5_TILE,

        //GREENHOUSE TILES
        //47
        WALL_TILE,
        //48
        SHELF_TILE,
        //49
        POT_TILE,
        //50
        GH_FLOWER1_GROW1_TILE,
        //51
        GH_FLOWER2_GROW1_TILE,
        //52
        GH_FLOWER3_GROW1_TILE,
        //53
        GH_FLOWER4_GROW1_TILE,
        //54
        GH_FLOWER5_GROW1_TILE,
        //55
        GH_FLOWER1_GROW2_TILE,
        //56
        GH_FLOWER2_GROW2_TILE,
        //57
        GH_FLOWER3_GROW2_TILE,
        //58
        GH_FLOWER4_GROW2_TILE,
        //59
        GH_FLOWER5_GROW2_TILE,
        //60
        GH_FLOWER1_GROW3_TILE,
        //61
        GH_FLOWER2_GROW3_TILE,
        //62
        GH_FLOWER3_GROW3_TILE,
        //63
        GH_FLOWER4_GROW3_TILE,
        //64
        GH_FLOWER5_GROW3_TILE,
        //65
        GH_FLOWER1_TILE,
        //66
        GH_FLOWER2_TILE,
        //67
        GH_FLOWER3_TILE,
        //68
        GH_FLOWER4_TILE,
        //69
        GH_FLOWER5_TILE,
        //SELECTED GREENHOUSE TILES
        //70
        SELECTED_POT_TILE,
        GH_SELECTED_FLOWER1_GROW1,
        GH_SELECTED_FLOWER2_GROW1,
        GH_SELECTED_FLOWER3_GROW1,
        GH_SELECTED_FLOWER4_GROW1,
        GH_SELECTED_FLOWER5_GROW1,
        GH_SELECTED_FLOWER1_GROW2,
        GH_SELECTED_FLOWER2_GROW2,
        GH_SELECTED_FLOWER3_GROW2,
        GH_SELECTED_FLOWER4_GROW2,
        GH_SELECTED_FLOWER5_GROW2,
        GH_SELECTED_FLOWER1_GROW3,
        GH_SELECTED_FLOWER2_GROW3,
        GH_SELECTED_FLOWER3_GROW3,
        GH_SELECTED_FLOWER4_GROW3,
        GH_SELECTED_FLOWER5_GROW3,
        GH_SELECTED_FLOWER1,
        GH_SELECTED_FLOWER2,
        GH_SELECTED_FLOWER3,
        GH_SELECTED_FLOWER4,
        GH_SELECTED_FLOWER5,
        GH_FERTILIZED_POT_TILE,
        GH_SELECTED_FERTILIZED_POT_TILE,






    }
    public static Tile getTile(int idxTileType, SpriteSheet spriteSheet, Rect mapLocationRect){
        switch(TileType.values()[idxTileType]){

                //0
            case GRASS_TILE:
                return new GrassTile(spriteSheet, mapLocationRect);
                //1
            case DIRT_TILE:
                return new DirtTile(spriteSheet, mapLocationRect);
                //2
            case CLEAN_DIRT_TILE:
                return new CleanDirtTile(spriteSheet, mapLocationRect);
                //3
            case FERTILIZED_DIRT_TILE:
                return new FertilisedDirtTile(spriteSheet, mapLocationRect);
                //4
            case FLOWER1_GROW1_TILE:
                return new Flower1Grow1Tile(spriteSheet, mapLocationRect);
                //5
            case FLOWER2_GROW1_TILE:
                return new Flower2Grow1Tile(spriteSheet, mapLocationRect);
                //6
            case FLOWER3_GROW1_TILE:
                return new Flower3Grow1Tile(spriteSheet, mapLocationRect);
                //7
            case FLOWER4_GROW1_TILE:
                return new Flower4Grow1Tile(spriteSheet, mapLocationRect);
                //8
            case FLOWER5_GROW1_TILE:
                return new Flower5Grow1Tile(spriteSheet, mapLocationRect);
                //9
            case FLOWER1_GROW2_TILE:
                return new Flower1Grow2Tile(spriteSheet, mapLocationRect);
                //10
            case FLOWER2_GROW2_TILE:
                return new Flower2Grow2Tile(spriteSheet, mapLocationRect);
            //11
            case FLOWER3_GROW2_TILE:
                return new Flower3Grow2Tile(spriteSheet, mapLocationRect);
            //12
            case FLOWER4_GROW2_TILE:
                return new Flower4Grow2Tile(spriteSheet, mapLocationRect);
            //13
            case FLOWER5_GROW2_TILE:
                return new Flower5Grow2Tile(spriteSheet, mapLocationRect);
                //14
            case FLOWER1_GROW3_TILE:
                return new Flower1Grow3Tile(spriteSheet, mapLocationRect);
                //15
            case FLOWER2_GROW3_TILE:
                return new Flower2Grow3Tile(spriteSheet, mapLocationRect);
            //16
            case FLOWER3_GROW3_TILE:
                return new Flower3Grow3Tile(spriteSheet, mapLocationRect);
            //17
            case FLOWER4_GROW3_TILE:
                return new Flower4Grow3Tile(spriteSheet, mapLocationRect);
            //18
            case FLOWER5_GROW3_TILE:
                return new Flower5Grow3Tile(spriteSheet, mapLocationRect);

                //19
            case FLOWER_1_TILE:
                return new Flower1Tile(spriteSheet, mapLocationRect);
                //20
            case FLOWER_2_TILE:
                return new Flower2Tile(spriteSheet, mapLocationRect);
            //21
            case FLOWER_3_TILE:
                return new Flower3Tile(spriteSheet, mapLocationRect);
            //22
            case FLOWER_4_TILE:
                return new Flower4Tile(spriteSheet, mapLocationRect);
            //23
            case FLOWER_5_TILE:
                return new Flower5Tile(spriteSheet, mapLocationRect);
            //24
            case SELECTED_DIRT:
                return new SelectedDirtTile(spriteSheet, mapLocationRect);

                //12
            case SELECTED_CLEAN_DIRT:
                return new SelectedCleanDirt(spriteSheet, mapLocationRect);

                //26
            case SELECTED_FERTILIZED_DIRT:
                return new SelectedFertilizedDirt(spriteSheet, mapLocationRect);
                //27
            case SELECTED_FLOWER1_GROW1_TILE:
                return new SelectedFlower1Grow1Tile(spriteSheet, mapLocationRect);
                //28
            case SELECTED_FLOWER2_GROW1_TILE:
                return new SelectedFlower2Grow1Tile(spriteSheet, mapLocationRect);
                //29
            case SELECTED_FLOWER3_GROW1_TILE:
                return new SelectedFlower3Grow1Tile(spriteSheet, mapLocationRect);
            //30
            case SELECTED_FLOWER4_GROW1_TILE:
                return new SelectedFlower4Grow1Tile(spriteSheet, mapLocationRect);
            //31
            case SELECTED_FLOWER5_GROW1_TILE:
                return new SelectedFlower5Grow1Tile(spriteSheet, mapLocationRect);
            //32
            case SELECTED_FLOWER1_GROW2_TILE:
                return new SelectedFlower1Grow2Tile(spriteSheet, mapLocationRect);

            case SELECTED_FLOWER2_GROW2_TILE:
                return new SelectedFlower2Grow2Tile(spriteSheet, mapLocationRect);

            case SELECTED_FLOWER3_GROW2_TILE:
                return new SelectedFlower3Grow2Tile(spriteSheet, mapLocationRect);

            case SELECTED_FLOWER4_GROW2_TILE:
                return new SelectedFlower4Grow2Tile(spriteSheet, mapLocationRect);
            //15
            case SELECTED_FLOWER1_GROW3_TILE:
                return new SelectedFlower1Grow3Tile(spriteSheet, mapLocationRect);
            case SELECTED_FLOWER2_GROW3_TILE:
                return new SelectedFlower2Grow3Tile(spriteSheet, mapLocationRect);
            case SELECTED_FLOWER3_GROW3_TILE:
                return new SelectedFlower3Grow3Tile(spriteSheet, mapLocationRect);
            case SELECTED_FLOWER4_GROW3_TILE:
                return new SelectedFlower4Grow3Tile(spriteSheet, mapLocationRect);
                case SELECTED_FLOWER5_GROW3_TILE:
                return new SelectedFlower5Grow3Tile(spriteSheet, mapLocationRect);


                //16
            case SELECTED_FLOWER1_TILE:
                return new SelectedFlower1Tile(spriteSheet, mapLocationRect);
          //17
            case SELECTED_FLOWER2_TILE:
                return new SelectedFlower2Tile(spriteSheet, mapLocationRect);
            //18
            case SELECTED_FLOWER3_TILE:
                return new SelectedFlower3Tile(spriteSheet, mapLocationRect);
            //19
            case SELECTED_FLOWER4_TILE:
                return new SelectedFlower4Tile(spriteSheet, mapLocationRect);
            //20
            case SELECTED_FLOWER5_TILE:
                return new SelectedFlower5Tile(spriteSheet, mapLocationRect);



                //GREENHOUSE TILES
            //22
            case WALL_TILE:
                return new WallTile(spriteSheet, mapLocationRect);
            //23
            case SHELF_TILE:
                return new ShelfTile(spriteSheet, mapLocationRect);
            //24
            case POT_TILE:
                return new GhPotTile(spriteSheet, mapLocationRect);
            //25
            case GH_FLOWER1_GROW1_TILE:
                return new GhFlower1Grow1Tile(spriteSheet, mapLocationRect);
            case GH_FLOWER2_GROW1_TILE:
                return new GhFlower2Grow1Tile(spriteSheet, mapLocationRect);
            case GH_FLOWER3_GROW1_TILE:
                return new GhFlower3Grow1Tile(spriteSheet, mapLocationRect);
            case GH_FLOWER4_GROW1_TILE:
                return new GhFlower4Grow1Tile(spriteSheet, mapLocationRect);
            case GH_FLOWER5_GROW1_TILE:
                return new GhFlower5Grow1Tile(spriteSheet, mapLocationRect);

            //26
            case GH_FLOWER1_GROW2_TILE:
                return new GhFlower1Grow2Tile(spriteSheet, mapLocationRect);
            case GH_FLOWER2_GROW2_TILE:
                return new GhFlower2Grow2Tile(spriteSheet, mapLocationRect);
            case GH_FLOWER3_GROW2_TILE:
                return new GhFlower3Grow2Tile(spriteSheet, mapLocationRect);
            case GH_FLOWER4_GROW2_TILE:
                return new GhFlower4Grow2Tile(spriteSheet, mapLocationRect);
            case GH_FLOWER5_GROW2_TILE:
                return new GhFlower5Grow2Tile(spriteSheet, mapLocationRect);
            //27
            case GH_FLOWER1_GROW3_TILE:
                return new GhFlower1Grow3Tile(spriteSheet, mapLocationRect);
            //28
            case GH_FLOWER2_GROW3_TILE:
                return new GhFlower2Grow3Tile(spriteSheet, mapLocationRect);
            //29
            case GH_FLOWER3_GROW3_TILE:
                return new GhFlower3Grow3Tile(spriteSheet, mapLocationRect);
            //30
            case GH_FLOWER4_GROW3_TILE:
                return new GhFlower4Grow3Tile(spriteSheet, mapLocationRect);
            //31
            case GH_FLOWER5_GROW3_TILE:
                return new GhFlower5Grow3Tile(spriteSheet, mapLocationRect);
            //32
            case GH_FLOWER1_TILE:
                return new GhFlower1Tile(spriteSheet, mapLocationRect);
            //33
            case GH_FLOWER2_TILE:
                return new GhFlower2Tile(spriteSheet, mapLocationRect);
            //34
            case GH_FLOWER3_TILE:
                return new GhFlower3Tile(spriteSheet, mapLocationRect);
            //35
            case GH_FLOWER4_TILE:
                return new GhFlower4Tile(spriteSheet, mapLocationRect);
            //36
            case GH_FLOWER5_TILE:
                return new GhFlower5Tile(spriteSheet, mapLocationRect);

                //SELECTED GREENHOUSE TILES
                //37
            case SELECTED_POT_TILE:
                return new GhSelectedPotTile(spriteSheet, mapLocationRect);
                //selected flower grow1
            case GH_SELECTED_FLOWER1_GROW1:
                return new GhSelectedFlower1Grow1Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER2_GROW1:
                return new GhSelectedFlower2Grow1Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER3_GROW1:
                return new GhSelectedFlower3Grow1Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER4_GROW1:
                return new GhSelectedFlower4Grow1Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER5_GROW1:
                return new GhSelectedFlower5Grow1Tile(spriteSheet, mapLocationRect);

                //selected flower grow2
            case GH_SELECTED_FLOWER1_GROW2:
                return new GhSelectedFlower1Grow2Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER2_GROW2:
                return new GhSelectedFlower2Grow2Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER3_GROW2:
                return new GhSelectedFlower3Grow2Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER4_GROW2:
                return new GhSelectedFlower4Grow2Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER5_GROW2:
                return new GhSelectedFlower5Grow2Tile(spriteSheet, mapLocationRect);

                //selected flower grow3
            case GH_SELECTED_FLOWER1_GROW3:
                return new GhSelectedFlower1Grow3Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER2_GROW3:
                return new GhSelectedFlower2Grow3Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER3_GROW3:
                return new GhSelectedFlower3Grow3Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER4_GROW3:
                return new GhSelectedFlower4Grow3Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER5_GROW3:
                return new GhSelectedFlower5Grow3Tile(spriteSheet, mapLocationRect);

                //selected flower
            case GH_SELECTED_FLOWER1:
                return new GhSelectedFlower1Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER2:
                return new GhSelectedFlower2Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER3:
                return new GhSelectedFlower3Tile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FLOWER4:
                return new GhSelectedFlower4Tile(spriteSheet, mapLocationRect);
                case GH_SELECTED_FLOWER5:
                return new GhSelectedFlower5Tile(spriteSheet, mapLocationRect);

                //FERTILIZED POT TILE
            case GH_FERTILIZED_POT_TILE:
                return new GhFertilizedPotTile(spriteSheet, mapLocationRect);
            case GH_SELECTED_FERTILIZED_POT_TILE:
                return new GhSelectedFertilizedPotTile(spriteSheet, mapLocationRect);

            default:
                return null;
        }
    }

    public abstract  void draw(Canvas canvas);

}
