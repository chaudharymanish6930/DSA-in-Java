package D_Linked_List.B_Doubly_Linked_List;

public class DoublyLinkedList {
    node head;
    node tail;

    class node{
        int data;
        node prev;
        node next;

        node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void AddAthead(int data){
        node newNode = new node(data);
        node temp = head;
        newNode.next = temp;
        head = newNode;
    }

    public static node insertAtHead(node head, int x){
        node temp = new node(20);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return temp;
    }
}
