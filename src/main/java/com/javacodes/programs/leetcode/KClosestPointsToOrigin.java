package com.javacodes.programs.leetcode;

import java.util.PriorityQueue;

/**
 * #973
 */
public class KClosestPointsToOrigin {
    private int calcDistance(int[] point){
        return (point[0]*point[0]) + (point[1]*point[1]);
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int index = 0; index < points.length; index++){
            pq.add(new int[]{calcDistance(points[index]), index});
            if (pq.size() > k)
                pq.poll();
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i++) {
            int pointIndex = pq.poll()[1];
            result[i] = points[pointIndex];
        }
        return result;

    }
}
