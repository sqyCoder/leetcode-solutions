public class leetcode11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int count = 1;
        int max = Math.min(height[left],height[right]) * (height.length - count);
        while (right > left) {
            if (height[right] > height[left]) {
                left++;
                count++;
            } else {
                right--;
                count++;
            }
            if (Math.min(height[left],height[right]) * (height.length - count) > max) {
                max = Math.min(height[left],height[right]) * (height.length - count);
            }
        }
        return max;
    }
}
