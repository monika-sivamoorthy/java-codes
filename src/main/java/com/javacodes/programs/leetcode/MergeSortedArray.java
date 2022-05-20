package com.javacodes.programs.leetcode;

/**
 * #88
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int endIndex = m-1;

        while(p1 <= endIndex && p2 < n){
            if (nums1[p1] <= nums2[p2]){
                p1++;
            } else {
                for(int index = endIndex; index >= p1; index--){
                    nums1[index+1] = nums1[index];
                }
                nums1[p1] = nums2[p2];
                endIndex++;
                p1++;
                p2++;
            }
        }
        while (p2 < n){
            nums1[p1] = nums2[p2];
            p1++;
            p2++;
        }
    }
}
