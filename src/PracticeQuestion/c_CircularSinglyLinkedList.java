package PracticeQuestion;

class nodee {
    int data;
    nodee next;

    nodee(int data){
        this.data= data;
        this.next= null;
    }
}

class CircularSinglyLinkedList{
    nodee head;
    nodee tail;

    public void InsertFront(int data){
        nodee newNode = new nodee(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next=head;
        }
    }

    public void InsertLast(int data){

    }

}
public class c_CircularSinglyLinkedList {

}
