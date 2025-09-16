package com.wtmcrobotics.tetris;

import com.wtmcrobotics.tetris.graphics.Renderer;

public class Main {
    private static Renderer renderer;
    public static void main(String[] args) {
        renderer = new Renderer(10, 20);
    }
}
