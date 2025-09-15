package F_Queue.C_UsingLinkedList;
public class a_BasicProgram {
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
            Node temp = new Node(data);
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
        public void Display(){
            if(size==0){
                System.out.print("Queue is empty!!");
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            queuell q1 = new queuell();
            q1.Display();
            q1.add(10);
            q1.add(20);
            q1.add(30);
            q1.Display();
        System.out.println("Remove element: "+q1.remove());
        System.out.println(q1.size);
            q1.add(40);
            q1.add(50);
        System.out.println("Remove element: "+q1.remove());
            q1.add(60);
            q1.Display();

        System.out.println("peek element: "+q1.peek());
            }
}
