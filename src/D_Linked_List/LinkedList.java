package D_Linked_List;

class node{
    int data;
    node next;

    public node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedList {
    node head;

    public void add(int data){
        node newNode = new node(data);

        node currNode = head;
        if(head == null){
            head = newNode;
        }
        else{
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public void addFirst(int data){
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
        node currNode = head;
        if(head == null){
            head = newNode;
            return;
        }
        else{
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next =newNode;
        }
    }

    public void printvalue(){
        if(head== null){
            System.out.println("list is empty");
            return;
        }

        node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"-> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
}
