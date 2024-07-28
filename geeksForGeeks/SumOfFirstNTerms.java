package geeksForGeeks;
/*
Given an integer n, calculate the sum of series 13 + 23 + 33 + 43 + … till n-th term.
 */
public class SumOfFirstNTerms {
    long sumOfSeries(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum = sum + (i * i * i);
        }
        return sum;
    }
}
