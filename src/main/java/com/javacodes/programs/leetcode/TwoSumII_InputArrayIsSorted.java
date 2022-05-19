package com.javacodes.programs.leetcode;

/**
 * Leetcode #167
 */
public class TwoSumII_InputArrayIsSorted { // donot use underscore in class names. here it is used for specific reason

    public int[] twoSum2(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length -1;

        while (start < end){
            int summation = numbers[start] + numbers[end];
            if(summation == target){
                return new int[]{start+1, end+1};
            } else if (summation < target){
                start++;
            } else if (summation > target){
                end--;
            }
        }
        return null;
    }
}
