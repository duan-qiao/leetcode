package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.ListNode;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/6/17
 */
public class Hot21_MergeList_Test extends BaseTest {

    @Override
    public void test() {
        Hot21_MergeList func = new Hot21_MergeList();

        ListNode node1 = ListNode.create(1, 2, 4);
        ListNode node2 = ListNode.create(1, 3, 4);
        ListNode result1 = ListNode.create(1, 1, 2, 3, 4, 4);
        Assert.assertTrue(func.mergeTwoLists(node1, node2).equals(result1));

        ListNode node3 = ListNode.create(-9, 3);
        ListNode node4 = ListNode.create(5, 7);
        ListNode result2 = ListNode.create(-9, 3, 5, 7);
        Assert.assertTrue(func.mergeTwoLists(node3, node4).equals(result2));
    }
}
