package J_Queue;

class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}
class Queue{
    node front =null;
    node rear = null;

    public void add(int data){
        node NewNode = new node(data);
        if(front ==null){
            front = rear = NewNode;
            return;
        }
        rear.next = NewNode;
        rear = NewNode;
    }

    public void remove(){

    }

    public boolean isEmpty() {
        return front == -1;
    }

    public
}
public class b_LinkedList {

}
