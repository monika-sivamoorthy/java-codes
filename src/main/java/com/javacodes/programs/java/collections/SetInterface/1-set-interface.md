# Set Interface 
- It represents the unordered set of elements which doesn't allow us to store the duplicate items
- We can store at most one null value in Set

---

## The classes that implement the Set interface
- HashSet `Set<data-type> s1 = new HashSet<data-type>();`
- LinkedHashSet `Set<data-type> s2 = new LinkedHashSet<data-type>();`
- SortedSet Interface `SortedSet<data-type> set = new TreeSet();`
    - TreeSet `Set<data-type> s3 = new TreeSet<data-type>();`

---

### HashSet Class
- HashSet class represents the collection that uses a hash table for storage 
- Hashing is used to store the elements in the HashSet 
- It contains unique items

### LinkedHashSet Class
- LinkedHashSet class represents the LinkedList implementation of Set Interface
- Like HashSet, It also contains unique elements
- It maintains the insertion order and permits null elements

### SortedSet Interface
- SortedSet is the alternate of Set interface that provides a total ordering on its elements
- The elements of the SortedSet are arranged in the increasing (ascending) order
- The SortedSet provides the additional methods that inhibit the natural ordering of the elements
  

### TreeSet Class
- TreeSet class implements the Set interface that uses a tree for storage
- Like HashSet, TreeSet also contains unique elements. However, the access and retrieval time of TreeSet is quite fast 
- The elements in TreeSet stored in ascending order
  




