public class leetcodelcr179 {
    public int[] twoSum(int[] price, int target) {
        int left = 0;
        int right = price.length - 1;
        int[] arr = new int[2];
        while(left < right) {
            if(price[left] + price[right] == target) {
                arr[0] = price[left];
                arr[1] = price[right];
                return arr;
            } else if (price[left] + price[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return arr;
    }
}
