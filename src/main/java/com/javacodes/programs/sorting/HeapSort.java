package com.javacodes.programs.sorting;

import java.util.Arrays;

/**
 * Heap sort:
 * Step 1: create a heap
 * step 2: delete elements from heap
 * Note: ascending order - max heap
 *
 * Notes:
 * If a node is at i,
 * left child = 2*i;
 * right child = 2*i+1
 * parent = ceil(i/2)
 *
 * Complete tree = leftmost filled + the difference in level between any two leaf nodes is max 1
 * no empty location if represented as array
 *
 * Full tree = all leaves filled, binary tree with max nodes
 */
public class HeapSort {

    private int[] maxHeapify(int[] arr, int root, int end){

        int largest = root;
        int right = 2 * root + 1;
        int left = 2 * root + 2;

        if (right < end && arr[right] > arr[largest])
            largest = right;

        if (left < end && arr[left] > arr[largest])
            largest = left;

        if (largest != root){
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;

            arr = maxHeapify(arr, largest, end);
        }

        return arr;
    }

    private int[] sort(int[] unsortedArr){
        int arrLength =  unsortedArr.length;

        // Step 1: Create max heap i.e., max-heapify all non -leaf nodes n//2
        for (int index = (arrLength / 2 - 1); index >= 0; index--)
            unsortedArr = maxHeapify(unsortedArr, index, arrLength);
        System.out.println("\nInitial max-heap : " + Arrays.toString(unsortedArr));

        // Step 2: delete elements one by one
        for(int index = unsortedArr.length-1 ; index >= 0; index--) {

            // Step 1: replace root with last element and remove last element. i.e, remove max element
            int temp = unsortedArr[index];
            unsortedArr[index] = unsortedArr[0];
            unsortedArr[0] = temp;

            // Step 2: heapify
            this.maxHeapify(unsortedArr, 0, index);
        }
        return unsortedArr;
    }

    public void execute() {
        int[] unsortedArr = { 12, 11, 13, 5, 6, 7 };
        System.out.println("unsorted Array : " + Arrays.toString(unsortedArr));
        int[] sortedArr = this.sort(unsortedArr);
        System.out.println("\nsorted Array : " + Arrays.toString(unsortedArr));
    }

}
