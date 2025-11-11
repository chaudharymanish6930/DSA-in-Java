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
        if(front == null || rear == null){
            System.out.println("Queue is Empty");
            return;
        }
        front = front.next;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int peek(){
        return rear.data;
    }

    public void Display(){
        if(front ==null){
            System.out.println("Queue is Empty!");
            return;
        }
        node temp;
        temp = front;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
}
public class b_LinkedList {
    public static void main(String[] args) {
        Queue q1= new Queue();
        q1.Display();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.Display();
    }
}
