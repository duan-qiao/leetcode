package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.TreeNode;

/**
 * @author xiaotian
 *
 * 给定一棵二叉搜索树，请找出其中第 k 大的节点的值
 */
public class Offer54_kthLargest {

    int count = 0, val = 0;

    public int kthLargest(TreeNode root, int k) {
        dfs(root, k);
        return val;
    }

    public void dfs(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        dfs(root.right, k);
        if (++count == k) {
            val = root.val;
            return;
        }
        dfs(root.left, k);
    }
}
