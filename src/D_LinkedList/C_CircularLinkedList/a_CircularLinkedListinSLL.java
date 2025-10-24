package D_LinkedList.C_CircularLinkedList;

public class a_CircularLinkedListinSLL {
    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Insert a node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;  // circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // circular connection
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) return;

        Node curr = head, prev = tail;

        // If head is to be deleted
        if (head.data == key) {
            // only one node
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        // search for key
        do {
            if (curr.data == key) {
                prev.next = curr.next;
                // if deleting last node
                if (curr == tail) {
                    tail = prev;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public static void main(String[] args) {
        a_CircularLinkedListinSLL cll = new a_CircularLinkedListinSLL();

        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        System.out.println("Circular Linked List:");
        cll.display();

        cll.delete(10);
        System.out.println("After deleting 10:");
        cll.display();

        cll.delete(40);
        System.out.println("After deleting 40:");
        cll.display();
    }
}
