package cn.edu.seu.sky.hot;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaotian on 2022/6/28
 * https://leetcode.cn/problems/permutations/
 */
public class Hot46_Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }
        dfs(result, new ArrayList<>(), new boolean[nums.length], nums);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> path, boolean[] used, int[] nums) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(result, path, used, nums);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
}
