package com.wtmcrobotics.graphics;

class Renderer {
	public int grid_size_x;
	public int grid_size_y;
	int[][] board;
	public Renderer(int grid_size_x, int grid_size_y) {
		this.grid_size_x = grid_size_x;
		this.grid_size_y = grid_size_y;
	}

	public void set_board(int[][] board) {
		this.board = board;
	}

	public void render() {
		//TODO: Do this
	}
}
