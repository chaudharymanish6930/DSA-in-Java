package D_LinkedList.A_Singly_Linked_List;

public class b_BasicPrintData {
    public static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
        }
    }

    public static void main(String [] args){
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);
        node g = new node(70);

        a.next = b;  // 10 -> 20
        b.next = c;  // 10 -> 20 -> 30
        c.next = d;  // 10 -> 20 -> 30 -> 40
        d.next = e;  // 10 -> 20 -> 30 -> 40 -> 50
        e.next = f;  // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        f.next = g;  // 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70

        // data print by using for loop
        // here size id directly countable....
        node temp;
        temp = a;
        for(int i =1; i <= 7; i++ ){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");

        // data printed by using while loop
        // again temp assign the value of a
        temp = a;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}
