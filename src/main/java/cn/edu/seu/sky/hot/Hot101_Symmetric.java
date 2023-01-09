package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.TreeNode;

/**
 * @author xiaotian on 2023/1/9
 * https://leetcode.cn/problems/symmetric-tree/?favorite=2cktkvj
 */
public class Hot101_Symmetric {

    public boolean isSymmetric(TreeNode root) {
        return root == null || recur(root.left, root.right);
    }

    boolean recur(TreeNode left, TreeNode right) {
        // 递归的终止条件是两个节点都为空
        if (left == null && right == null) {
            return true;
        }
        // 或者两个节点中有一个为空，或者两个节点的值不相等
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return recur(left.left, right.right) && recur(left.right, right.left);
    }
}
