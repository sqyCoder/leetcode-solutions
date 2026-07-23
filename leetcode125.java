class leetcode125 {
    public static boolean isValidChar(char ch){
        if((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')){
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length()-1;
        while(left < right){
            while(left < right && !isValidChar(s.charAt(left))){
                left++;
            }

            while(left < right && !isValidChar(s.charAt(right))){
                right--;
            }

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}