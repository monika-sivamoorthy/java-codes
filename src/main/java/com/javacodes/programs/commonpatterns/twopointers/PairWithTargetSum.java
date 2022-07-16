package com.javacodes.programs.commonpatterns.twopointers;

import java.util.*;

/**
 * Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
 *
 * Input: [1, 2, 3, 4, 6], target=6
 * Output: [1, 3]
 * Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
 *
 * Input: [2, 5, 9, 11], target=11
 * Output: [0, 2]
 * Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
 */
public class PairWithTargetSum {

    // Method 1: two pointer approact (prerequisite sorted elements)
    // TC: O(n)
    // SC : O(1) - for pointers
    private static int[] methodOne(int[] arr, int targetSum){
        int n = arr.length;
        if (n < 2) return new int[] { -1, -1 };

        int p1 = 0;
        int p2 = n-1;
        boolean isFound = false;

        while (p1 < p2){
            int currentSum = arr[p1] + arr[p2];

            if (currentSum == targetSum) {
                isFound = true;
                break;
            } else if (currentSum < targetSum) {
                p1++;
            } else {
                p2--;
            }
        }

        if (isFound) return new int[]{p1, p2};
        else return new int[] { -1, -1 };

    }

    // Method 2: HashTable Approach (no duplicates)
    // TC: O(n)
    // SC : O(n) - for hash table
    private static int[] methodTwo(int[] arr, int targetSum){
        int n = arr.length;
        if (n < 2) return new int[] { -1, -1 };

        // Notes:
        // HashMap is non synchronized. It is not-thread safe. And Fast
        // HashMap allows one null key and multiple null values.
        // HashMap is a new class introduced in JDK 1.2.
        Map<Integer, Integer> elementIndexMap = new Hashtable<>();

        for(int i =0; i< n; i++){
            int pair = targetSum - arr[i];
            if (elementIndexMap.containsKey(pair)){
                return new int[]{elementIndexMap.get(pair), i};
            } else {
                elementIndexMap.putIfAbsent(arr[i], i);
            }
        }
        return new int[] { -1, -1 };
    }



    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 3, 4, 6};
        int target = 6;
        int[] result = methodTwo(input, target);
        System.out.println(Arrays.toString(result));


    }
}
