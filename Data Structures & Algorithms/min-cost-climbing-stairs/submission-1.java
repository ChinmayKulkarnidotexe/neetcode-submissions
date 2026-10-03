class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return Math.min(climb(cost, 0, dp), climb(cost, 1, dp));
    }

    private static int climb(int[] cost, int i, int[] dp) {
        if (i >= cost.length) return 0;

        if (dp[i] != -1) return dp[i];
        dp[i] = cost[i] + Math.min(climb(cost, i + 1, dp), climb(cost, i + 2, dp));
        return dp[i];
    }
}
