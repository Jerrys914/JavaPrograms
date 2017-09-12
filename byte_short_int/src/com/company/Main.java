package com.company;

public class Main {

    public static void main(String[] args) {
        // memory width if 32
        int myMinValue= -2_147_483_648;
        int myMaxValue= 2_147_483_647;

        // memory width if 8
        byte myByteMaxValue= 127;
        byte myByteMinValue= -128;

        // memory width if 16
        short myShortMaxValue= 32767;
        short myShortMinValue= -32768;

        // memory width of 64
        long myLongMaxValue= 9_223_372_036_854_775_807L;
        long myLongMinValue= -9_223_372_036_854_775_808L;
    }
}
