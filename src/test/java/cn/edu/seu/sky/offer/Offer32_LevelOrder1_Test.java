package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;
import org.junit.Assert;

import java.util.Arrays;

/**
 * @author xiaotian on 2022/7/7
 */
public class Offer32_LevelOrder1_Test extends BaseTest {

    @Override
    public void test() {
        Offer32_LevelOrder1 func = new Offer32_LevelOrder1();
        TreeNode node = TreeNode.create(3, 9, 20, null, null, 15, 7).levelOderTraversal();
        Assert.assertEquals("[3, 9, 20, 15, 7]", Arrays.toString(func.levelOrder(node)));
    }
}
