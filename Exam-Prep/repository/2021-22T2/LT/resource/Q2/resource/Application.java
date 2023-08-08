/*
 *
 * Name:
 */

import java.util.*;

public class Application {
    public static void main(String[] args) {
        IterableMap<Integer, Person> map = new HashedMap<>();
        map.put(1, new Student("John", "s001"));
        map.put(2, new Student("Peter", "s002"));
        map.put(3, new Teacher("Joe", "t001"));
        map.put(4, new Teacher("Candy", "t002"));  
       
        MapIterator<Integer, Person> iter = map.mapIterator();
       
        if (map.size() < 1){
            throw new InvalidException();
        }
        while (iter.hasNext()) {
          System.out.println(iter.next() + " - " + iter.getValue());
        }

        System.out.println("Number of Persons : " + map.size());
        
    }
}
