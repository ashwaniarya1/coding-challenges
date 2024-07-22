package geeksForGeeks;

/*
There are n stones and an array of heights and Geek is standing at stone 1 and can jump to one of the following: Stone i+1, i+2, ... i+k stone,
where k is the maximum number of steps that can be jumped and cost will be [hi-hj] is incurred, where j is the stone to land on.
Find the minimum possible total cost incurred before the Geek reaches Stone n.
 */
public class MinimalCost {
    public int minimizeCost(int arr[], int N, int K) {
        if (N == 0 || N == 1) return 0;
        if (K > N - 1) K = N - 1;

        int dp[] = new int[N];
        dp[0] = 0;
        for (int i = 1; i <= K; i++) {
            dp[i] = absVal(arr[i] - arr[0]);
        }
        for (int i = K; i < N; i++) {
            dp[i] = Integer.MAX_VALUE;
            int y = 0;
            for (int j = i - K; j < i; j++) {
                if (absVal(arr[i] - arr[j]) + dp[j] < dp[i]) {
                    dp[i] = absVal(arr[i] - arr[j]) + dp[j];
                }
            }
        }
        return dp[N - 1];
    }

    private int absVal(int num) {
        if (num < 0)
            num = num * -1;
        return num;
    }
}
