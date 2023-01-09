package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;
import org.junit.Assert;

/**
 * @author xiaotian on 2023/1/9
 */
public class Hot101_Symmetric_Test extends BaseTest {

    @Override
    public void test() {
        Hot101_Symmetric func = new Hot101_Symmetric();
        Assert.assertTrue(func.isSymmetric(TreeNode.create(1, 2, 2, 3, 4, 4, 3)));
        Assert.assertFalse(func.isSymmetric(TreeNode.create(1, 2, 2, null, 3, null, 3)));
    }
}
