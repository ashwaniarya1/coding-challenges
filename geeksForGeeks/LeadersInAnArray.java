package geeksForGeeks;

import java.util.ArrayList;

/*
Given an array A of positive integers. Your task is to find the leaders in the array.
An element of array is a leader if it is greater than or equal to all the elements to its right side.
The rightmost element is always a leader.
 */
public class LeadersInAnArray {
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> sol = new ArrayList<>();
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= max) {
                sol.add(0, arr[i]);
                max = arr[i];
            }
        }
        return sol;
    }

}
