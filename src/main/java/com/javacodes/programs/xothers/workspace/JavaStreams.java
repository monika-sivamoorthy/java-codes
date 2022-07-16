package com.javacodes.programs.xothers.workspace;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStreams {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        IntStream.range(1,11).forEach(x-> mySet.add(x));
        System.out.println(mySet.toString());
    }
}
