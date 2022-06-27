package cn.edu.seu.sky.hot;

import java.util.Arrays;

/**
 * @author xiaotian on 2022/6/27
 * https://leetcode.cn/problems/next-3/
 */
public class Hot32_NextPermutation {

    public void nextPermutation1(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            // 最后往前找到一个小的数nums[i]
            if (nums[i] > nums[i - 1]) {
                // 将之后的数从小到大排列
                Arrays.sort(nums, i, len);
                for (int j = i; j < len; j++) {
                    // 再在后边找一个刚好大于nums[i]的数
                    if (nums[j] > nums[i - 1]) {
                        // 交换
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }
            }
        }
        // 如果不存在下一个更大的排列，则将数字升序排列
        Arrays.sort(nums);
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}