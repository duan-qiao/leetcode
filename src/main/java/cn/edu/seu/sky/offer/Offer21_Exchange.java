package cn.edu.seu.sky.offer;

import java.util.Arrays;

/**
 * @author xiaotian
 * <p>
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分
 */
public class Offer21_Exchange {

    public int[] exchange(int[] nums) {
        int i = 0, j = nums.length - 1, temp;
        while (i < j) {
            // 找到左边第一个偶数
            while (i < j && nums[i] % 2 == 1) {
                i++;
            }
            // 找到右边第一个奇数
            while (i < j && nums[j] % 2 == 0) {
                j--;
            }
            // 交换
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Offer21_Exchange function = new Offer21_Exchange();
        System.out.println(Arrays.toString(function.exchange(new int[]{1, 2, 3, 4})));
    }
}
