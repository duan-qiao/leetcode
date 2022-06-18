package cn.edu.seu.sky.hot;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author xiaotian on 2022/6/16
 * https://leetcode.cn/problems/letter-combinations-of-a-phone-number/
 */
public class Hot17_Telephone {

    public static final String[][] ARRAY = new String[][]{
            {"a", "b", "c"},
            {"d", "e", "f"},
            {"g", "h", "i"},
            {"j", "k", "l"},
            {"m", "n", "o"},
            {"p", "q", "r", "s"},
            {"t", "u", "v"},
            {"w", "x", "y", "z"},
    };

    public List<String> letterCombinations(String digits) {
        if (digits.length() <= 0) {
            return Collections.emptyList();
        }
        String[] str1 = getStrArray(digits, 0);
        for (int i = 1; i < digits.length(); i++) {
            str1 = combination(str1, getStrArray(digits, i));
        }
        return Arrays.asList(str1);
    }

    private String[] getStrArray(String digits, int index) {
        return ARRAY[digits.charAt(index) - '0' - 2];
    }

    private String[] combination(String[] str1, String[] str2) {
        int x = 0;
        String[] str = new String[str1.length * str2.length];
        for (String s1 : str1) {
            for (String s2 : str2) {
                str[x++] = s1 + s2;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Hot17_Telephone func = new Hot17_Telephone();
        System.out.println(func.letterCombinations("23"));
        System.out.println(func.letterCombinations("2"));
        System.out.println(func.letterCombinations(""));
    }
}
