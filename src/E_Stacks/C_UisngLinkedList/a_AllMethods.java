package E_Stacks.C_UisngLinkedList;

public class a_AllMethods {

    public static class Node{
        int data;
        Node next;
        Node(int data ){
            this.data= data;
            this.next= null;
        }
    }

    public static class LLstack{
        Node head = null;
        int size = 0;

        public void push(int data){
            Node temp = new Node(data);
            temp.next=head;
            head = temp;
            size++;
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
            }
            System.out.println();
        }

        public int size(){  // getter
            return size;
        }

        public int pop(){
            if(head== null){
                System.out.println("Stack Is Empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        public int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
