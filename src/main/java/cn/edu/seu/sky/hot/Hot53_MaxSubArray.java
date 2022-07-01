package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2022/7/1
 * https://leetcode.cn/problems/maximum-subarray/
 */
public class Hot53_MaxSubArray {

    public int maxSubArray(int[] nums) {
        int max = nums[0], pre = 0;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            max = Math.max(max, pre);
        }
        return max;
    }
}
