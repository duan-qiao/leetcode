package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;
import org.junit.Assert;

import java.util.List;

/**
 * @author xiaotian on 2022/7/1
 */
public class Offer34_PathSum_Test extends BaseTest {

    @Override
    public void test() {
        TreeNode node = TreeNode.create(5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1);
        Offer34_PathSum func = new Offer34_PathSum();
        List<List<Integer>> paths = func.pathSum(node, 22);
        Assert.assertEquals("[5, 4, 11, 2]", paths.get(0).toString());
        Assert.assertEquals("[5, 8, 4, 5]", paths.get(1).toString());
    }
}
