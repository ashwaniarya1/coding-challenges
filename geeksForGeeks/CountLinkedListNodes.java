package geeksForGeeks;

/*
Given a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.
 */
public class CountLinkedListNodes {

    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public int getCount(Node head) {
        if(head==null) return 0;
        Node traverse = head;
        int count=1;
        while(traverse.next!=null){
            count++;
            traverse = traverse.next;
        }
        return count;
    }

}
