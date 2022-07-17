package com.javacodes.programs.algorithms.sorting;

import java.util.Arrays;

/**
 * In place merge sort
 */
public class InPlaceMergeSort {

    private int[] merge(int[] arr, int start1, int end1, int start2, int end2){

        // If  merge is already sorted
        if (arr[end1] <= arr[start2]) {
            return arr;
        }

        while(start1 <= end1 && start2 <= end2 ){
            if (arr[start1] <= arr[start2]){
                start1++;
            } else {
                int least = arr[start2];
                int index = start2;
                while(index > start1) {
                    arr[index] = arr[index-1];
                    index--;
                }
                arr[index] = least;

                start1++;
                end1++;
                start2++;
            }
        }
        return arr;

    }

    private int[] sort(int[] arr, int start, int end){

        // Base case : one element
        if (end-start < 1)
                return arr;

        // divide step
        int mid = (start + end) / 2;
        System.out.println(start + " " + end);
        arr = this.sort(arr, start, mid);
        arr = this.sort(arr, mid+1,end);

        // merge step
        arr = merge(arr, start, mid, mid+1, end);

        System.out.println(start + " " + end + " " + Arrays.toString(arr));
        return arr;

    }

    public void execute() {
        int[] unsortedArr = { 12, 11, 13, 7, 6, 5 };
        System.out.println("unsorted Array : " + Arrays.toString(unsortedArr));
        int[] sortedArr = this.sort(unsortedArr, 0, unsortedArr.length-1);
        System.out.println("\nsorted Array : " + Arrays.toString(unsortedArr));
    }
}
