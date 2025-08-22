package D_Linked_List;

public class a_MainProgram {
    public  static void main(String[] args){
        LinkedList num = new LinkedList();

        num.add(4);
        num.add(6);
        num.printvalue();

        num.addFirst(10);
        num.printvalue();

        num.addLast(20);
        num.printvalue();

        num.addFirst(90);
        num.printvalue();

        System.out.println(num.getSize());
    }
}
