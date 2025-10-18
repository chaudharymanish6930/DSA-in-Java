package G_HashMap;

import java.sql.SQLOutput;
import java.util.*;

public class a_BasicsCollections {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        System.out.println(map);

        System.out.println(map.get(4));   // mango
        System.out.println(map.get(6));  // null
        System.out.println(map.get(9));   // null

        // remove method for remove from the hashmap and return null if key not exist
        System.out.println(map.remove(3));  //cherry
        System.out.println(map.remove(9));  // null

        // contains method like containskey and containsvalue
        System.out.println(map.containsKey(5));  // false
        System.out.println(map.containsKey(3));  // false
        System.out.println(map.containsKey(1));  // true
        System.out.println(map.containsValue("apple"));   // false
        System.out.println(map.containsValue("Mango"));   // true

        // put method for update and inserts in the hashmap
        // update Apple to Tomato
        map.put(1, "Tomato");
        System.out.println(map);

        // insert new values
        System.out.println(map.put(5, "Brinjal"));  // nulll
        System.out.println(map);

        System.out.println(map.putIfAbsent(1, "Apple")); // Tomato
        System.out.println(map.putIfAbsent(2, "Apple"));  // Banana

        // all keys in map
        System.out.println(map.keySet());

        // set all values
        System.out.println(map.values());

        // all enteries
        System.out.println(map.entrySet());  // in list form

        // traverse the all entries of the hasmap -- multiple methods
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        for (String Value : map.values()) {
            System.out.println(Value);
        }

    }
}