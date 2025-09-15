package com.wtmcrobotics.tetris;

import com.wtmcrobotics.tetris.graphics.Renderer;

public class Main {
    private static Renderer renderer;
    public static void main(String[] args) {
        renderer = new Renderer(10, 20);

        while (true) {
            // Example board state for testing
            int[][] board = new int[20][10];
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 10; j++) {
                    board[i][j] = (Math.random() > 0.8) ? 1 : 0; // Randomly fill some cells
                }
            }
            renderer.set_board(board);
            renderer.render();
            try {
                Thread.sleep(500); // Pause for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
