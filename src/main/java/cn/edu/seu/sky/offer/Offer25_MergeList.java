package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.ListNode;

/**
 * @author xiaotian
 * <p>
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的
 */
public class Offer25_MergeList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0), node = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        node.next = l1 != null ? l1 : l2;
        return head.next;
    }

    public static void main(String[] args) {
        ListNode node1 = ListNode.create(new int[]{1, 2, 4}).print();
        ListNode node2 = ListNode.create(new int[]{1, 3, 5}).print();

        Offer25_MergeList function = new Offer25_MergeList();
        function.mergeTwoLists(node1, node2).print();
    }
}
