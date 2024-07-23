package geeksForGeeks;

/*
Given the head of a Singly Linked List and a value x, insert that value x at the end of the LinkedList and return the modified Linked List.
 */
public class LinkedListInsertionAtEnd {

    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    Node insertAtEnd(Node head, int x) {
        // code here
        Node insertValue = new Node(x);
        if(head==null){
            head = insertValue;
            return head;
        }
        Node sol = head;
        while(sol.next!=null){
            sol=sol.next;
        }
        sol.next = insertValue;
        return head;
    }
}
