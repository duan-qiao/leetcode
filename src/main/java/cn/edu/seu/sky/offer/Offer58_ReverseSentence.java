package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 *
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student. "，则输出"student. a am I"。
 */
public class Offer58_ReverseSentence {

    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder s2 = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            if (!"".equals(s1[i])) {
                s2.append(s1[i]).append(" ");
            }
        }
        return s2.toString().trim();
    }

    public static void main(String[] args) {
        Offer58_ReverseSentence function = new Offer58_ReverseSentence();
        System.out.println(function.reverseWords("I am a student. "));
        System.out.println(function.reverseWords("  hello world!  "));
        System.out.println(function.reverseWords("a good   example"));
    }
}
