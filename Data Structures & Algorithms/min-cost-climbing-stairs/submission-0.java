class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(climb(cost, 0, 0), climb(cost, 1, 0));
    }

    private static int climb(int[] cost, int i, int currVal) {
        if (i >= cost.length) return currVal;

        currVal += cost[i];
        return Math.min(climb(cost, i + 1, currVal), climb(cost, i + 2, currVal));
    }
}
