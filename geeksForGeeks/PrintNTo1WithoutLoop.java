package geeksForGeeks;

/*
Print numbers from N to 1 (space separated) without the help of loops.
 */
public class PrintNTo1WithoutLoop {
    void printNos(int N) {
        // code here
        if (N > 0) {
            System.out.print(N + " ");
            printNos(N - 1);
        }
    }
}
