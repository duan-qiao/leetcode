package cn.edu.seu.sky.offer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xiaotian
 * <p>
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 */
public class Offer34_PathSum {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }

    void recur(TreeNode root, int tar) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        tar -= root.val;

        if (tar == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(path));
        }
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(13);

        TreeNode node6 = new TreeNode(11, node1, node2);
        TreeNode node7 = new TreeNode(4, node3, node4);
        TreeNode node8 = new TreeNode(4, node6, null);
        TreeNode node9 = new TreeNode(8, node5, node7);
        TreeNode node10 = new TreeNode(5, node8, node9);

        Offer34_PathSum function = new Offer34_PathSum();
        System.out.println(function.pathSum(node10, 22));
    }
}
