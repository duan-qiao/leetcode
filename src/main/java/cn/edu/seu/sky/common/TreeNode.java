package cn.edu.seu.sky.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author xiaotian on 2022/6/18
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode create(Integer... args) {
        TreeNode root = new TreeNode(args[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < args.length) {
            TreeNode node = queue.poll();
            assert node != null;

            Integer left = args[i++];
            if (left != null) {
                TreeNode n = new TreeNode(left);
                node.left = n;
                queue.offer(n);
            }
            Integer right = args[i++];
            if (right != null) {
                TreeNode n = new TreeNode(right);
                node.right = n;
                queue.offer(n);
            }
        }
        return root;
    }

    public TreeNode preOrderTraversal() {
        List<Integer> path = new ArrayList<>();
        preOrder(path, this);
        System.out.println(path);
        return this;
    }

    private void preOrder(List<Integer> path, TreeNode root) {
        if (root != null) {
            path.add(root.val);
            preOrder(path, root.left);
            preOrder(path, root.right);
        }
    }

    public TreeNode inOrderTraversal() {
        List<Integer> path = new ArrayList<>();
        inOrder(path, this);
        System.out.println(path);
        return this;
    }

    private void inOrder(List<Integer> path, TreeNode root) {
        if (root != null) {
            inOrder(path, root.left);
            path.add(root.val);
            inOrder(path, root.right);
        }
    }

    public TreeNode postOrderTraversal() {
        List<Integer> path = new ArrayList<>();
        postOrder(path, this);
        System.out.println(path);
        return this;
    }

    private void postOrder(List<Integer> path, TreeNode root) {
        if (root != null) {
            postOrder(path, root.left);
            postOrder(path, root.right);
            path.add(root.val);
        }
    }

    public TreeNode levelOderTraversal() {
        System.out.println(levelOderPath());
        return this;
    }

    public String levelOderPath() {
        List<Integer> path = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
            path.add(node.val);
        }
        return path.toString();
    }

    public static void main(String[] args) {
        /*
         *                5
         *               / \
         *              4   8
         *             /   / \
         *            11  13  4
         *           / \     / \
         *          7   2   5   1
         */
        TreeNode root = TreeNode.create(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1)
                // 前序遍历
                .preOrderTraversal()
                // 中序遍历
                .inOrderTraversal()
                // 后序遍历
                .postOrderTraversal()
                // 层次遍历
                .levelOderTraversal();
        System.out.println(root.levelOderPath());
    }
}
