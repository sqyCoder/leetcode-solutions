import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int count = nums.length - 1;
        for (; count > 1; count--) {
            if (count < nums.length - 1 && nums[count] == nums[count + 1]) {
                continue;
            }
            int left = 0;
            int right = count - 1;
            while (left < right) {
                List<Integer> list1 = new ArrayList<>();
                if (nums[left] + nums[right] == -nums[count]) {
                    list1.add(nums[left]);
                    list1.add(nums[right]);
                    list1.add(nums[count]);
                    list.add(list1);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (nums[left] + nums[right] > -nums[count]) {
                    right--;
                } else if (nums[left] + nums[right] < -nums[count]) {
                    left++;
                }
            }

        }
        return list;
    }
}
