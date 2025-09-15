package F_Queue.C_UsingLinkedList;

// Node class for Linked List
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue implementation using Linked List
class Queue {
    private Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    // Add element to queue (enqueue)
    public void enqueue(int data) {
        Node newNode = new Node(data);

        // If queue is empty, front and rear are same
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        // Add new node at the end and change rear
        rear.next = newNode;
        rear = newNode;
    }

    // Remove element from queue (dequeue)
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }

        int value = front.data;
        front = front.next;

        // If queue becomes empty, set rear = null
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Peek front element
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display queue elements
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        Node temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
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
