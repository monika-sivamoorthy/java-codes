package com.javacodes.programs.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * #349
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> nums1Set = new HashSet<>();
        for (Integer n : nums1) nums1Set.add(n);

        Set<Integer> nums2Set = new HashSet<>();
        for (Integer n : nums2) nums2Set.add(n);

        nums1Set.retainAll(nums2Set);

        int[] result = new int[nums1Set.size()];
        int index = 0;
        for(int n: nums1Set) result[index++] = n;

        return result;

    }
}
