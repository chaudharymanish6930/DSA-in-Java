package F_Queue.C_UsingLinkedList;
public class a_basics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class queuell{
        Node head = null;
        Node tail = null;
        int size =0;

        public void add(int data){
            Node temp = new Node(10);
            if(size == 0){
                head = tail = temp;
            }
            else{
               tail.next = temp;
               tail = temp;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty!!");
                return -1;
            }
            return head.data;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty!!");
                return -1;
            }
            else{
                int x = head.data;
                head = head.next;
                size--;
                return x;
            }
        }
        public static void Display(){
            if(size==0){

            }
        }
    }
    public static void main(String[] args) {

    }
}
