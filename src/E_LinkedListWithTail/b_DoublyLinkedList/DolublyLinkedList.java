package E_LinkedListWithTail.b_DoublyLinkedList;

class node{
    int data;
    node prev;
    node next;

    node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

class DoubleLinkedList{
    node head = null;
    node tail = null;
    public void addfirst(int data){
        node NewNode = new node(data);
        if(head==null || tail==null){
            head = NewNode;
            tail = NewNode;
            return;
        }

        NewNode.next = head;
        head.prev = NewNode;
        head =NewNode;
    }
}
public class DolublyLinkedList {
    public static void main(String[] args) {

    }
}
