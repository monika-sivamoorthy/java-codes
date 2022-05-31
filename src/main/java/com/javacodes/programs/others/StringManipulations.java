package com.javacodes.programs.others;

import java.util.Arrays;

public class StringManipulations {
    public static void main(String[] args) {

        // String creation
        // Method 1:
        String str1 = "Hello world, This is first string. Hello again!";
        // Method 2:
        char[] charArr = {'H','e','l','l','o'};
        String str2 = new String(charArr);

        // String length
        int len = str1.length();
        System.out.println(String.format("The length of %s is %d", str1, len));

        // String manipulations
        int index = 3;
        char ch = str1.charAt(index);
        System.out.println(String.format("The charAt at %d is %s", index, ch));

        // String concatenation
        String str3 = "Welcome" + " back";
        String str4 = "See ";
        String str5 = "you";
        System.out.println(String.format("Concatenated strings %s , %s ", str3, str4.concat(str5)));


        // Manipulating characters in a string
        System.out.println("substring");
        String subStr1 = str1.substring(30);
        String subStr2  = str3.substring(3,6);
        System.out.println(subStr1);
        System.out.println(subStr2);

        // Returns a copy of this string with leading and trailing white space removed.
        System.out.println(" some text with space in ends  ".trim());

        // upper and lowercase
        System.out.println(str1.toUpperCase());
        System.out.println("ALL CAPS".toLowerCase());

        // Searching for Characters and Substrings in a String
        //  If a character or substring is not found, return -1.
        String str6 = "Hello world can the world reply to my Hello";
        char c = 'H';
        String subStr = "ello";
        System.out.println(str6.indexOf(c));
        System.out.println(str6.indexOf(c, 30));
        System.out.println(str6.lastIndexOf(c));
        System.out.println(str6.lastIndexOf(c, 30));

        System.out.println("\n");
        System.out.println(str1.indexOf(subStr));
        System.out.println(str1.indexOf(subStr, 20));
        System.out.println(str1.lastIndexOf(subStr));
        // Note: lastIndexOf(int ch, int beg) : This method returns the index of the last occurrence of the character in the character sequence represented by this object
        // that is less than or equal to beg, or -1 if the character does not occur before that point.
        System.out.println(str1.lastIndexOf(subStr, 20));


        System.out.println(Boolean.toString(str6.contains("Hello")));

        // replace
        char y ='y';
        System.out.println(str6.replace('H',y));
        System.out.println(str6.replace("ello","i"));
        System.out.println(str6.replaceFirst("ello","i"));

        // So every String is also a CharSequence, but not vice versa.
        // You can assign the output of substring() to a variable of type CharSequence, but not the other way around:
        System.out.println(Arrays.toString(str6.split("\\s")));
        System.out.println(Arrays.toString(str6.split("\\s", 3)));
        System.out.println(str1.subSequence(4, 20));
        System.out.println(str1.substring(4, 20));

        //TODO basic regx

//      equals() can be more efficient then compareTo().
//      equals() checks if two objects are the same or not and returns a boolean.
//      compareTo() (from interface Comparable) returns an integer. It checks which of the two objects is "less than", "equal to" or "greater than" the other.
//      -------
//      When one of the strings is a prefix of another, the performance of compareTo() is worse as it still needs to determine the lexicographical ordering while equals() won't worry any more and return false immediately.
//      equals() to check for equality, and
//      compareTo() to find the lexical ordering
        int v = "myString".compareTo(null);  //Throws java.lang.NullPointerException
        // In simple words, == checks if both objects point to the same memory location whereas .equals() evaluates to the comparison of values in the objects.
        boolean b = "myString" == null;     //Returns false

//      *****************************
//      StringBuilder & StringBuffer
//      *****************************


//      Both StringBuilder and StringBuffer create objects that hold a mutable sequence of characters.
//      StringBuffer is synchronized and therefore thread-safe. StringBuilder is compatible with StringBuffer API but with no guarantee of synchronization.
//      Because it's not a thread-safe implementation, it is faster and it is recommended to use it in places where there's no need for thread safety.

        StringBuilder sb1 = new StringBuilder();	// It creates an empty String Builder with the initial capacity of 16.
        StringBuilder sb2 = new StringBuilder(str1);	//It creates a String Builder with the specified string.
        StringBuilder sb3 = new StringBuilder(50);	// It creates an empty String Builder with the specified capacity as 50.

//      Important methods of StringBuilder class
        StringBuilder sb4 =new StringBuilder("Hello ");
        sb4.append("Java"); //now original string is changed
        System.out.println(sb4); //prints Hello Java
        System.out.println(sb4.insert(1,"JAVA"));
        System.out.println(sb4.replace(1, 3,"JAVA"));
        System.out.println(sb4.delete(1, 7));
        System.out.println(sb4.reverse());
        System.out.println(sb4.capacity());
        sb4.ensureCapacity(60);
        System.out.println(sb4.capacity());
        //.setCharAt(int index, char ch);
        // .setLength()
        // .reverse()
        // .delete(int start, int end);
        // .toString()
        // .substring();

        // used to trims the capacity used for the character sequence of StringBuilder object.
        // If the buffer used by StringBuilder object is larger than necessary to hold its current sequence of characters, then this method is called to resize the StringBuilder object for converting this object to more space-efficient.
        // trimToSize();




















    }

}
