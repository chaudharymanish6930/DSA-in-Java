package J_Queue;

import javax.crypto.spec.PSource;

public class a_LinearQueue {
    class LinearQueue{
        int size;
        int front, rear=-1;
        int[] arr;

        LinearQueue(int size){
            this.size = size;
            arr = new int[size];
            front =-1;
            rear =-1;
        }

        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
                return;
            }
            arr[++rear]=data;
            if(front ==-1){
//                ++front;
                front =1;
            }
            return;
        }

        public void remove(){
            if(front==-1){
                System.out.println("Queue is Empty!!");
                return;
            }
            ++front;
            if(front>rear){
                System.out.println("Now, Queue is empty");
                front = rear = -1;
            }
        }
        public boolean isEmpty(){
            return front ==-1;
        }

        public int peek(){
            return arr[rear];
        }

        public void Display(){
            for(int i=0; i<size; i++){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {

    }
}
