import java.util.HashSet;
import java.util.Set;

public class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int temp = 0, len = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            int len1 = right - left + 1;
            len = Math.max(len1, temp);
            temp = len;
        }
        return len;
    }
}
