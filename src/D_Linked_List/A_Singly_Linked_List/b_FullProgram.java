package D_Linked_List.A_Singly_Linked_List;

public class b_FullProgram {
    node head;
    int size=0;

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
        size++;
    }

    public void addFirst(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data){
        node newNode = new node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }

        node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
        size++;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }

        head = head.next;
        size--;
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

        node secondLast = head;   // head hain yaha
        node lastNode = head.next;  // head ka next yaha (null)
        while(lastNode.next != null){  // null nahi toh
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;
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

//    public int getSize(){
//        int i =0;
//        node currNode = head;
//        while(currNode != null){
//            i++;
//            currNode = currNode.next;
//        }
//        return i;
//    }

    public static void main(String[] args) {
        b_FullProgram list = new b_FullProgram();
        list.addFirst(10);
        list.addFirst(20);
        list.printList();

        list.addLast(40);
        list.addFirst(30);
        list.add(100);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();
//        list.deleteLast();
        list.printList();
//        System.out.println(list.getSize());
        System.out.println(list.size);
    }
}
