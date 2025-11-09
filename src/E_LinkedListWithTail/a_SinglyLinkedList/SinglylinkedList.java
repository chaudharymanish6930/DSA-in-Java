package E_LinkedListWithTail.a_SinglyLinkedList;

import D_LinkedList.A_Singly_Linked_List.LinkedList;

import java.sql.SQLOutput;

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
        node temp=tail;
//        while(temp)
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is Empty!!");
            return;
        }

    }


}
public class SinglylinkedList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

    }
}
