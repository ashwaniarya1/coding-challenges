package geeksForGeeks;

/*
Print numbers from 1 to n without the help of loops. You only need to complete the function printNos()
that takes N as parameter and prints number from 1 to N recursively.
 */
public class Print1ToNWithoutLoop {
    public void printNos(int N) {
        //Your code here
        if (N > 0) {
            printNos(N - 1);
            System.out.print(N + " ");
        }
    }
}
