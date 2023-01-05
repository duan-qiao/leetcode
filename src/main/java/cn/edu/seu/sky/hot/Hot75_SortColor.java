package cn.edu.seu.sky.hot;

import java.util.Arrays;

/**
 * @author xiaotian on 2023/1/5
 * https://leetcode.cn/problems/sort-colors/?favorite=2cktkvj
 */
public class Hot75_SortColor {

    public void sortColors(int[] nums) {
        int p0 = 0, p2 = nums.length - 1;
        for (int i = 0; i <= p2; ++i) {
            while (i <= p2 && nums[i] == 2) {
                swap(nums, i, p2--);
            }
            if (nums[i] == 0) {
                swap(nums, i, p0++);
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int m, int n) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }

    public static void main(String[] args) {
        Hot75_SortColor function = new Hot75_SortColor();
        function.sortColors(new int[]{2, 0, 2, 1, 1, 0});
        function.sortColors(new int[]{2, 0, 1});
        function.sortColors(new int[]{1, 2, 0});
    }
}
