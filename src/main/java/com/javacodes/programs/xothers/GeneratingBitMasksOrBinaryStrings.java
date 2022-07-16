package com.javacodes.programs.xothers;

public class GeneratingBitMasksOrBinaryStrings {

    public static void main(String args[]) {

        int n = 4;

        for (int i = 0; i < (int) Math.pow(2, n); ++i) {
            // generate bitmask, from 0..00 to 1..11
            System.out.println(i + " " + Integer.toBinaryString(i));
        }

        System.out.println("\n\n\n");

        int nthBit = 1 << n;
        System.out.println("nthBit "+nthBit);
        for (int i = 0; i < (int)Math.pow(2, n); ++i) {
            // generate bitmask, from 0..00 to 1..11
            int v = i | nthBit;
            System.out.println(i + " " + v + " " + Integer.toBinaryString(v)+ " " +Integer.toBinaryString(i | nthBit).substring(1));
        }
    }

}
