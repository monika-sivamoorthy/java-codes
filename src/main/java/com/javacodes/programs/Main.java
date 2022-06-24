package com.javacodes.programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        IntStream.range(1,11).forEach(x-> mySet.add(x));
        System.out.println(mySet.toString());
    }
}
