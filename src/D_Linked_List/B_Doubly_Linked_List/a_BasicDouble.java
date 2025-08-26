package D_Linked_List.B_Doubly_Linked_List;

import D_Linked_List.A_Singly_Linked_List.c_PrintDatabyDisplay;

public class a_BasicDouble {
    Node head;
    Node tail;

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data= data;
        }
    }

    public static void display(Node head){
        Node temp= head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayReverse(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayRandom(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        // now temp at the head
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Node insertAtHead(Node head, int x){
        Node temp = new Node(20);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return temp;
    }

    public static void main(String[] args){
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
        display(a);
        displayReverse(g);
        displayRandom(c);  // print all items
        Node newNode = insertAtHead(a,24);
        display(newNode);
    }

}
