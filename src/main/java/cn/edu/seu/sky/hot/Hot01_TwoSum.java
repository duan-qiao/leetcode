package cn.edu.seu.sky.hot;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaotian
 * https://leetcode.cn/problems/two-sum/
 */
public class Hot01_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{i, map.get(x)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
