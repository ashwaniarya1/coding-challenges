package geeksForGeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an array A[] of size n. The task is to find the largest element in it.
 */
public class LargestElementInArray {
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
