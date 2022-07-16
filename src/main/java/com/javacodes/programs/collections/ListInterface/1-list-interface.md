# List Interface

- It inhibits a list type data structure in which we can store the **ordered collection of objects**. 
- It can have duplicate values.


---

## The classes that implement the List interface
    
- List interface is implemented by the following classes,
    - ArrayList `List <data-type> list1= new ArrayList();`  
    - LinkedList `List <data-type> list2 = new LinkedList();`  
    - Vector `List <data-type> list3 = new Vector();`  
    - Stack `List <data-type> list4 = new Stack();` 
    
--- 
  
### ArrayList Class

- The ArrayList class implements the List interface
- It internally uses a dynamic array to store the elements. To be precise, an ArrayList is a resizable array. The memory location for the elements of an ArrayList is contiguous	
- It can store the duplicate elements
- It **maintains the insertion order** 
- It is **non-synchronized**
- The **elements stored** in the ArrayList class can be **randomly accessed**
- Manipulation with ArrayList is slow because it internally uses an array. If any element is removed from the array, all the other elements are shifted in memory
- ArrayList is better for storing and accessing data
- Generally, when an ArrayList is initialized, a default capacity of 10 is assigned to the ArrayList

 
### LinkedList 
- The LinkedList class implements the Collection interface
- It internally uses a doubly linked list to store the elements. The location for the elements of a linked list is not contagious
- It can store the duplicate elements
- It **maintains the insertion order** 
- It is **non-synchronized**
- In LinkedList, the manipulation is fast because no shifting is required
- LinkedList class can act as a list and queue both because it implements List and Deque interfaces
- LinkedList is better for manipulating data
- There is no case of default capacity in a LinkedList. In LinkedList, an empty list is created when a LinkedList is initialized

### Vector
- It uses dynamic array to store the elements
- It is synchronized 
- It contains many methods that are not the part of Collection framework
- **The Vector class is deprecated since Java 5**


### Stack
- The stack is the subclass of Vector
- It implements the last-in-first-out data structure, i.e., Stack
- The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties

