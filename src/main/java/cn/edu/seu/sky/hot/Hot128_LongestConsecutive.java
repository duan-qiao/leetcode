package cn.edu.seu.sky.hot;

import java.util.Arrays;

/**
 * @author xiaotian on 2023/1/10
 * https://leetcode.cn/problems/longest-consecutive-sequence/?favorite=2cktkvj
 */
public class Hot128_LongestConsecutive {

    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                count++;
            } else if (nums[i + 1] == nums[i]) {
                continue;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
