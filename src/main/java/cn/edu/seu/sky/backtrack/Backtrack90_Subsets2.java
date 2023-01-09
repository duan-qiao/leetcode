package cn.edu.seu.sky.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotian on 2023/1/8
 */
public class Backtrack90_Subsets2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }
        // 先排序，让相同的元素靠在一起
        Arrays.sort(nums);
        backtrack(res, new LinkedList<>(), nums, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, LinkedList<Integer> path, int[] nums, int start) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            // 剪枝逻辑，值相同的相邻树枝，只遍历第一条
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            path.addLast(nums[i]);
            backtrack(res, path, nums, i + 1);
            path.removeLast();
        }
    }
}