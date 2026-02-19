package D_LinkedList.A_Singly_Linked_List;

public class g_KthNodeFromLinkedList {
    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(30);
        node f = new node(20);
        node g = new node(10);

        a.next = b;  // 10 -> 20
        b.next = c;  // 10 -> 20 -> 30
        c.next = d;  // 10 -> 20 -> 30 -> 40
        d.next = e;  // 10 -> 20 -> 30 -> 40 -> 50
        e.next = f;  // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        f.next = g;  // 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70
        g_KthNodeFromLinkedList list = new g_KthNodeFromLinkedList();
//        list.KthNodeFromReverse(a);
        System.out.println(list.KthNodeFromReverse(a,7));
    }
    static int KthNodeFromReverse(node head,int k){
        // Your code here
        // int count=0;
        node curr=head;
        node next=null;
        node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            // count++;
        }
        int count=0;

        // head=prev;
        curr=prev;
        count=0;
        while(curr!=null){
            count++;
            if(count==k){
                return curr.data;
            }
            // count++;
            curr=curr.next;
        }
        return -1;
    }
}
