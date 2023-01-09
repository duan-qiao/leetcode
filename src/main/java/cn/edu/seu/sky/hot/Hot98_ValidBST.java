package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.TreeNode;

/**
 * @author xiaotian on 2023/1/9
 * https://leetcode.cn/problems/validate-binary-search-tree/?favorite=2cktkvj
 */
public class Hot98_ValidBST {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}
