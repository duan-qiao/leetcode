package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.TreeNode;

/**
 * @author xiaotian
 *
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像
 */
public class Offer27_MirrorTree {

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 翻转左边子树
        TreeNode left = mirrorTree(root.left);
        // 翻转右边子树，并交换左右子树
        root.left = mirrorTree(root.right);
        root.right = left;
        return root;
    }
}
