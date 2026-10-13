public class leetcode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                len = Math.min(len, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
            right++;
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}
