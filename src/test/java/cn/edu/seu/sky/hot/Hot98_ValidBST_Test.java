package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;
import org.junit.Assert;

/**
 * @author xiaotian on 2023/1/9
 */
public class Hot98_ValidBST_Test extends BaseTest {

    @Override
    public void test() {
        Hot98_ValidBST func = new Hot98_ValidBST();
        Assert.assertTrue(func.isValidBST(TreeNode.create(2, 1, 3)));
        Assert.assertFalse(func.isValidBST(TreeNode.create(5, 1, 4, null, null, 3, 6)));
        Assert.assertFalse(func.isValidBST(TreeNode.create(2, 2, 3)));
        Assert.assertFalse(func.isValidBST(TreeNode.create(5, 4, 6, null, null, 3, 7)));
    }
}
