package cn.edu.seu.sky.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotian on 2023/1/5
 * https://leetcode.cn/problems/subsets/?favorite=2cktkvj
 */
public class Backtrack78_SubSets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        backtrack(res, new LinkedList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, LinkedList<Integer> path, int[] nums, int start) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.addLast(nums[i]);
            backtrack(res, path, nums, i + 1);
            path.removeLast();
        }
    }
}