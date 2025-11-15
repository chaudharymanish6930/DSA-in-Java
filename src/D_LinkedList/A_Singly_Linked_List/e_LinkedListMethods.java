package D_LinkedList.A_Singly_Linked_List;

public class e_LinkedListMethods {
    public  static void main(String[] args){
        LinkedList num = new LinkedList();

        num.add(4);
        num.add(6);
        num.printvalue();

        num.addFirst(10);
        num.printvalue();

        num.addLast(20);
        num.printvalue();

        System.out.println(num.getSize());

        num.printvalue();

        num.inserAt(1,1100);
        num.printvalue();

        num.deleteLast();
        num.printvalue();

        System.out.println(num.getSize());

        num.deleteFirst();
        num.deleteAt(2);
        num.printvalue();

        System.out.println(num.getSize());

        System.out.println(num.getElementAt(2));

        num.ReverseList();
        num.printvalue();
    }
}
