package G_HashMap;

import java.util.*;

public class e_Explaination {
    public static void main(String[] args) {
        // 1. Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Add elements (put)
        map.put(1, "Manish");
        map.put(2, "Rahul");
        map.put(3, "Amit");

        System.out.println("Initial Map: " + map);

        // 3. Get value
        System.out.println("Value for key 2: " + map.get(2));

        // 4. Check key/value
        System.out.println("Contains key 1? " + map.containsKey(1));
        System.out.println("Contains value 'Amit'? " + map.containsValue("Amit"));

        // 5. Remove element
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // 6. Replace value
        map.put(2, "Rohit");
        System.out.println("After updating key 2: " + map);

        // 7. Size of map
        System.out.println("Size: " + map.size());

        // 8. Iterate using keySet
        System.out.println("\nIterating using keySet:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 9. Iterate using entrySet (BEST METHOD)
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 10. Clear map
        map.clear();
        System.out.println("\nAfter clear: " + map);
    }
}
