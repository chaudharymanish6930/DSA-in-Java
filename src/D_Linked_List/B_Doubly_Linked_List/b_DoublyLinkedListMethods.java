package D_Linked_List.B_Doubly_Linked_List;

public class b_DoublyLinkedListMethods {
    public static void main(String[] args){
    DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.display();

        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display();

        list.insertAtAnyIndex(60,3);
        list.display();

        list.displayReverse();

        list.deleteLast();
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteAtAnyIndex(2);
        list.display();

        System.out.println(list.getSize());

        System.out.println(list.getElementAtIndex(2));

    }
}
