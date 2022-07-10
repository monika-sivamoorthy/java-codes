# Map Interface 
- A map contains values on the basis of key, i.e. key and value pair 
- Each key and value pair is known as an entry 
- A Map contains unique keys
- A Map is useful if you have to search, update or delete elements on the basis of a key
- A Map doesn't allow duplicate keys, but you can have duplicate values. Note: HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
- **A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method**
  


---

## The classes that implement the Map interface

- HashMap                 (doesn't maintain any order)
- LinkedHashMap           (maintains insertion order)
- SortedMap Interface     
    - TreeMap             (maintains ascending order)
    
----
 
 
 ### Map.Entry Interface
 - Entry is the sub-interface of Map. So we will be accessed it by Map.Entry name. 
 - It returns a collection-view of the map, whose elements are of this class. 
 - It provides methods to get key and value.
 
 ### Methods of Map.Entry interface
 
----
  
 ### Methods of Map interface