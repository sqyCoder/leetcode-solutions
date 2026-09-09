class leetcode283{
    public void moveZeroes(int[] nums) {
        for (int cur = 0, dest = -1;cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                dest++;
                int tmp = nums[dest];
                nums[dest] = nums[cur];
                nums[cur] = tmp;
            }
        }
    }
}