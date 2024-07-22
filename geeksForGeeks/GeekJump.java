package geeksForGeeks;

/*
 Geek wants to climb from the 0th stair to the (n-1)th stair. At a time the Geek can climb either one or two steps.
 A height[N] array is also given. Whenever the geek jumps from stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]),
 where abs() means the absolute difference. return the minimum energy that can be used by the Geek to jump from stair 0 to stair N-1.
 */
public class GeekJump {
    public int minimumEnergy(int arr[], int N) {
        //code here
        if (N == 0 || N == 1) return 0;
        int dp[] = new int[N];
        int k = -2;
        dp[0] = 0;
        dp[1] = absoluteValue(arr[1] - arr[0]);
        for (int i = 2; i < N; i++) {
            if (absoluteValue(arr[i] - arr[i - 1]) + dp[i - 1] > absoluteValue(arr[i] - arr[i - 2]) + dp[i - 2]) {
                dp[i] = absoluteValue(arr[i] - arr[i - 2]) + dp[i - 2];
            } else {
                dp[i] = absoluteValue(arr[i] - arr[i - 1]) + dp[i - 1];
            }
        }
        return dp[N - 1];
    }

    private int absoluteValue(int num) {
        if (num < 0)
            num = num * -1;
        return num;
    }
}
