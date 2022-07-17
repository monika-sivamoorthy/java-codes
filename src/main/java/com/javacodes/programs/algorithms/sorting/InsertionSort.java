package com.javacodes.programs.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    void sort(int[] unsortedArr){

        int arrLength = unsortedArr.length;

        for (int unsortedPosition = 0; unsortedPosition < arrLength; unsortedPosition++){

            System.out.println("Iteration : " + unsortedPosition);

            int key = unsortedArr[unsortedPosition];
            int index = unsortedPosition-1;
            while ( index >= 0 ) {
                if (key < unsortedArr[index]){
                    unsortedArr[index+1] = unsortedArr[index];
                    index-=1;
                    continue;
                }
                break;
            }
            unsortedArr[index+1] = key;

            System.out.println(Arrays.toString(unsortedArr));

        }

    }

    public void execute() {
        int[] unsortedArr = { 12, 11, 13, 5, 6 };
        System.out.println("unsorted Array : " + Arrays.toString(unsortedArr));
        this.sort(unsortedArr);
    }
}
