package com.wtmcrobotics.tetris.graphics;
import javax.swing.*;
import java.awt.*;

class GridRenderer extends JPanel {
    private final int gridSizeX;
    private final int gridSizeY;
    private final int cellSize;
    private int[][] board; // [[ROW], [ROW], [ROW], ...]

    public GridRenderer(int gridSizeX, int gridSizeY, int cellSize) {
        this.gridSizeX = gridSizeX;
        this.gridSizeY = gridSizeY;
        this.cellSize = cellSize;
        this.board = new int[gridSizeY][gridSizeX]; // Initialize with empty board
        setPreferredSize(new Dimension(gridSizeX * cellSize, gridSizeY * cellSize));
    }

    private final Color[] colors = {
            Color.BLACK, // 0 - empty
            Color.CYAN,  // 1 - I
            Color.YELLOW,// 2 - O
            Color.MAGENTA,// 3 - T
            Color.GREEN, // 4 - S
            Color.RED,   // 5 - Z
            Color.BLUE,  // 6 - J
            Color.ORANGE // 7 - L
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int y = 0; y < gridSizeY; y++) {
            for (int x = 0; x < gridSizeX; x++) {
                int cellValue = board[y][x];
                g.setColor(colors[cellValue]);
                g.fillRect(x * cellSize, y * cellSize, cellSize, cellSize);
                g.setColor(Color.DARK_GRAY);
                g.drawRect(x * cellSize, y * cellSize, cellSize, cellSize);
            }
        }
    }
    
    public void setBoard(int[][] board) {
        this.board = board;
    }
}