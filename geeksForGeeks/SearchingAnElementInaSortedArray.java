package geeksForGeeks;

/*
Given an array arr[] sorted in ascending order of size N and an integer K.
Check if K is present in the array or not.
 */
public class SearchingAnElementInaSortedArray {

    static int searchInSorted(int arr[], int N, int K) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == K) return 1;
        }
        return -1;
    }

}
