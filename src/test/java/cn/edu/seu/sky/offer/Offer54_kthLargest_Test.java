package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/7/8
 */
public class Offer54_kthLargest_Test extends BaseTest {

    @Override
    public void test() {
        TreeNode node = TreeNode.create(3, 1, 4, null, 2);
        Offer54_kthLargest func = new Offer54_kthLargest();
        Assert.assertEquals(4, func.kthLargest(node, 1));
    }
}
