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

    public void addLast(int data){
        node NewNode = new node(data);
        if(head==null || tail==null){
            head = NewNode;
            tail = NewNode;
            return;
        }

        tail.next = NewNode;
        NewNode.prev=tail;

        tail=NewNode;
    }

    public void Display(){
        if(head==null || tail==null){
            System.out.println("The Linked List is Empty");
            return;
        }

        node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class DolublyLinkedList {
    public static void main(String[] args) {
        DoubleLinkedList List = new DoubleLinkedList();
        List.addfirst(10);
        List.addfirst(20);
        List.Display();
    }
}
