// Definition for singly-linked list node.
class ListNode{
    int val;
    ListNode next;
    ListNode(int val)
    {
        this.val = val;
        this.next = next;
    }
}

// Class to find the middle node of a linked list.
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head)
    {
        ListNode slow = head,fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public ListNode createLinkedList(int[] values)
    {
        if(values.length == 0)
            return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for(int i=1;i<values.length;i++)
        {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String args[])
    {
        MiddleOfLinkedList sol = new MiddleOfLinkedList();
        int[] values = {1,2,3,4,5,6,8,9};

        ListNode head = sol.createLinkedList(values);
        ListNode middle = sol.middleNode(head);

        System.out.println("Middle of the linked list:"+middle.val);
    }

    }

    // Method to print the list from a given node (for testing purposes).
