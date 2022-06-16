package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2022/4/12
 * https://leetcode.cn/problems/longest-palindromic-substring/
 */
public class Hot05_Palindrome {

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int mid = 0; mid < len; mid++) {
            // 奇数
            int left = mid - 1;
            int right = mid + 1;
            while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (right - left > end - start) {
                start = left;
                end = right;
            }
            // 偶数
            left = mid;
            right = mid + 1;
            while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (right - left > end - start) {
                start = left;
                end = right;
            }
        }
        return s.substring(start + 1, end);
    }

    public static void main(String[] args) {
        Hot05_Palindrome func = new Hot05_Palindrome();
        System.out.println(func.longestPalindrome("babad"));
        System.out.println(func.longestPalindrome("cbbd"));
    }
}
