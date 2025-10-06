package com.wtmcrobotics.tetris;

import com.wtmcrobotics.tetris.Tetromino;

public class Board {
    public Tile[][] board;
    public Tetromino activetetromino;
    public Board() {
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 10; x++) {
                board[y][x] = new Tile(false, 0);
            }
        }  
    }

    public int[][] serialize() {
        int[][] out = new int[20][10];
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 10; x++) {
                out[y][x] = board[y][x].color();
            }
        }
        //TODO: Render active tetromino
        return out;
    } 

    public void solidifyTetromino(){
        activetetromino.getShape();
        for (int y = 0; y <4; y++) {
            for (int x = 0; x < 4; y++) {
                board[activetetromino.y + y][activetetromino.x + x] = new Tile(activetetromino.states[activetetromino.rotation][y][x] != 0, activetetromino.states[activetetromino.rotation][y][x]);
            }
        }
    }

}
