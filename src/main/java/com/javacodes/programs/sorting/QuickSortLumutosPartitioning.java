package com.javacodes.programs.sorting;

import java.util.Arrays;

/**
 * Lumuto's Partitioning
 * Inplace Partitioning
 *
 */
public class QuickSortLumutosPartitioning {

    private int[] sort(int[] arr, int start, int end){

        // leaf node or empty partition
        if (start >= end){
            return arr;
        }

        // Note:
        // Non-deterministic pivot, randomize quick sort
        // we can pick random pivot and swap it with extreme left and continue this step
        int pivot = arr[start];

        int smaller = start;
        for (int bigger = smaller+1; bigger <= end; bigger++){
            if (arr[bigger] <= pivot) {
                smaller++;
                int temp = arr[bigger];
                arr[bigger] = arr[smaller];
                arr[smaller] = temp;
            }
        }

        // swap pivot to middle
        int temp = arr[smaller];
        arr[smaller] = arr[start];
        arr[start] = temp;

        // Divide step
        arr = sort(arr, start, smaller-1);
        arr = sort(arr, smaller+1 ,end);

        return arr;
    }

    public void execute() {
        int[] unsortedArr = { 12, 11, 13, 9, 6, 7 };
        int arrLength = unsortedArr.length;

        System.out.println("unsorted Array : " + Arrays.toString(unsortedArr));
        int[] sortedArr = this.sort(unsortedArr, 0, arrLength-1);
        System.out.println("\nsorted Array : " + Arrays.toString(sortedArr));
    }
}
