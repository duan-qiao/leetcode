package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaotian on 2023/1/9
 * https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/?favorite=2cktkvj
 */
public class Hot114_Flatten {

    public void flatten(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        preOrder(root, path);

        TreeNode pre = root;
        for (int i = 1; i < path.size(); i++) {
            TreeNode node = new TreeNode(path.get(i));
            pre.right = node;
            pre.left = null;
            pre = node;
        }
    }

    private void preOrder(TreeNode root, List<Integer> path) {
        if (root != null) {
            path.add(root.val);
            preOrder(root.left, path);
            preOrder(root.right, path);
        }
    }
}
