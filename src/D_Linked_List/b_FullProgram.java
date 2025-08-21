package D_Linked_List;

public class b_FullProgram {
    node head;

    class node{
        int data;
        node next;

        node(int data){
            this.data= data;
            this.next = null;
        }
    }

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
        if(head == null){
            head = newNode;
            return;
        }

        node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        b_FullProgram list = new b_FullProgram();
        list.addFirst(10);
        list.addFirst(20);
        list.printList();

        list.addLast(40);
        list.addFirst(30);
        list.add(100);
        list.printList();
    }
}
