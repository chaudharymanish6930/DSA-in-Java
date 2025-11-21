package D_LinkedList.A_Singly_Linked_List;

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
            return;
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

//        node secondLast = head;   // head hain yaha
//        node lastNode = head.next;  // head ka next yaha (null)
//        while(lastNode.next != null){  // null nahi toh
//            lastNode = lastNode.next;
//            secondLast = secondLast.next;
//        }
//        secondLast.next = null;

        node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }

        temp =temp.next;
        temp.next=null;

    }

    public void inserAt(int index,int data){
        node newNode  = new node(data);
        if(index == getSize()){
            addLast(data);
            return;
        }
        else if(index==0){
            addFirst(data);
            return ;
        }
        else if(index < 0 || index > getSize()){
            System.out.println("your input is invalid");
        }

        node temp = head;
        for(int i=1; i<=index-1; i++){
            temp =temp.next;
        }
        newNode.next = temp.next;   // newNode  -> temp
        temp.next = newNode;        // temp -> NewNode
    }

    public int getElementAt(int index){
        if(index < 0 || index > getSize()){
            System.out.println("your input is invalid");
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
    }

    public void ReverseList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        node prev = null;
        node current = head;
        node nextNode=null;

        while(current!=null){
            nextNode = current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }

        node temp=prev;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}