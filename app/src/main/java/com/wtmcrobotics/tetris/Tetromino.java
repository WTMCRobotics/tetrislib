package com.wtmcrobotics.tetris;

import java.util.ArrayList;

public class Tetromino {
    int x;
    int y;
    int rotation;
    int type;

    public Tetromino(int type, int rotation) {
        x = 5;
        y = 20;
        this.rotation = rotation;
        this.type = type;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getRotation(){
        return rotation;
    }

    public int getType(){
        return type;
    }

    public void movePiece(int x, int y){
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public void rotatePiece(int rotate){
        rotation = rotate;
    }
}
