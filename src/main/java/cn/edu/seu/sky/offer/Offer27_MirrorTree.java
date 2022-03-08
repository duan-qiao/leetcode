package cn.edu.seu.sky.offer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void printTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            list.add(node.val);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(9);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        // 输入：root = [4,2,7,1,3,6,9]
        // 输出：[4,7,2,9,6,3,1]
        Offer27_MirrorTree function = new Offer27_MirrorTree();
        function.printTree(node1);
        TreeNode treeNode = function.mirrorTree(node1);
        function.printTree(treeNode);
    }
}
