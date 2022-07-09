package com.javacodes.programs.commons.slidingwindow;

import java.util.Arrays;

/**
 * Find average of all subarrays of K contiguous elements in the given array
 * Time complexity O(n)
 * Space O(n)
 */
public class MaximumSubArrayOfSizeK {

    private static double[] findAverage(int[] arr, int k){
        int arrSize = arr.length;

        // Base case
        if (arrSize < k)
                return new double[0];


        double[] sums = new double[arrSize-k+1];
        sums[0] = Arrays.stream(Arrays.copyOfRange(arr, 0, k)).sum();
        for(int i = 1; i < arrSize - k +1; i++){
            sums[i] = sums[i-1] - arr[i-1] + arr[i+k-1];
        }
        double[] averages =Arrays.stream(sums).map(i -> i/k).toArray();
        return averages;

    }

    public static void main(String[] args) {
        int[] input = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        Arrays.stream(findAverage(input, k)).forEachOrdered(System.out::println);

    }
}


// input:  int array , k - size of sub array
// output: average of subarrays of k contiguous elements

// Pseudo code
// Base case: if size of array is less than k return empty array
// loop  0 < n
