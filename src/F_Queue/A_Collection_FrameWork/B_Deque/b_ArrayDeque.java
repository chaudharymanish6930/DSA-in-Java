package F_Queue.A_Collection_FrameWork.B_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class b_ArrayDeque {
    public static void main(String[] args) {
        // Create ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // 1. Adding elements
        deque.add(10);         // adds at tail (rear)
        deque.add(20);
        deque.offer(30);       // same as add, but no exception if fails
        deque.offer(40);

        deque.addFirst(5);     // adds at head (front)
        deque.addLast(50);     // adds at tail (rear)
        deque.offerFirst(1);   // same as addFirst but returns boolean
        deque.offerLast(60);   // same as addLast but returns boolean

        System.out.println("Deque after additions: " + deque);

        // 2. Accessing elements
        System.out.println("First element (getFirst): " + deque.getFirst()); // exception if empty
        System.out.println("Last element (getLast): " + deque.getLast());
        System.out.println("Peek first (peekFirst): " + deque.peekFirst());  // null if empty
        System.out.println("Peek last (peekLast): " + deque.peekLast());

        // 3. Removing elements

        System.out.println("Removed first (removeFirst): " + deque.removeFirst());
        System.out.println("Removed last (removeLast): " + deque.removeLast());
        System.out.println("Removed first (pollFirst): " + deque.pollFirst()); // null if empty
        System.out.println("Removed last (pollLast): " + deque.pollLast());   // null if empty
        System.out.println("Deque after removals: " + deque);

        // 4. Size & checks
        System.out.println("Deque size: " + deque.size());
        System.out.println("Is deque empty? " + deque.isEmpty());
        System.out.println("Does deque contain 20? " + deque.contains(20));

        // 5. Iteration
        System.out.print("Iterating deque: ");
        for (Integer num : deque) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Clearing deque
        deque.clear();
        System.out.println("Deque after clear: " + deque);
        System.out.println("Is deque empty now? " + deque.isEmpty());
    }
}
