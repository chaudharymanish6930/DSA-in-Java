package F_Queue.C_UsingLinkedList;

public class b_QueueLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // Queue elements: 10 20 30

        System.out.println("Dequeued: " + q.dequeue()); // 10
        q.display(); // Queue elements: 20 30

        System.out.println("Front element: " + q.peek()); // 20
        System.out.println("Is Queue empty? " + q.isEmpty()); // false

        q.dequeue();
        q.dequeue();
        q.display(); // Queue is empty
        System.out.println("Is Queue empty? " + q.isEmpty()); // true
    }
}
