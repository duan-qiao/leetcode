package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.ListNode;

/**
 * @author xiaotian on 2022/6/16
 * https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
 */
public class Hot19_RemoveNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode p = head, q = head;
        while (n-- > 0) {
            p = p.next;
        }
        if (p == null) {
            return head.next;
        }
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        q.next = q.next.next;
        return head;
    }

    public static void main(String[] args) {
        Hot19_RemoveNode func = new Hot19_RemoveNode();

        ListNode node = ListNode.create(1, 2, 3, 4, 5).print();
        func.removeNthFromEnd(node, 2).print();

        ListNode node1 = ListNode.create(1).print();
        System.out.println(func.removeNthFromEnd(node1, 1) == null);
    }
}
