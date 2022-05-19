package com.javacodes.programs.sorting;

import java.util.Arrays;

public class QuickSort {

    private int[] sort(int arr[]){
        return arr;
    }

    public void execute() {
        int[] unsortedArr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("unsorted Array : " + Arrays.toString(unsortedArr));
        int[] sortedArr = this.sort(unsortedArr);
        System.out.println("\nsorted Array : " + Arrays.toString(unsortedArr));
    }
}
