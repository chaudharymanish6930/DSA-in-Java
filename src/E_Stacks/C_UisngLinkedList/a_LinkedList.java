package E_Stacks.C_UisngLinkedList;
import java.util.*;
public class a_LinkedList {
    // Node class for linked list
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;   // top of stack
    private int size;   // size of stack

    // Constructor
    public gStackLinkedList() {
        this.top = null;
        this.size = 0;
    }

    // Push element onto stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;  // point new node to old top
        top = newNode;       // update top
        size++;
        System.out.println(value + " pushed to stack");
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1; // sentinel value
        }
        int popped = top.data;
        top = top.next; // move top down
        size--;
        System.out.println(popped + " popped from stack");
        return popped;
    }

    // Peek (top element without removing)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get size of stack
    public int size() {
        return size;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements (top to bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


// Main class to test Stack
public class Main {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.display();

        System.out.println("Stack size: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
