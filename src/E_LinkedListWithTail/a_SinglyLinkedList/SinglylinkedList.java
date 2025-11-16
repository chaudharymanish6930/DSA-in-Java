package E_LinkedListWithTail.a_SinglyLinkedList;

import D_LinkedList.A_Singly_Linked_List.LinkedList;

class node{
    int data;
    node next;

    node(int data){
        this.data= data;
        this.next=null;
    }
}

class SingleLinkedList{
    node head;
    node tail;

    public void add(int data){
        node NewNode = new node(data);
        if(head==null || tail==null){
            head=NewNode;
            tail=NewNode;
            return;
        }

        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=NewNode;
        tail=NewNode;
    }

    public void addFirst(int data){
        node NewNode = new node(data);
        if(head==null || tail==null){
            head=NewNode;
            tail=NewNode;
            return;
        }

        NewNode.next=head;
        head=NewNode;
        return;
    }

    public void addLast(int data){
        node NewNode = new node(data);
        if(head==null || tail==null){
            head=NewNode;
            tail=NewNode;
            return;
        }

        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=NewNode;
        tail=NewNode;
    }

    public void Display(){
        if(head==null || tail==null){
            System.out.println("List is Empty");
            return;
        }

        node temp = head;
        while(temp != null){
            System.out.println(temp.data+" -> ");
            temp= temp.next;
        }
        return;
    }

    public void DisplayReverse(){
        if(head==null || tail==null){
            System.out.println("List is Empty!!");
            return;
        }
        node curr=head;
        node next=null;
        node  prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        tail =head;
        head = prev;
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty!!");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }

        head= head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is Empty!!");
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }

        node temp=head;
        // stop at second-last node
        while (temp.next != tail) {
            temp = temp.next;
        }

        // delete last
        temp.next = null;
        tail = temp;
    }

    public void addAt(int data, int index){
        node newNode = new node(data);
        if(index==getSize()){
            addLast(data);
            return;
        }
        if(index==0){
            addLast(data);
            return;
        }
        else if(index<0 || index>getSize()){
            System.out.println("Invalid Input!!");
            return;
        }

        node temp=head;
        for(int i=1; i<=index-1; i++){
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int getSize(){
        int i =0;
        node currNode = head;
        while(currNode != null){
            i++;
            currNode = currNode.next;
        }
        return i;
    }


}
public class SinglylinkedList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

    }
}
