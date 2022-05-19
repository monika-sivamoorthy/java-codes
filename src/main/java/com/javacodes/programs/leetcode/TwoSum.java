package com.javacodes.programs.leetcode;

import java.util.*;

public class TwoSum {

    /**
     * Leetcode #1
     */
    public int[] twoSum(int[] nums, int target) {

        // target = a + b
        // b = target - a
        Map<Integer, Integer> valueIndexMap = new HashMap();
        for (int index = 0; index < nums.length; index++){
            int pair = target-nums[index];
            if (valueIndexMap.containsKey(pair)){
                return new int[]{index, valueIndexMap.get(pair)};
            } else {
                valueIndexMap.put(nums[index], index);
            }
        }
        return null;

    }

}
