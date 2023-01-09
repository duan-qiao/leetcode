package cn.edu.seu.sky.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotian on 2022/6/28
 * https://leetcode.cn/problems/combination-sum-ii/
 */
public class Backtrack40_CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        backtrack(res, new LinkedList<>(), candidates, target, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> result, LinkedList<Integer> path, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            // 剪枝逻辑，值相同的树枝，只遍历第一条
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.addLast(candidates[i]);
            backtrack(result, path, candidates, target - candidates[i], i + 1);
            path.removeLast();
        }
    }
}
