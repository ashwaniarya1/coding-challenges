package geeksForGeeks;

/*
Geek loves linked list data structure. Given an array of integer arr of size n, Geek wants to construct the linked list from arr.
Construct the linked list from arr and return the head of the linked list.
 */
public class IntroductionToLinkedList {

    class Node {
        int data;
        Node next;

        Node() { data = 0; }
        Node(int d) { data = d; }  //constructor to create a new node
    }
    Node constructLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node list = head;
        for(int i=1;i<arr.length;i++){
            Node x = new Node(arr[i]);
            list.next = x;
            list = list.next;
        }
        return head;
    }
}
