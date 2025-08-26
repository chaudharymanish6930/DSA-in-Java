package D_Linked_List.B_Doubly_Linked_List;

public class DoublyLinkedList {
    node head;
    node tail;

    class node {
        int data;
        node prev;
        node next;

        node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void insertAtHead(int data) {
        node newNode = new node(data);
        node temp = head;
        newNode.next = temp;
        head = newNode;
    }

    public void insertAtTail(int data) {
        node newNode = new node(data);
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtAnyIndex(int data, int index) {
        node newNode = new node(data);
        node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.next.prev = newNode;
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayReverse() {
        if (head == null) return;

        node temp = head;
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

    public void deleteFirst(){
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

    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty, nothing to delete!");
            return;
        }

        // If only one node exists
        if (head.next == null) {
            head = null;
            return;
        }

        node temp = head;
        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Break connection of second last node
        temp.prev.next = null;
    }

    public void deleteAtAnyIndex(int index){
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

        node temp = head;
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
}
