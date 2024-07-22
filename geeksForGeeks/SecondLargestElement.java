package geeksForGeeks;

/*
Given an array Arr of size N, print the second largest distinct element from an array.
If the second largest element doesn't exist then return -1.
 */
public class SecondLargestElement {
    int print2largest(int arr[], int n) {
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max2 && arr[i] < max1) max2 = arr[i];
            else if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
        }
        if (max1 == max2 || n == 1 || max2 == 0) return -1;
        else return max2;
    }

}
