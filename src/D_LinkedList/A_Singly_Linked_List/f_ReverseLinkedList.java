package D_LinkedList.A_Singly_Linked_List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class f_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // Initialize previous pointer as null
        ListNode prev = null;
        ListNode current = head;

        // Traverse the list
        while (current != null) {
            // Temporarily store the next node
            ListNode nextNode = current.next;

            // Reverse the link
            current.next = prev;

            // Move pointers one position forward
            prev = current;
            current = nextNode;
        }

        // prev will be the new head
        return prev;
    }

}
