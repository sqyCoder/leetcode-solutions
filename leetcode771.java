import java.util.HashMap;
import java.util.Map;

public class leetcode771 {   // 文件名必须叫 Leetcode771.java

    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();

        // 统计 stones 中每个字符出现的次数
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 遍历 jewels，把每个珠宝字符在 stones 中的次数累加
        int sum = 0;
        for (int j = 0; j < jewels.length(); j++) {
            sum += map.getOrDefault(jewels.charAt(j), 0);
        }

        return sum;
    }
}