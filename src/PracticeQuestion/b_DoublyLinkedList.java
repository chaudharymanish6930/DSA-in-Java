package PracticeQuestion;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev=null;
        this.next=null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) return;

        Node current = head;

        // Search for the node to delete
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found!");
            return;
        }

        // If it's the head
        if (current == head) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        }
        // If it's the tail
        else if (current == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        }
        // If it's a middle node
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Display list forward
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display list backward
    public void displayBackward() {
        Node temp = tail;
        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}

public class b_DoublyLinkedList {
    public static void main(String[] args) {

    }
}
