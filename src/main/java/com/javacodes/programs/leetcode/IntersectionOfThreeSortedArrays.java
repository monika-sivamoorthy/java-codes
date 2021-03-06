package com.javacodes.programs.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * #1213
 */
public class IntersectionOfThreeSortedArrays {

    class Solution {
        public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {

            List<Integer> result = new ArrayList<>();
            int i = 0, j = 0, k = 0;

            while (i < arr1.length && j < arr2.length && k < arr3.length ){

                if ((arr1[i] == arr2[j]) && (arr2[j] == arr3[k])) {
                    result.add(arr1[i]);
                    i++;
                    j++;
                    k++;
                } else {
                    if ((arr1[i] < arr2[j]) && (arr1[i] < arr3[k])) {
                        i++;
                    } else if (arr2[j] < arr3[k]) {
                        j++;
                    } else {
                        k++;
                    }
                }
            }

            return result;
        }
    }
}
