package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.ListNode;
import org.junit.Assert;

/**
 * @author xiaotian on 2023/1/12
 */
public class Hot160_IntersectionNode_Test extends BaseTest {

    @Override
    public void test() {
        Hot160_IntersectionNode func = new Hot160_IntersectionNode();
        ListNode nodeA = ListNode.create(4, 1, 8, 4, 5);
        ListNode nodeB = ListNode.create(5, 6, 1, 8, 4, 5);
        ListNode node = func.getIntersectionNode(nodeA, nodeB);
        Assert.assertEquals(8, node.val);
    }
}
