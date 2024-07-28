package geeksForGeeks;

import java.util.ArrayList;

/*
A number n is called a factorial number if it is the factorial of a positive integer.
For example, the first few factorial numbers are 1, 2, 6, 24, 120,
Given a number n, the task is to return the list/vector of the factorial numbers smaller than or equal to n.
 */
public class FindAllFactorialNumbersLessThanOrEqualToN {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> sol = new ArrayList<>();
        long product=1;
        for(int i=1;i<=n;i++){
            product = product*i;
            if(product>n) break;
            else sol.add(product);
        }
        return sol;
    }
}
