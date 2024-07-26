package geeksForGeeks;

/*
Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether a given Linked List contains a loop or not
and if the loop is present then return the count of nodes in a loop or else return 0. C is the position of the node to which the last node is connected. If it is 0 then no loop.
 */
public class FindLengthOfLoop {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static int countNodesinLoop(Node head) {
        Node once = head;
        Node twice = head;
        int count = 0;
        if (head == null) return 0;
        while (twice != null && twice.next != null && twice.next.next != null) {
            once = once.next;
            twice = twice.next.next;
            if (once == twice) {
                while (once != twice.next) {
                    count++;
                    twice = twice.next;
                }
                return count + 1;
            }
        }
        return count;
    }
}
