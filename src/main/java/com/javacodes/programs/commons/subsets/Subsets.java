package com.javacodes.programs.commons.subsets;

import java.util.*;
/**
 * Given a set with distinct elements, find all of its distinct subsets.
 */
class Subsets {



    public static List<List<Integer>> findSubsets(int[] nums) {

        List<List<Integer>> subsets = new ArrayList<>();

        subsets.add(new ArrayList<>());

        for(int i = 0; i < nums.length; i++){
            int size = subsets.size();
            for(int j = 0; j < size; j++){

                List<Integer> newSubset = new ArrayList<>(subsets.get(i));
                newSubset.add(nums[i]);
                subsets.add(newSubset);
            }
        }
        return subsets;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = Subsets.findSubsets(new int[] { 1, 3 });
        System.out.println("Here is the list of subsets: " + result);

        result = Subsets.findSubsets(new int[] { 1, 5, 3 });
        System.out.println("Here is the list of subsets: " + result);
    }

}
