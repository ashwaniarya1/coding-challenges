package leetcode;

/*
There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
Your score is the sum of the points of the cards you have taken.
Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
 */
public class MaximumPointsYouCanObtainFromCards {
    public int maxScore(int[] cardPoints, int k) {
        if (k == 0 || cardPoints == null || cardPoints.length == 0 || k > cardPoints.length) return 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + cardPoints[i];
        }
        int max = sum;

        for (int i = 0; i < k; i++) {
            sum = cardPoints[cardPoints.length - 1 - i] + sum - cardPoints[k - 1 - i];
            if (max < sum) max = sum;
        }
        return max;

    }
}
