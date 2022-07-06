package com.javacodes.programs.commonpatterns.slidingwindow;

import java.util.*;

/**
 * Given a string, find the length of the longest substring in it with no more than K distinct characters.
 *
 * Input: String="araaci", K=2
 * Output: 4
 * Explanation: The longest substring with no more than '2' distinct characters is "araa".
 */
public class LongestSubstringWithMaximumKDistinctCharacters {

    private static int method(String str, int k){
        int n = str.length();
        if (n < 2) return n;

        int lengthOfLongestSubstring = 0;
        int windowStart = 0;
        Map<Character, Integer> counterMap = new Hashtable<>();

        for(int i = 0; i < n; i++){
            char c = str.charAt(i);
            if(counterMap.containsKey(c)){
                counterMap.put(c, counterMap.get(c)+1);
            } else {
                if(counterMap.size() >= k){
                    while(counterMap.size() >= k){
                        char ch = str.charAt(windowStart);
                        int count = counterMap.get(ch);
                        if (count == 1){
                            counterMap.remove(ch);
                        } else {
                            counterMap.put(ch, count-1);
                        }
                        windowStart+=1;
                    }
                }
                counterMap.put(c, 1);
            }
            lengthOfLongestSubstring = Math.max(lengthOfLongestSubstring, i-windowStart+1);
        }

        return lengthOfLongestSubstring;

    }

    public static void main(String[] args) {
        String input = "araaci";
        System.out.println(method(input, 2));

    }
}
