
# Java Collections

- The **java.util** package contains all the classes and interfaces for the Collection framework


! [Hierarchy of Collections Framework - Image](src/main/java/com/javacodes/programs/collections/README.md)


---

### Iterator Interface

- `Interface Iterator<E>` (E - the type of elements returned by this iterator)
- **Iterator interface** provides the facility of iterating the elements in a forward direction only.

  #### Methods of Iterator Interface
      
    |Modifier and Type|Method|Description|
    |-----------------|------|-----------|
    |boolean |`hasNext() `|It returns true if the iterator has more elements otherwise it returns false|
    |E|`next()`|It returns the element int the iteration and *moves the cursor pointer to the next element*|
    |default void |`remove()`|It removes the last elements returned by the iterator in the underlying collection. It is less used|
    |default void| `forEachRemaining(Consumer<? super E> action)`|Performs the given action for each remaining element until all elements have been processed or the action throws an exception|
    

---

### Iterable Interface

- `Interface Iterable<T>` (T - the type of elements returned by the iterator)
- The Iterable interface is the root interface for all the collection classes. 
- The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.

  #### Methods of Iterable Interface
  
   |Modifier and Type|Method|Description|
   |-----------------|------|-----------|
   |Iterator<T>|`iterator()`|This Abstract method, Returns an iterator over elements of type T|
   |default void|`forEach(Consumer<? super T> action)`|Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception|
   |default Spliterator<T>|`spliterator()`|Creates a Spliterator over the elements described by this Iterable |

  
---







