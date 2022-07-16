package com.javacodes.programs.commonpatterns.topk;
import java.util.*;

public class TopKNumbers {
    public static List<Integer> findKLargestNumbers(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            if(pq.size() > k){

                System.out.println( pq.poll());
            }
            pq.add(num);
        }
        ArrayList<Integer> topK = new ArrayList<>();
        while(!pq.isEmpty()){
            topK.add(pq.poll());
        }
        return topK;
    }

    public static void main(String[] args) {
        List<Integer> result = TopKNumbers.findKLargestNumbers(new int[] { 3, 1, 5, 12, 2, 11 }, 3);
        System.out.println("Here are the top K numbers: " + result);

        result = TopKNumbers.findKLargestNumbers(new int[] { 5, 12, 11, -1, 12 }, 3);
        System.out.println("Here are the top K numbers: " + result);
    }
}


