package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 *
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Offer05_ReplaceSpace {

    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    public static void main(String[] args) {
        Offer05_ReplaceSpace function = new Offer05_ReplaceSpace();
        System.out.println(function.replaceSpace("We are happy."));
        System.out.println(function.replaceSpace("     "));
    }
}
