package com.javacodes.programs.leetcode;

import java.util.Arrays;

/**
 * #215
 */
public class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[nums.length-k];
    }
}
