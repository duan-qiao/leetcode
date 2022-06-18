package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.ListNode;

/**
 * @author xiaotian
 * <p>
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。返回删除后的链表的头节点。
 */
public class Offer18_DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) {
            pre.next = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node = ListNode.create(4, 5, 1, 9).print();
        Offer18_DeleteNode function = new Offer18_DeleteNode();
        function.deleteNode(node, 1).print();
    }
}
