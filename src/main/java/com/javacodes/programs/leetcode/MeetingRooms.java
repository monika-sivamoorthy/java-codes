package com.javacodes.programs.leetcode;

import java.util.Arrays;

/**
 * #252
 */
public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {

        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));
        for(int i = 0; i < intervals.length-1 ; i++){
            if(intervals[i][1] > intervals[i+1][0]) {
                return false;
            }
        }
        return true;

    }
}
