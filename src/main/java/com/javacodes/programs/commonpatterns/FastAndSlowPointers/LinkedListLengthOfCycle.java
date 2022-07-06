package com.javacodes.programs.commonpatterns.FastAndSlowPointers;


/**
 * Given the head of a LinkedList with a cycle, find the length of the cycle.
 */
public class LinkedListLengthOfCycle {

    private static int lengthOfCycle(ListNode headNode){

        ListNode slow = headNode;
        ListNode fast = headNode;


        while(slow != null && fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){

                // find length of cycle
                ListNode start = slow.next;
                int cycleLength = 1;

                while(start != slow){
                    cycleLength += 1;
                    start = start.next;
                }

                return cycleLength;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        head.next.next.next.next.next.next = head.next.next;
        System.out.println("LinkedList cycle length: " + LinkedListLengthOfCycle.lengthOfCycle(head));

        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println("LinkedList cycle length: " + LinkedListLengthOfCycle.lengthOfCycle(head));


    }

}

// output:
//        LinkedList cycle length: 4
//        LinkedList cycle length: 3
