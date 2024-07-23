package leetcode;

/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
 */
public class MiddleOfTheLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode middleNode(ListNode head) {
        if(head==null) return head;
        ListNode once = head;
        ListNode twice = head;
        while(twice!=null && twice.next!=null){
            once = once.next;
            twice = twice.next.next;
        }
        return once;
    }
}
