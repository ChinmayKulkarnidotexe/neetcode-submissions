class Solution {
    public int pivotIndex(int[] nums) {
        int presum = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (presum == ((sum - nums[i]) / 2)) return i;
            presum += nums[i];
        }
        return -1;
    }
}