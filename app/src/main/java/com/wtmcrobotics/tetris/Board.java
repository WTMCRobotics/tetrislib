package com.wtmcrobotics.tetris;

public class Board {
    public Tile[][] board;
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

    

}
