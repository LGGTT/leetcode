package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char aChar = s.charAt(i);
            if (map.containsKey(aChar)) {
                left = Math.max(left,map.get(aChar) + 1);
            }
            map.put(aChar, i);
            length = Math.max(length, i - left + 1);
        }
        return length;
    }
}
