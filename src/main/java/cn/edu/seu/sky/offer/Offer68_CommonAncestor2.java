package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.TreeNode;

/**
 * @author xiaotian
 * <p>
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 */
public class Offer68_CommonAncestor2 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null && right == null) {
            // p q 一个在左，一个在右
            return null;
        }
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
