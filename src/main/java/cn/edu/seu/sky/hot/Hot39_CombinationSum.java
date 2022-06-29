package cn.edu.seu.sky.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaotian on 2022/6/28
 * https://leetcode.cn/problems/combination-sum/
 */
public class Hot39_CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> path, int[] candidates, int target, int index) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            path.add(candidates[i]);
            dfs(result, path, candidates, target - candidates[i], i);
            path.remove(path.size() - 1);
        }
    }
}
