package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;
import org.junit.Assert;

import java.util.List;

/**
 * @author xiaotian on 2022/7/11
 */
public class Hot102_LevelOrder_Test extends BaseTest {

    @Override
    public void test() {
        Hot102_LevelOrder func = new Hot102_LevelOrder();

        TreeNode node = TreeNode.create(3, 9, 20, null, null, 15, 7).levelOderTraversal();
        List<List<Integer>> list = func.levelOrder(node);
        Assert.assertEquals("[3]", list.get(0).toString());
        Assert.assertEquals("[9, 20]", list.get(1).toString());
        Assert.assertEquals("[15, 7]", list.get(2).toString());

        List<List<Integer>> list1 = func.levelOrder(new TreeNode(1));
        Assert.assertEquals("[1]", list1.get(0).toString());
    }
}
