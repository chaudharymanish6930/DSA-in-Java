package D_Linked_List;

class node{
    int data;
    node next;
}
public class LinkedList {
    public void add(int data){

    }
}
class LL {
    class node{
        int data;
        node next;

        node(int data){
            this.data= data;
            this.next = null;
        }
    }

    public void addFIrst(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(10);
        list.addFirst(20);
        list.printList();
    }
}