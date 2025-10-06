package com.wtmcrobotics.tetris;

import java.util.ArrayList;
import com.wtmcrobotics.tetris.RotationState;


public class Tetromino {
    int x;
    int y;
    int rotation;
    PieceType type;
    int states[][][];

    public Tetromino(PieceType type, int rotation) {
        x = 5;
        y = 20;
        this.rotation = rotation;
        this.type = type;

        switch (this.type) {
            case TYPE_O:
                this.states = new int[][][]{RotationState.O};
                break;
            case TYPE_I:
                this.states = new int[][][]{RotationState.I1,RotationState.I2};
                break;
            case TYPE_J:
                this.states = new int[][][]{RotationState.I1,RotationState.I2};
                break;
            case TYPE_L:
                this.states = new int[][][]{RotationState.I1,RotationState.I2};
                break;
            case TYPE_S:
                this.states = new int[][][]{RotationState.I1,RotationState.I2};
                break;
            case TYPE_T:
                this.states = new int[][][]{RotationState.I1,RotationState.I2};
                break;
            case TYPE_Z:
                this.states = new int[][][]{RotationState.I1,RotationState.I2};
                break;

            default:
                this.states = new int[][][]{RotationState.EMPTY};
                break;
        }
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

    public PieceType getType(){
        return type;
    }

    public void movePiece(int x, int y){
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public void rotatePiece(int rotate){
        rotation = rotate;
    }

    public int[][] getShape(){
        return states[rotation];
    }
}
