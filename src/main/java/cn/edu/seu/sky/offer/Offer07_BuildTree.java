package cn.edu.seu.sky.offer;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author xiaotian
 * <p>
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 */
public class Offer07_BuildTree {
    /**
     * 前序遍历结果
     */
    int[] preorder;
    /**
     * 中序遍历结果及对应的索引值
     */
    HashMap<Integer, Integer> dic = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        // 标记中序遍历及其对应索引
        for (int i = 0; i < inorder.length; i++) {
            dic.put(inorder[i], i);
        }
        return recur(0, 0, inorder.length - 1);
    }

    /**
     * 递归
     * @param root 前序遍历的根结点索引
     * @param left 中序遍历的左索引
     * @param right 中序遍历的右索引
     * @return 结点
     */
    TreeNode recur(int root, int left, int right) {
        if (left > right) {
            return null;
        }
        // 构造根节点
        TreeNode node = new TreeNode(preorder[root]);
        // i表示前序遍历里的根结点在中序遍历中的位置，以此划分左右子树
        int i = dic.get(preorder[root]);
        // 左子树的根节点就是根结点+1，左边边界就是left，右边边界是中间区分的i-1
        node.left = recur(root + 1, left, i - 1);
        // 右子树的根，就是右子树（前序遍历）的第一个，就是当前根节点 加上左子树的数量
        node.right = recur(root + i - left + 1, i + 1, right);
        return node;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
