class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}

 public class LinkedListCyclicOrNot {
    // Method to check if the linked list is cyclic
    public boolean cyclic(ListNode1 head) {
       ListNode1 slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    // Method to create a linked list from an array of values
    public ListNode1 createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode1 head = new ListNode1(values[0]);
        ListNode1 current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode1(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListCyclicOrNot sol = new LinkedListCyclicOrNot();
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8};
        ListNode1 head = sol.createLinkedList(values);

        // Create a cycle for testing purposes:
        // Let's connect the last node to the third node (value 3)
         head.next.next.next.next.next.next.next.next = head.next.next;

        boolean hasCycle = sol.cyclic(head);
        System.out.println("The linked list is cyclic: " + hasCycle);
    }
}
