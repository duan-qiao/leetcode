package cn.edu.seu.sky.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotian on 2022/6/28
 * https://leetcode.cn/problems/permutations/
 */
public class Backtrack46_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        backtrack(result, new LinkedList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backtrack(List<List<Integer>> res, LinkedList<Integer> path, int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.addLast(nums[i]);
                used[i] = true;
                backtrack(res, path, nums, used);
                path.removeLast();
                used[i] = false;
            }
        }
    }
}
