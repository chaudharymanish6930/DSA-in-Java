package F_Queue.A_Collection_FrameWork.A_Deque;

import java.util.*;

public class a_UsingLinkedList {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // 1. Enqueue (add / offer)
        queue.add(10);   // throws exception if capacity full
        queue.add(20);
        queue.offer(30); // preferred (returns false if fails instead of exception)
        queue.offer(40);

        System.out.println("Queue after enqueues: " + queue);

        // 2. Peek methods
        System.out.println("Peek (element): " + queue.element()); // front, exception if empty
        System.out.println("Peek (peek): " + queue.peek());       // front, null if empty

           // 3. Dequeue (remove / poll)
        System.out.println("Removed (remove): " + queue.remove()); // removes head, exception if empty
        System.out.println("Removed (poll): " + queue.poll());     // removes head, null if empty
        System.out.println("Queue after removals: " + queue);

        // 4. Size and checks
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is Queue empty? " + queue.isEmpty());
        System.out.println("Does Queue contain 20? " + queue.contains(20));

        // 5. Iterate through Queue
        System.out.print("Iterating Queue: ");
        for (Integer num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 6. Clear Queue
        queue.clear();
        System.out.println("Queue after clear: " + queue);
        System.out.println("Is Queue empty now? " + queue.isEmpty());
    }
}
