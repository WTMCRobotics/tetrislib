package com.wtmcrobotics.tetris.graphics;
import javax.swing.*;
import java.awt.*;
import GridRenderer;

class Renderer {
	public int grid_size_x;
	public int grid_size_y;
	int[][] board; // [[ROW], [ROW], [ROW], ...]
	private GridRenderer gridRenderer;
	public Renderer(int grid_size_x, int grid_size_y) {
		this.grid_size_x = grid_size_x;
		this.grid_size_y = grid_size_y;
		gridRenderer = new GridRenderer(grid_size_x, grid_size_y, 30);
		board = new int[grid_size_y][grid_size_x]; // Initialize with empty board
		JFrame frame = new JFrame("Tetris");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gridRenderer);
		frame.pack();
		frame.setVisible(true);
	}

	public void set_board(int[][] board) {
		this.board = board;
	}

	public void render() {
		gridRenderer.setBoard(board);
		gridRenderer.repaint();
	}
}
