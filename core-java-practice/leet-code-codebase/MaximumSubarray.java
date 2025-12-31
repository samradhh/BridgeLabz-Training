public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0], cur = 0;
        for (int n : nums) {
            cur = Math.max(n, cur + n);
            max = Math.max(max, cur);
        }
        return max;
    }
}