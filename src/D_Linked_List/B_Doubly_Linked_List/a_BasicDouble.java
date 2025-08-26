package D_Linked_List.B_Doubly_Linked_List;

import D_Linked_List.A_Singly_Linked_List.c_PrintDatabyDisplay;

public class a_BasicDouble {
    Node head;
    Node tail;

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        newNode.next = temp;
        head = newNode;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtAnyIndex(int data, int index) {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.next.prev = newNode;
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayReverse() {
        if (head == null) return;

        Node temp = head;
        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Reverse: ");
        // Print in reverse
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete!");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        // Move head to next node
        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete!");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Break connection of second last node
        temp.prev.next = null;
    }

    public void deleteAtAnyIndex(int index) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (index < 0) {
            System.out.println("Invalid index!");
            return;
        }

        // Delete first node
        if (index == 0) {
            deleteFirst();
            return;
        }

        Node temp = head;
        int count = 0;

        // Traverse to the given index
        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of range!");
            return;
        }

        // If deleting last node
        if (temp.next == null) {
            deleteLast();
            return;
        }

        // Adjust pointers
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;
        f.next = g;
        g.prev = f;
        g.next = null;

//        it is static method
//        a_BasicDouble obj = new a_BasicDouble();
//        obj.display(a);


    }
}
