package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2022/6/29
 * https://leetcode.cn/problems/trapping-rain-water/
 */
public class Hot42_RainWater {

    /**
     * 定理一：在某个位置i处，它能存的水，取决于它左右两边的最大值中较小的一个。
     * 定理二：当我们从左往右处理到left下标时，左边的最大值left_max对它而言是可信的，但right_max对它而言是不可信的。
     * 定理三：当我们从右往左处理到right下标时，右边的最大值right_max对它而言是可信的，但left_max对它而言是不可信的。
     *
     * 对于位置left而言，它左边最大值一定是left_max，右边最大值“大于等于”right_max，这时候，如果left_max<right_max成立，
     * 那么它就知道自己能存多少水了。无论右边将来会不会出现更大的right_max，都不影响这个结果。 所以当left_max<right_max时，
     * 我们就希望去处理left下标，反之，我们希望去处理right下标。
     */
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, ans = 0;
        while (left <= right) {
            if (leftMax < rightMax) {
                leftMax = Math.max(leftMax, height[left]);
                ans += Math.max(0, leftMax - height[left]);
                ++left;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                ans += Math.max(0, rightMax - height[right]);
                --right;
            }
        }
        return ans;
    }
}


