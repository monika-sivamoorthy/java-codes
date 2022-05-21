package com.javacodes.programs.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * #78
 */
public class Subsets {

    private void findAllSubsets(
            int[] nums, int level, List<List<Integer>> results, List<Integer>parentNode){

        if (level == nums.length){
            results.add(parentNode);
            return;
        }

        findAllSubsets(nums, level+1, results, parentNode);

        List<Integer> parentNodeCopy = new ArrayList(parentNode);
        parentNodeCopy.add(nums[level]);

        findAllSubsets(nums, level+1, results, parentNodeCopy);

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList();
        findAllSubsets(nums, 0, results, new ArrayList());
        return results;
    }
}
