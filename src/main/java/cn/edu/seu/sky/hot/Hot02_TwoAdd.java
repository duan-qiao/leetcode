package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.ListNode;

/**
 * @author xiaotian on 2022/4/12
 * https://leetcode.cn/problems/add-two-numbers/
 */
public class Hot02_TwoAdd {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = new ListNode();
        ListNode p3 = r;
        int n = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                n += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                n += l2.val;
                l2 = l2.next;
            }
            p3.next = new ListNode(n % 10);
            p3 = p3.next;
            n /= 10;
        }
        if (n != 0) {
            p3.next = new ListNode(1);
        }
        return r.next;
    }

    public static void main(String[] args) {
        Hot02_TwoAdd func = new Hot02_TwoAdd();

        ListNode node1 = ListNode.create(2, 4, 5).print();
        ListNode node2 = ListNode.create(5, 6, 4).print();
        func.addTwoNumbers(node1, node2).print();

        ListNode node4 = ListNode.create(9, 9, 9, 9, 9, 9, 9).print();
        ListNode node5 = ListNode.create(9, 9, 9, 9).print();
        func.addTwoNumbers(node4, node5).print();
    }
}
