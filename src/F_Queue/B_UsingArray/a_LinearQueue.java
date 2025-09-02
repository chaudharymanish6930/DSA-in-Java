package F_Queue.B_UsingArray;

import  java.util.*;

public class a_LinearQueue {
    int size;
    int front, rear;
    int[] arr;

    LinearQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    // Enqueue (Insert)
    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow!");
        } else {
            arr[++rear] = value;
            System.out.println(value + " inserted into queue");
        }
    }

    // Dequeue (Remove)
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow!");
        } else {
            System.out.println(arr[front] + " removed from queue");
            front++;
        }
    }

    // Display
    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class LinearQueueDemo {
    public static void main(String[] args) {
        LinearQueue q = new LinearQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();
    }
}
