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

    public int getSize(){
        int i =0;
        node currNode = head;
        while(currNode != null){
            i++;
            currNode = currNode.next;
        }
        return i;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }

        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }

        if(head.next == null){
            head = null;
            return;
        }

        node secondLast = head;   // head hain yaha
        node lastNode = head.next;  // head ka next yaha (null)
        while(lastNode.next != null){  // null nahi toh
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

}

