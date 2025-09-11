package com.wtmcrobotics;

public class Board {
    public Tile[][] board;
    public Board() {
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 10; x++) {
                board[y][x] = new Tile(false, 0);
            }
        }  
    }
}
