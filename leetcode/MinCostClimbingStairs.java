package leetcode;

/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (n == 2) {
            if (cost[0] < cost[1]) return cost[0];
            else return cost[1];
        } else {
            int[] dp = new int[n];
            dp[0] = cost[0];
            dp[1] = cost[1];
            for (int i = 2; i < n; i++) {
                dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
            }
            if (dp[n - 1] < dp[n - 2]) return dp[n - 1];
            else return dp[n - 2];
        }
    }
}
