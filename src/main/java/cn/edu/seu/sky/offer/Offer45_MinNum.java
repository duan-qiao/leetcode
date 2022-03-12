package cn.edu.seu.sky.offer;

import java.util.Arrays;

/**
 * @author xiaotian
 * <p>
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 */
public class Offer45_MinNum {

    public String minNumber(int[] nums) {
        // 转成字符串数组
        String[] array = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            array[i] = String.valueOf(nums[i]);
        }
        // 排序
        Arrays.sort(array, (x, y) -> (x + y).compareTo(y + x));
        // 拼成一个字符串
        StringBuilder sb = new StringBuilder();
        for (String str : array) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Offer45_MinNum function = new Offer45_MinNum();
        System.out.println(function.minNumber(new int[]{10, 2}));
        System.out.println(function.minNumber(new int[]{3, 30, 34, 5, 9}));
    }
}
