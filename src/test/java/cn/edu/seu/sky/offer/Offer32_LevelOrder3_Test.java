package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;
import org.junit.Assert;

import java.util.List;

/**
 * @author xiaotian on 2022/7/8
 */
public class Offer32_LevelOrder3_Test extends BaseTest {

    @Override
    public void test() {
        TreeNode node = TreeNode.create(2, 9, 20, null, null, 17, 7);
        Offer32_LevelOrder3 func = new Offer32_LevelOrder3();
        List<List<Integer>> list = func.levelOrder(node);
        Assert.assertEquals("[2]", list.get(0).toString());
        Assert.assertEquals("[20, 9]", list.get(1).toString());
        Assert.assertEquals("[17, 7]", list.get(2).toString());
    }
}
