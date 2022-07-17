package com.javacodes.programs.algorithms.sorting;

import java.util.Arrays;

/**
 * Selection sort :
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked
 * and moved to the sorted subarray.
 */
public class SelectionSort {

    void sort(int[] unsortedArr){

        int arrLength = unsortedArr.length;

        System.out.println("unsorted Array : " + Arrays.toString(unsortedArr));

        for (int unsortedPosition = 0; unsortedPosition < arrLength - 1;  unsortedPosition++){

            System.out.println("Iteration : " + unsortedPosition);

            int minElementIndex = unsortedPosition;
            for (int index = unsortedPosition ; index < arrLength; index++){
                if (unsortedArr[minElementIndex] > unsortedArr[index]){
                    minElementIndex = index;
                }
            }

            int temp = unsortedArr[unsortedPosition];
            unsortedArr[unsortedPosition] = unsortedArr[minElementIndex];
            unsortedArr[minElementIndex] = temp;

            System.out.println(Arrays.toString(unsortedArr));

        }

    }

    public void execute() {
        int[] unsortedArr = {64,25,12,22,11};
        System.out.println("unsorted Array : " + Arrays.toString(unsortedArr));
        this.sort(unsortedArr);
    }
}
