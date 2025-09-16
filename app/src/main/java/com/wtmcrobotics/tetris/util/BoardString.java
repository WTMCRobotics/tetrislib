package com.wtmcrobotics.tetris.util;

public class BoardString {
    /**
     * Takes in a board description string and converts it to a 2D array.
     * @param boardString
     * @return A 2D array representing the Tetris board
     */
    public static int[][] fromString(String boardString) throws IllegalArgumentException {
        /* Units:
         * - Empty
         * q Color 1
         * w Color 2
         * e Color 3
         * r Color 4
         * t Color 5
         * y Color 6
         * u Color 7
         * 
         * Rows are separated by /
         * A unit is prefixed with a number to indicate how many of that unit are in a row 1-(1)0
         */
        String[] rows = boardString.split("/");
        if (rows.length != 20) {
            throw new IllegalArgumentException("Board string must have exactly 20 rows.");
        }
        int[][] board = new int[20][10];

        int[] last_row = new int[10];
        for (int i = 0; i < 20; i++) {
            int j = 0;
            int current_row_size = 0;
            while (j < 10) {
                int val = 0;
                int count = 1;
                char count_c = rows[i].charAt(j);
                if (count_c == '*') {
                    if (i == 0) {
                        throw new IllegalArgumentException("First row cannot be a copy row.");
                    }
                    board[i] = last_row.clone();
                    current_row_size = 10;
                    j = 10;
                    continue;
                }
                j++;
                char val_c = rows[i].charAt(j);
                switch (count_c) {
                    case '0':
                        count = 10;
                        break;

                    case '1':
                        count = 1;
                        break;


                    case '2':
                        count = 2;
                        break;

                    case '3':
                        count = 3;
                        break;

                    case '4':
                        count = 4;
                        break;

                    case '5':
                        count = 5;
                        break;

                    case '6':
                        count = 6;
                        break;

                    case '7':
                        count = 7;
                        break;

                    case '8':
                        count = 8;
                        break;
                    case '9':
                        count = 9;
                        break;

                    default:
                        throw new IllegalArgumentException("Invalid count character: " + count_c);
                }
                switch (val_c) {
                    case '-':
                        val = 0;
                        break;

                    case 'q':
                        val = 1;
                        break;


                    case 'w':
                        val = 2;
                        break;

                    case 'e':
                        val = 3;
                        break;

                    case 'r':
                        val = 4;
                        break;

                    case 't':
                        val = 5;
                        break;

                    case 'y':
                        val = 6;
                        break;

                    case 'u':
                        val = 7;
                        break;

                    default:
                        throw new IllegalArgumentException("Invalid block character: " + val_c);
                }

                for (int k = 0; k < count; k++) {
                    if (current_row_size >= 10) {
                        throw new IllegalArgumentException("Row " + i + " exceeds 10 columns.");
                    }
                    board[i][current_row_size] = val;
                    current_row_size++;
                }
            }
            last_row = board[i];
        }

        return board;
    }
}
