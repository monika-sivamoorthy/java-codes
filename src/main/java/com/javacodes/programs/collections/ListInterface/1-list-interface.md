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
- It uses dynamic array to store the elements
- It can store the duplicate elements
- It **maintains the insertion order** 
- It is **non-synchronized**
- The **elements stored** in the ArrayList class can be **randomly accessed**
 
### LinkedList 
- The LinkedList class implements the Collection interface
- It uses a doubly linked list internally to store the elements
- It can store the duplicate elements
- It **maintains the insertion order** 
- It is **non-synchronized**
- In LinkedList, the manipulation is fast because no shifting is required

### Vector
- It uses dynamic array to store the elements
- It is synchronized 
- It contains many methods that are not the part of Collection framework


### Stack
- The stack is the subclass of Vector
- It implements the last-in-first-out data structure, i.e., Stack
- The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties

