package D_Linked_List.A_Singly_Linked_List;

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

    public void inserAt(int index,int data){
        node newNode  = new node(data);
        node temp = head;
        if(index == getSize()){
            addLast(data);
            return;
        }
        else if(index==0){
            addFirst(data);
            return ;
        }
        else if(index < 0 || index > getSize()){
            System.out.println("your input is invalis");
        }
        for(int i=1; i<=index-1; i++){
            temp =temp.next;
        }
        newNode.next = temp.next;   // newNode  -> next <- temp
        temp.next = newNode;
    }

    public int getElementAt(int index){
        if(index < 0 || index > getSize()){
            System.out.println("your input is invalis");
            return -1;
        }
        node temp = head;
        for(int i=1; i<=index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void deleteAt(int index){
        node temp = head;
        if(index==0){
            head= head.next;
        }
        for(int i=1; i<=index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        /*
        for you have a tail of the linked list
        then you assign the last element to the tail
        like::
        if(index == size-1){
            tail.temp;
        }
        at the end size--
         */
    }
}