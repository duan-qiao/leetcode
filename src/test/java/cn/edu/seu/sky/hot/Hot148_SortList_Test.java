package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.ListNode;
import org.junit.Assert;

/**
 * @author xiaotian on 2023/1/19
 */
public class Hot148_SortList_Test extends BaseTest {

    @Override
    public void test() {
        Hot148_SortList func = new Hot148_SortList();

        ListNode node1 = func.sortList(ListNode.create(4, 2, 1, 3));
        Assert.assertTrue(node1.equals(ListNode.create(1, 2, 3, 4)));

        ListNode node2 = func.sortList(ListNode.create(-1, 5, 3, 4, 0));
        Assert.assertTrue(node2.equals(ListNode.create(-1, 0, 3, 4, 5)));
    }
}
