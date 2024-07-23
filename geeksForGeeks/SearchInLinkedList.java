package geeksForGeeks;

/*
Given a linked list of n nodes and a key , the task is to check if the key is present in the linked list or not.
 */
public class SearchInLinkedList {

    class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        if(head==null) return false;
        Node search = head;
        for(int i=0;i<n;i++){
            if(search.data==key) return true;
            search = search.next;
        }
        return false;
    }
}
