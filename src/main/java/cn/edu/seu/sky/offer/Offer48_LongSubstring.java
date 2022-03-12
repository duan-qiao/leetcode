package cn.edu.seu.sky.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaotian
 * <p>
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 */
public class Offer48_LongSubstring {

    public int lengthOfLongestSubstring(String s) {
        int max = 0, r = 0, l = 0;
        Set<Character> set = new HashSet<>();
        while (r < s.length()) {
            char c = s.charAt(r++);
            while (set.contains(c)) {
                set.remove(s.charAt(l++));
            }
            set.add(c);
            max = Math.max(max, set.size());
        }
        return max;
    }

    public static void main(String[] args) {
        Offer48_LongSubstring function = new Offer48_LongSubstring();
        System.out.println(function.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(function.lengthOfLongestSubstring("bbbbb"));
        System.out.println(function.lengthOfLongestSubstring("pwwkew"));
        System.out.println(function.lengthOfLongestSubstring(" "));
    }
}
