package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 *
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 */
public class Offer46_TranslateNum {

    public int translateNum(int num) {
        int m = 1, n = 1;
        while (num > 9) {
            int t = (num % 100 < 26 && num % 100 > 9) ? m + n : n;
            m = n;
            n = t;
            num /= 10;
        }
        return n;
    }

    public static void main(String[] args) {
        Offer46_TranslateNum function = new Offer46_TranslateNum();
        System.out.println(function.translateNum(12258));
    }
}
