package D_LinkedList.D_DoublyCircularLinkedList;

class node{
    int data;
    node next;
    node prev;

    node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DoublyLinkedList{
    node head=null;
    node tail=null;

    public void addFirst(int data) {
        node newNode = new node(data);

        if (head == null) {           // empty list
            head = newNode;
            tail = newNode;
            newNode.next = newNode;   // circular - next to itself
            newNode.prev = newNode;   // circular - prev to itself
        } else {                      // non-empty list
            newNode.next = head;      // new -> old head
            newNode.prev = tail;      // new.prev -> tail
            head.prev = newNode;      // old head.prev -> new
            tail.next = newNode;      // tail.next -> new (maintain circular)
            head = newNode;           // update head
        }
    }

    public void addLast(int data){
        node newNode = new node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        newNode.next=head;
        newNode.prev= tail;
        head.prev=newNode;
        tail.next=newNode;
        head=newNode;
    }

    public void DisplayForward(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println(head.data+" <-> ");

        node temp= head.next;
        while(temp!=head){
            System.out.println(temp.data+" <-> ");
            temp =temp.next;
        }
    }

    public void DisplayBackward(){
        if(head== null){
            System.out.println("List is empty!!");
            return;
        }

        System.out.println(tail.data);

        node temp=tail.prev;
        while(temp!=tail){
            System.out.println(temp.data+" <-> ");
            temp=temp.prev;
        }
    }

    public void DeleteFront(){
        if(head==null){
            System.out.println("List is Empty!");
            return;
        }

        if(head==null){
            head = tail = null;
            return;
        }
        head=head.next;
        tail.next=head;
        head.prev=tail;
    }

    public void DeleteLast(){
        if(head==null){
            System.out.println("List is Empty!!");
            return;
        }

        if(head==tail){
            head= tail=null;
            return;
        }

        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
    }
}
public class a_DoublyCircularLinkedList {
    public static void main(String[] args) {

    }
}
