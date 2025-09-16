package com.wtmcrobotics.tetris.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public record BoardStringTest() {
    @Test
    void testEmptyBoardstringNoCopy() {
        int[][] expected = new int[20][10];
        int[][] actual = BoardString.fromString("0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-/0-");
        assertEquals(expected, actual);
    }

    @Test
    void testEmptyBoardstringYesCopy() {
        int[][] expected = new int[20][10];
        int[][] actual = BoardString.fromString("0-/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        assertEquals(expected, actual);
    }
}
