package D_LinkedList.A_Singly_Linked_List;

public class c_MethodsToAccessTheData {
    public static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void Display(node head){
        // head access is lost
        if(head==null){
            System.out.println("List is Empty!!");
            return;
        }

        System.out.println("Simple Display :");
        node temp=head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("Null\n");
    }

    public void DisplayReverse(node head){
        if(head == null) return;

        System.out.println("by Reverse Function :");
        node NewNext=null;
        node prev=null;
        node current = head;

        while(current!=null){
            NewNext=current.next;
            current.next =prev;
            prev=current;
            current=NewNext;
        }

        node temp=prev;
        while(temp!=null){
            System.out.print(temp.data+" <- ");
            temp=temp.next;
        }
        System.out.println("Null\n");
    }

    public  void DisplayRecursive(node head){
        if(head == null) return;

        System.out.print(head.data+" -> ");
        DisplayRecursive(head.next);
    }

    public int length(node head){
        int count =0;
        node temp=head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args){
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
        // finally the linked list output:: // 10 -> 20 -> 30 -> 40 -> 50 -> 60 -> 70 -> Null

        c_MethodsToAccessTheData obj= new c_MethodsToAccessTheData();
        obj.Display(a);

        System.out.println("By Recursive Function :");
        obj.DisplayRecursive(a);
        System.out.println("Null\n");

        obj.DisplayReverse(a);

        System.out.println("Length of the list (Reverse function) :"+"\n"+obj.length(g));
    }
}
