package D_Linked_List.B_Doubly_Linked_List;

public class b_DoublyLinkedListMethods {
    public static void main(String[] args){
    DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtHead(12);
        list.insertAtHead(10);
        list.display();

        list.insertAtTail(20);
        list.display();

        list.insertAtAnyIndex(20,2);
        list.display();

        list.insertAtTail(22);
        list.insertAtHead(20);
        list.display();

        list.displayReverse();

    }
}
