package com.javacodes.programs.commonpatterns.twopointers;

import java.util.Arrays;

/**
 * Given an array of sorted numbers, remove all duplicate number instances from it in-place, such that each element appears only once.
 * The relative order of the elements should be kept the same and you should not use any extra space so that that the solution have a space complexity of O(1).
 * Move all the unique elements at the beginning of the array and after moving return the length of the subarray that has no duplicate in it.
 * Ref: LC #26
 */
public class RemoveDuplicatesInPlace {

    // result array is not sorted
    private static int method(int[] arr){

        int n = arr.length;
        if (n < 2) return 0;

        int p1 = 1;
        int p2 = n-1;
        while(p1 < n && p1 <= p2){
            if (arr[p1] == arr[p1-1]){
                int temp = arr[p1];
                // shift : source_arr[], sourcePos, dest_arr[], destPos, len;
                System.arraycopy(arr, p1 + 1, arr, p1, p2 - p1);
                arr[p2] = temp;
                p2-=1;
            } else {
                p1+=1;
            }
        }
        System.out.println(Arrays.toString(arr));

        return p2+1;
    }

    public static void main(String[] args) {

        int[] input = new int[]{2, 3, 3, 3, 6, 9, 9};
        System.out.println("Length of the subarray that has no duplicate in it "+method(input));

    }
}
