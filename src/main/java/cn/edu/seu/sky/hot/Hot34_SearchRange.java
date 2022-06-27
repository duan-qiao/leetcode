package cn.edu.seu.sky.hot;

import java.util.Arrays;

/**
 * @author xiaotian on 2022/6/27
 * https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class Hot34_SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            return new int[]{-1, -1};
        }
        int left = index;
        while (left >= 0 && nums[left] == target) {
            left--;
        }
        int right = index;
        while (right < nums.length && nums[right] == target) {
            right++;
        }
        return new int[]{left + 1, right - 1};
    }
}
