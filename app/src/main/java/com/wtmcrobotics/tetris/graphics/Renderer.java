package com.wtmcrobotics.tetris.graphics;
import javax.swing.*;

/**
 * Renderer class that contains all rendering logic.
 */
public class Renderer {
	public int grid_size_x;
	public int grid_size_y;
	int[][] board; // [[ROW], [ROW], [ROW], ...]
	private GridRenderer gridRenderer;
	/**
	 * Initializes the renderer with a grid of given size
	 * @param grid_size_x Number of columns
	 * @param grid_size_y Number of rows
	 */
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

	/**
	 * Sets the board state to be rendered
	 * @param board 2D array representing the board state
	*/
	public void set_board(int[][] board) {
		this.board = board;
	}

	/**
	 * Pushes the current board state to the renderer and repaints
	 */
	public void render() {
		gridRenderer.setBoard(board);
		gridRenderer.repaint();
	}
}
