package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaotian
 * <p>
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 */
public class Offer22_KthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head, cur = head;
        for (int i = 0; i < k; i++) {
            cur = cur.next;
        }
        while (cur != null) {
            pre = pre.next;
            cur = cur.next;
        }
        return pre;
    }

    public void printNode(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ListNode node = ListNode.create(1, 2, 3, 4, 5, 6).print();
        Offer22_KthFromEnd function = new Offer22_KthFromEnd();
        function.getKthFromEnd(node, 2).print();
    }
}
