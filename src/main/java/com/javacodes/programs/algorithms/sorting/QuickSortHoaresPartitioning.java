package com.javacodes.programs.algorithms.sorting;

import java.util.Arrays;

public class QuickSortHoaresPartitioning {

    private int[] sort(int[] arr, int start, int end){

        // leaf node or empty partition
        if (start >= end){
            return arr;
        }

        // Note:
        // Non-deterministic pivot, randomize quick sort
        // we can pick random pivot and swap it with extreme left and continue this step
        // int pivot = arr[start];

        System.out.println("\nPivot index, value, endIndex: " + start + " "  + arr[start] + " " + end + " "+ Arrays.toString(arr));

        // TWO POINTERS
        int smaller = start+1;
        int bigger = end;
        while (smaller <= bigger){
            if (arr[smaller] <= arr[start]) {
                smaller++;
            }
            else if(arr[bigger] > arr[start]) {
                bigger--;
            }
            else {
                int temp = arr[smaller];
                arr[smaller] = arr[bigger];
                arr[bigger] = temp;
                smaller++;
                bigger--;
            }
        }

        // smaller and bigger crossed each other so , move pivot to bigger
        int temp = arr[bigger];
        arr[bigger] = arr[start];
        arr[start] = temp;

        System.out.println("Partitioning result " + Arrays.toString(arr));

        // Divide step
        arr = sort(arr, start, bigger-1);
        arr = sort(arr, bigger+1 ,end);

        return arr;

    }


    public void execute() {
        int[] unsortedArr = { 12, 11, 13, 9, 6, 7, 14, 63, 9 };
        int arrLength = unsortedArr.length;

        System.out.println("unsorted Array : " + Arrays.toString(unsortedArr));
        int[] sortedArr = this.sort(unsortedArr, 0, arrLength-1);
        System.out.println("\nsorted Array : " + Arrays.toString(sortedArr));
    }
}
