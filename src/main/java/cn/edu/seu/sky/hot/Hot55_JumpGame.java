package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2022/7/1
 * https://leetcode.cn/problems/jump-game/
 */
public class Hot55_JumpGame {

    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                return false;
            }
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }
}
