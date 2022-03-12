package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 *
 * 给定一棵二叉搜索树，请找出其中第 k 大的节点的值
 */
public class Offer54_kthLargest {

    int count = 0, val = 0;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

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

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(2);
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;

        Offer54_kthLargest function = new Offer54_kthLargest();
        System.out.println(function.kthLargest(node1, 1));
    }
}
