package com.wtmcrobotics.tetris;

import com.wtmcrobotics.tetris.graphics.Renderer;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static Renderer renderer;
    private static Board board;
    public static void main(String[] args) {
        renderer = new Renderer(10, 20);
        board = new Board();
        while (true) {
            renderer.set_board(board.serialize());
            renderer.render();
            
        }
    }
}
