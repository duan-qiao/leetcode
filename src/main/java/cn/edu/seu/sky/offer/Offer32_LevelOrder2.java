package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author xiaotian
 * <p>
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行
 */
public class Offer32_LevelOrder2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                if (node == null) {
                    break;
                }
                l.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (!l.isEmpty()) {
                list.add(l);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(13);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;

        Offer32_LevelOrder2 function = new Offer32_LevelOrder2();
        System.out.println(function.levelOrder(root));
    }
}
