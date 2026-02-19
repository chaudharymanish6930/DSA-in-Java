package D_LinkedList.A_Singly_Linked_List;

public class f_PalindromeLinkedList {
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
        node temp=a;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        f_PalindromeLinkedList list= new f_PalindromeLinkedList();
        list.isPalindrome(a);
        System.out.println(list.isPalindrome(a));
    }

    public boolean isPalindrome(node  head) {
        if(head==null || head.next==null){
            return true;
        }
        node  slow=head;
        node  fast=head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
        node  curr=slow;
        node  prev=null;
        node  next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        node  left=head;
        node  right=prev;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
return true;
        // Restore the whole linked list
//        curr=slow;
//        prev=null;
//        next=null;
//        while(curr!=null){
//            next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }

//        node temp=head;
//        while(temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }

//        return true;
    }
}
