class Solution {
    public int pivotIndex(int[] nums) {
        int presum = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (2*presum == (sum - nums[i])) return i;
            presum += nums[i];
        }
        return -1;
    }
}