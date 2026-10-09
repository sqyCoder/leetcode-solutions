import java.util.Arrays;

public class leetcode611 {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        int mid = right - 1;
        while (right > 1) {
            while (left < mid) {
                if (nums[left] + nums[mid] > nums[right]) {
                    count = count + mid - left;
                    mid--;
                } else {
                    left++;
                }
            }
            right--;
            left = 0;
            mid = right - 1;
        }
        return count;
    }
}
