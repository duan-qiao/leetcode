package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.TreeNode;

/**
 * @author xiaotian
 * <p>
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先
 */
public class Offer68_CommonAncestor1 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // 都在右子树
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        // 都在左子树
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
}
