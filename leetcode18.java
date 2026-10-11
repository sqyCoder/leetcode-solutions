public class leetcode18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int i = nums.length - 1;
        int j;
        int left;
        int right;
        while (i > 2) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                i--;
                continue;
            }
            j = i - 1;
            while (j > 1) {
                if (j < i - 1 && nums[j] == nums[j + 1]) {
                    j--;
                    continue;
                }
                left = 0;
                right = j - 1;
                while (left < right) {
                    long sum = (long) nums[left] + nums[right] + nums[j] + nums[i];
                    if (sum == target) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[left]);
                        list1.add(nums[right]);
                        list1.add(nums[j]);
                        list1.add(nums[i]);
                        list.add(list1);

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
                j--;
                left = 0;
                right = j - 1;
            }
            i--;
            j = i - 1;
            left = 0;
            right = j - 1;
        }
        return list;
    }
}
