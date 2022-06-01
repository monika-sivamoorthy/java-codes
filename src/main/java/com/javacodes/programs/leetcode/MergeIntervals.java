package com.javacodes.programs.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * #56
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]) );

        //Leet code soln: uses linkedList
        List<int[]> merged = new ArrayList();

        merged.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            if (merged.get(merged.size()-1)[1] < intervals[i][0] ){
                merged.add(intervals[i]);
            } else if(merged.get(merged.size()-1)[1] < intervals[i][1]){
                merged.get(merged.size()-1)[1] = intervals[i][1];
            }

        }

        return merged.toArray(new int[merged.size()][2]);
    }
}
