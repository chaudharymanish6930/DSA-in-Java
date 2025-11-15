package D_LinkedList.A_Singly_Linked_List;

public class d_FullProgramWithMethod {
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
            size--;
            return;
        }
//        first method....
//        node secondLast = head;
//        node lastNode = head.next;
//        while(lastNode.next != null){
//            lastNode = lastNode.next;
//            secondLast = secondLast.next;
//        }
//        secondLast.next = null;

        node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;  // Delete last node
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

    public void inserAt(int index,int data){
        node newNode  = new node(data);

        if(index == size){
            addLast(data);
            size++;
            return;
        }
        else if(index==0){
            addFirst(data);
            size++;
            return ;
        }
        else if(index < 0 || index > size){
            System.out.println("your input is invalid");
            return;
        }

        node temp = head;
        for(int i=1; i<=index-1; i++){
            temp =temp.next;
        }
        newNode.next = temp.next;   // newNode  -> next <- temp
        temp.next = newNode;
        size++;
    }

    public int getElementAt(int index){
        if(index < 0 || index > size){
            System.out.println("your input is invalid");
            return -1;
        }
       node temp = head;
        for(int i=1; i<=index; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void deleteAt(int index){
       node temp = head;
        if(index==0){
            head= head.next;
            size--;
        }
        for(int i=1; i<=index; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
        /*
        for you have a tail of the linked list
        then you assign the last element to the tail
        like::
        if(index == size-1){
            tail.temp;
        }
        at the end size--
         */
    }

    public static void main(String[] args) {
        d_FullProgramWithMethod list = new d_FullProgramWithMethod();
        list.add(10);
        list.add(20);
        list.printList();

        list.addLast(40);
        list.addFirst(30);
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        list.add(50);
        list.add(60);

//      list.printList();  // invalid output
        list.inserAt(2,200);
        list.inserAt(3,300);
        list.deleteAt(3);

        System.out.println(list.getElementAt(1));
        list.printList();

        System.out.println(list.size);
    }
}
