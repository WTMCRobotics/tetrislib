package com.wtmcrobotics.tetris;

public class RotationState {

    public static final int[][] EMPTY = {
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0},
        {0,0,0,0}};

    public static final int[][] O = {
        {0,0,0,0},
        {0,1,1,0},
        {0,1,1,0},
        {0,0,0,0}};

        public static final int[][] I1 = {
        {0,0,0,0},
        {0,0,0,0},
        {2,2,2,2},
        {0,0,0,0}};

        public static final int[][] I2 = {
        {0,2,0,0},
        {0,2,0,0},
        {0,2,0,0},
        {0,2,0,0}};

        public static final int[][] J1 = {
        {0,0,0,0},
        {3,3,3,0},
        {0,0,3,0},
        {0,0,0,0}};
        
        public static final int[][] J2 = {
        {0,3,0,0},
        {0,3,0,0},
        {3,3,0,0},
        {0,0,0,0}};

        public static final int[][] J3 = {
        {3,0,0,0},
        {3,3,3,0},
        {0,0,0,0},
        {0,0,0,0}};

        public static final int[][] J4 = {
        {0,4,4,0},
        {0,4,0,0},
        {0,4,0,0},
        {0,0,0,0}};

        public static final int[][] L1 = {
        {0,0,0,0},
        {4,4,4,0},
        {4,0,0,0},
        {0,0,0,0}};
        
        public static final int[][] L2 = {
        {4,4,0,0},
        {0,4,0,0},
        {0,4,0,0},
        {0,0,0,0}};

        public static final int[][] L3 = {
        {0,0,4,0},
        {4,4,4,0},
        {0,0,0,0},
        {0,0,0,0}};

        public static final int[][] L4 = {
        {0,4,0,0},
        {0,4,0,0},
        {0,4,4,0},
        {0,0,0,0}};

        public static final int[][] S1 = {
        {0,5,5,0},
        {5,5,0,0},
        {0,0,0,0},
        {0,0,0,0}};

        public static final int[][] S2 = {
        {0,5,0,0},
        {0,5,5,0},
        {0,0,5,0},
        {0,0,0,0}};

        public static final int[][] S3 = {
        {0,5,5,0},
        {5,5,0,0},
        {0,0,0,0},
        {0,0,0,0}};

        public static final int[][] S4 = {
        {0,5,0,0},
        {0,5,5,0},
        {0,0,5,0},
        {0,0,0,0}};

        public static final int[][] T1 = {
        {0,0,0,0},
        {6,6,6,0},
        {0,6,0,0},
        {0,0,0,0}};

        public static final int[][] T2 = {
        {0,6,0,0},
        {6,6,0,0},
        {0,6,0,0},
        {0,0,0,0}};
        
        public static final int[][] T3 = {
        {0,6,0,0},
        {6,6,6,0},
        {0,0,0,0},
        {0,0,0,0}};

        public static final int[][] T4 = {
        {0,6,0,0},
        {0,6,6,0},
        {0,6,0,0},
        {0,0,0,0}};

        public static final int[][] Z1 = {
        {7,7,0,0},
        {0,7,7,0},
        {0,0,0,0},
        {0,0,0,0}};

        public static final int[][] Z2 = {
        {0,0,7,0},
        {0,7,7,0},
        {0,7,0,0},
        {0,0,0,0}};

        public static final int[][] Z3 = {
        {7,7,0,0},
        {0,7,7,0},
        {0,0,0,0},
        {0,0,0,0}};

        public static final int[][] Z4 = {
        {0,0,7,0},
        {0,7,7,0},
        {0,7,0,0},
        {0,0,0,0}};
}
