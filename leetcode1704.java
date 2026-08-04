public class leetcode1704 {

    public int missingNumber(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++){
            res ^= i;
            res ^= nums[i];
        }
        res ^= nums.length;
        return res;
    }

    // main方法，IDEA直接运行，测试样例
    public static void main(String[] args) {
        leetcode1704 solution = new leetcode1704();
        int[] nums1 = {3,0,1};
        System.out.println("样例1输出："+solution.missingNumber(nums1));

        int[] nums2 = {9,6,4,2,3,5,7,0,1};
        System.out.println("样例2输出："+solution.missingNumber(nums2));
    }
}