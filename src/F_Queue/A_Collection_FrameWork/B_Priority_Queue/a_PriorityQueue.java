package F_Queue.A_Collection_FrameWork.B_Priority_Queue;

import java.util.*;

public class a_PriorityQueue {
    public static void main(String[] args) {
        // 1. Min-Heap PriorityQueue (default)
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();

        // Adding elements
        minPQ.add(40);   // throws exception if fails
        minPQ.add(10);
        minPQ.offer(30); // preferred (returns false if fails)
        minPQ.offer(20);

        System.out.println("Min-Heap PriorityQueue: " + minPQ);

        // Accessing head element
        System.out.println("Head (peek): " + minPQ.peek());      // null if empty
        System.out.println("Head (element): " + minPQ.element()); // exception if empty

        // Removing elements
        System.out.println("Removed (poll): " + minPQ.poll());   // removes head, null if empty
        System.out.println("Removed (remove): " + minPQ.remove()); // removes head, exception if empty

        System.out.println("PriorityQueue after removals: " + minPQ);

        // Contains, size, empty check
        System.out.println("Contains 30? " + minPQ.contains(30));
        System.out.println("Size: " + minPQ.size());
        System.out.println("Is Empty? " + minPQ.isEmpty());

        // Iterating
        System.out.print("Iterating PriorityQueue: ");
        Iterator<Integer> it = minPQ.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Clear all
        minPQ.clear();
        System.out.println("PriorityQueue after clear: " + minPQ);
        System.out.println("Is Empty now? " + minPQ.isEmpty());


        // 2. Max-Heap PriorityQueue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(40);
        maxPQ.add(10);
        maxPQ.offer(30);
        maxPQ.offer(20);

        System.out.println("\nMax-Heap PriorityQueue: " + maxPQ);
        System.out.println("Head (peek): " + maxPQ.peek());
        System.out.println("Removed (poll): " + maxPQ.poll());
        System.out.println("After removal: " + maxPQ);
    }
}
