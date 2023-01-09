package cn.edu.seu.sky.backtrack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotian on 2023/1/8
 * https://leetcode.cn/problems/combinations/
 */
public class Backtrack77_Combine {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }
        backtrack(res, new LinkedList<>(), n, k, 1);
        return res;
    }

    private void backtrack(List<List<Integer>> res, LinkedList<Integer> path, int n, int k, int start) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; i++) {
            path.addLast(i);
            backtrack(res, path, n, k, i + 1);
            path.removeLast();
        }
    }
}
