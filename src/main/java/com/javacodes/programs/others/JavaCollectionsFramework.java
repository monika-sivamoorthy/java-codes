package com.javacodes.programs.others;

// Collections
// collections https://www.geeksforgeeks.org/collections-in-java-2/?ref=lbp
// Collections.addAll(collectionName, "item1", "item2");
// Collections.sort(collectionName)
// Collections.sort(collectionName, Collections.reverseOrder())
// Collections.binarySearch(collectionName, "item1"))
// Collections.copy(destination_List, source_List);
// Collections.disjoint(collectionName1, collectionName2) is used to check whether two specified collections are disjoint or not. More formally, two collections are disjoint if they have no elements in common. It returns true if the two collections do not have any element in common.
/**
 * ArrayList : https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
 * PriorityQueue
 * HashMap
 * LinkedlIst
 * stack
 * queue
 *
 */

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionsFramework {
    public static void main(String[] args) {

        // ArrayList(Class)  ---implements-->  List(Interface)  ----extends--->  Collection
        // Creating an object of List interface - implemented by the ArrayList class

//        Add elements to a list or list creation
//        =======================================
//        .add(Integer element)
//        .add(int index, Integer element);
//        .addAll(Collection<? extendes Integer>);
//        .addAll(int index, Collection<? extendes Integer>);

        List<Integer> list1 = new ArrayList<Integer>();

        List<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        list1.addAll(list2);

        List<Integer> list3 = new ArrayList<Integer>(list2);


//        remove elements from a list
//        ============================
//        .remove(Object o);
//        .remove(int index);
//        .remove(Collection<>);
//        list1.removeIf(Predicate<? super Integer>);





    }
}
