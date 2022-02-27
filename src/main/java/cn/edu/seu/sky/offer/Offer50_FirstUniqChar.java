package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 * <p>
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。s只包含小写字母。
 */
public class Offer50_FirstUniqChar {

    public char firstUniqChar(String s) {
        int[] array = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            array[c - 'a']++;
        }
        for (char c : chars) {
            if (array[c - 'a'] == 1) {
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Offer50_FirstUniqChar function = new Offer50_FirstUniqChar();
        System.out.println(function.firstUniqChar("abaccdeff"));
        System.out.println(function.firstUniqChar("leetcode"));
        System.out.println(function.firstUniqChar(""));
    }
}
