package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.ListNode;

/**
 * @author xiaotian on 2023/1/12
 * https://leetcode.cn/problems/intersection-of-two-linked-lists/?favorite=2cktkvj
 */
public class Hot160_IntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode p1 = headA, p2 = headB;
        while (p1 != p2) {
            // 当你走到终点时，开始走她走过的路
            p1 = p1 != null ? p1.next : headB;
            // 当她走到终点时，开始走你走过的路
            p2 = p2 != null ? p2.next : headA;
        }
        return p2;
    }
}
