package D_Linked_List.A_Singly_Linked_List;

public class a_BasicStructure {
    public static class node{
        int data;  // value
        node next;  // address of next node

        node(int data){
            this.data= data;
        }
    }

    public  static void main(String[] args){
        node a = new node(1);
        System.out.println(a); // $node@8efb846
        System.out.println(a.data);  // 1
        System.out.println(a.next);   // null

        node b = new node(2);
        a.next = b;
        System.out.println(b);   // $node@2a84aee7
        System.out.println(a.next);   // $node@2a84aee7
        System.out.println(b.data);  // 2
        System.out.println(b.next);  // null

        node c = new node(3);
        b.next =c;
        System.out.println(c);     // $node@a09ee92
        System.out.println(b.next);   // $node@a09ee92
        System.out.println(c.data);   // 3
        System.out.println(c.next);    // null

    }
}
