package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2023/1/12
 * https://leetcode.cn/problems/majority-element/?favorite=2cktkvj
 */
public class Hot169_MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0, res = 0;
        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            count += (num == res) ? 1 : -1;
        }
        return res;
    }
}