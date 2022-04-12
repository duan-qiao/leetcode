package cn.edu.seu.sky.hot;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaotian on 2022/4/12
 */
public class Hot03_LongestSubStr {

    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        int max = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index]);
            max = Math.max(max, i - start + 1);
            last[index] = i + 1;
        }
        return max;
    }

    public int lengthOfLongestSubstring1(String s) {
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
        Hot03_LongestSubStr function = new Hot03_LongestSubStr();
        System.out.println(function.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(function.lengthOfLongestSubstring("bbbbb"));
        System.out.println(function.lengthOfLongestSubstring("pwwkew"));
        System.out.println(function.lengthOfLongestSubstring(" "));
    }
}
