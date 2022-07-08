package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;
import org.junit.Assert;

import java.util.List;

/**
 * @author xiaotian on 2022/7/8
 */
public class Offer32_LevelOrder2_Test extends BaseTest {

    @Override
    public void test() {
        TreeNode node = TreeNode.create(2, 9, 20, null, null, 13, 7);
        Offer32_LevelOrder2 func = new Offer32_LevelOrder2();
        List<List<Integer>> list = func.levelOrder(node);
        Assert.assertEquals("[2]", list.get(0).toString());
        Assert.assertEquals("[9, 20]", list.get(1).toString());
        Assert.assertEquals("[13, 7]", list.get(2).toString());
    }
}
