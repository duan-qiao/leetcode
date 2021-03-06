package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.ListNode;

/**
 * @author xiaotian
 *
 * 输入两个链表，找出它们的第一个公共节点
 */
public class Offer52_CommNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 两个链表长度分别为L1+C、L2+C， C为公共部分的长度，
        // 第一个人走了L1+C步后，回到第二个人起点走L2步；
        // 第2个人走了L2+C步后，回到第一个人起点走L1步。
        // 当两个人走的步数都为L1+L2+C时就相遇了。
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p1;
    }
}
