package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.TreeNode;

/**
 * @author xiaotian on 2023/1/18
 * https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/?favorite=2cktkvj
 */
public class Hot236_LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {
            // p q 都在右子树
            return right;
        }
        if (right == null) {
            // p q 都在左子树
            return left;
        }
        return root;
    }
}
