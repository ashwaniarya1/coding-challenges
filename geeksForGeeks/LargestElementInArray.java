package geeksForGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array A[] of size n. The task is to find the largest element in it.
 */
public class LargestElementInArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }

            Compute obj = new Compute();
            System.out.println(obj.largest(a, n));

        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Compute {

    public int largest(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
