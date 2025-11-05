package PracticeQuestion;
class node{
    int data;
    node next;

    node(int data){
        this.data=data;
        this.next=null;
    }
}

class SinglyLinkedList{
    node head;
    public void add(int data){
        node NewNode = new node(data);
        node temp=head;
        if(head== null){
            head = NewNode;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = NewNode;
        return;
    }

    public void addFirst(int data){
        node NewNode = new node(data);
        if(head==null){
            head = NewNode;
            return;
        }
        NewNode.next = head;
        head = NewNode;
    }

    public void addLast(int data){
        node Newnode = new node(data);
        if(head==null){
            head = Newnode;
            return;
        }

        node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next = Newnode;
    }

    public int getSize(){
        int i =0;
        if(head==null){
            System.out.println("List is empty");
            return 1;
        }
        node temp = head;
        while(temp.next==null){
            i++;
            temp = temp.next;
        }
        return i;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("Your list is empty!!");
        }
        head = head.next;;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("Your list is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next=null;
    }

//    public void deleteAt(int index){
//        if(head==null) return;
//
//        if (index == 0) {
//            head = head.next;
//            return;
//        }
//
//        node temp=head;
//        for(int i=0; temp!=null && i<index-1; i++){
//            temp = temp.next;
//        }
//
//        if(temp==null || temp.next==null){
//            return;
//        }
//         temp.next = temp.next.next;
//    }

//    public
}
public class a_LinkedList {
    public static void main(String[] args) {

    }
}
