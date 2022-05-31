package com.javacodes.programs.others;

import java.util.Arrays;

/**
 * // both are valid declarations
 * int intArray[];
 * or int[] intArray;
 *
 * byte byteArray[];
 * short shortsArray[];
 * boolean booleanArray[];
 * long longArray[];
 * float floatArray[];
 * double doubleArray[];
 * char charArray[];
 *
 * // an array of references to objects of
 * // the class MyClass (a class created by
 * // user)
 * MyClass myClassArray[];
 *
 * Object[]  ao,        // array of Object
 * Collection[] ca;  // array of Collection
 *                      // of unknown type
 *
 * *************************
 *
 * int intArray[];    //declaring array
 * intArray = new int[20];  // allocating memory to array
 *
 * *************************
 *
 * Multidimensional Arrays
 * Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays. These are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets ([]) per dimension. Examples:
 *
 * int[][] intArray = new int[10][20]; //a 2D array or matrix
 * int[][][] intArray = new int[10][20][10]; //a 3D array
 *
 * Cloning of arrays
 * When you clone a single-dimensional array, such as Object[], a “deep copy” is performed with the new array containing copies of the original array’s elements as opposed to references.
 */
public class ArraysInJava {

    public static void main(String[] args) {
        int[] intArray = {1,2,3};

        int[] cloneArray = intArray.clone();

        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray);
        System.out.println(Arrays.equals(intArray, cloneArray));

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);

        // *********************

        // Input array
        int[] a = { 1, 8, 3 };
        // Creating an array b[] of same size as a[]
        int[] b = new int[a.length];

        // Doesn't copy elements of a[] to b[], only makes
        // b refer to same location
        b = a;

        // Change to b[] will also reflect in a[]
        // as 'a' and 'b' refer to same location.
        b[0]++;

        // *********************
        // Methods to copy array
        //        Iterating each element of the given original array and copy one element at a time
        //        Using clone() method
        //        Using arraycopy() method
        //        Using copyOf() method of Arrays class
        //        Using copyOfRange() method of Arrays class


        // Copying elements of a[] to b[]
        int c[] = a.clone();

        // Copying elements of a[] to b[]
        // public static void arraycopy(Object src, int srcPos, Object dest,
        //                             int destPos, int length)
        System.arraycopy(a, 0, b, 0, 3);


        // If we want to copy the first few elements of an array or a full copy of the array, you can use this method.
        int d[] = Arrays.copyOf(a, 3);

        // This method copies the specified range of the specified array into a new array.
        // public static int[] copyOfRange​(int[] original, int from, int to)
        int e[] = Arrays.copyOfRange(a, 2, 6);


//         Note
//        Simply assigning references is wrong
//        The array can be copied by iterating over an array, and one by one assigning elements.
//        We can avoid iteration over elements using clone() or System.arraycopy()
//        clone() creates a new array of the same size, but System.arraycopy() can be used to copy from a source range to a destination range.
//        System.arraycopy() is faster than clone() as it uses Java Native Interface
//        If you want to copy the first few elements of an array or a full copy of an array, you can use Arrays.copyOf() method.
//       Arrays.copyOfRange() is used to copy a specified range of an array. If the starting index is not 0, you can use this method to copy a partial array.



    }

}
