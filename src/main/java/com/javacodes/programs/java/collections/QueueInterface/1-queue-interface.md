# Queue Interface
- Queue interface maintains the first-in-first-out order
- It is an ordered list that is used to hold the elements which are about to be processed

---


## The classes that implement the Queue interface

- Queue Interface is implemented by the following classes and interfaces
  - PriorityQueue `Queue<String> q1 = new PriorityQueue();`           
  - Deque Interface `Deque q2 = new ArrayDeque();` 
    - ArrayDeque `Queue<String> q3 = new ArrayDeque();`
  
  
 ----
 
 ### PriorityQueue Class
 - The PriorityQueue class implements the Queue interface. 
 - It holds the elements or objects which are to be processed by their **priorities** 
 - PriorityQueue doesn't allow null values to be stored in the queue
   

 ### Deque Interface
 - Deque interface extends the Queue interface. 
 - In Deque, we can remove and add the elements from both the side. 
 - Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
 
 ### ArrayDeque Class
 - ArrayDeque class implements the Deque interface
 - It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends
 - ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
   

 