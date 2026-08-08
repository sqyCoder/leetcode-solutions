public class leetcode189 {
    //把Solution拿到外面，main方法写来测试，IDEA可以直接运行
    static class Solution {
        private void reverse(int[] arr, int i, int j){
            while (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n; //k超过数组长度取模，防止越界
            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
        }
    }

    //main方法程序入口
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        solution.rotate(nums, k);

        //打印输出结果看效果
        for(int num : nums){
            System.out.print(num + " ");
        }
        //预期输出：5 6 7 1 2 3 4
    }
}