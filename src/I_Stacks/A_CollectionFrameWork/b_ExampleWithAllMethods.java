package I_Stacks.A_CollectionFrameWork;

import java.util.*;

public class b_ExampleWithAllMethods {
    public static void main(String[] args) {
        // Create a Stack of Strings
        Stack<String> stack = new Stack<>();

        // 1. push() -> add elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");
        stack.push("Orange");

        System.out.println("Stack after pushes: " + stack);

        // 2. pop() -> remove top element
        String removed = stack.pop();
        System.out.println("After pop (removed: " + removed + "): " + stack);

        // 3. peek() -> check top element
        System.out.println("Top element (peek): " + stack.peek());

        // 4. search() -> search element (1-based from top)
        System.out.println("Position of 'Banana': " + stack.search("Banana"));

        // 5. empty() -> check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 6. size() -> number of elements
        System.out.println("Size of stack: " + stack.size());

        // 7. contains() -> check if element exists
        System.out.println("Does stack contain 'Apple'? " + stack.contains("Apple"));

        // 8. iterator() -> iterate over stack
        System.out.print("Iterating stack: ");
        Iterator<String> it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 9. get() -> since Stack extends Vector
        System.out.println("Element at index 1: " + stack.get(1));

        // 10. set() -> modify element
        stack.set(1, "Grapes");
        System.out.println("After set(1, Grapes): " + stack);

        // 11. add() -> also works
        stack.add("Pineapple");
        System.out.println("After add(Pineapple): " + stack);

        // 12. remove(Object) -> remove specific element
        stack.remove("Apple");
        System.out.println("After removing Apple: " + stack);

        // 13. firstElement() & lastElement()
        System.out.println("First element: " + stack.firstElement());
        System.out.println("Last element: " + stack.lastElement());

        // 14. toArray()
        Object[] arr = stack.toArray();
        System.out.print("Array from stack: ");
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 15. clone()
        @SuppressWarnings("unchecked")
        Stack<String> clonedStack = (Stack<String>) stack.clone();
        System.out.println("Cloned stack: " + clonedStack);

        // 16. clear()
        stack.clear();
        System.out.println("Stack after clear(): " + stack);
    }
}
