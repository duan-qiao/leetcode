package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.ListNode;

/**
 * @author xiaotian on 2023/1/11
 * https://leetcode.cn/problems/linked-list-cycle/?favorite=2cktkvj
 */
public class Hot141_HasCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null && slow != null && fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return fast == slow;
    }
}
