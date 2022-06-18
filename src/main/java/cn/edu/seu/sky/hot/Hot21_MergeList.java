package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.ListNode;

/**
 * @author xiaotian on 2022/6/17
 * https://leetcode.cn/problems/merge-two-sorted-lists/
 */
public class Hot21_MergeList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        p.next = list1 == null ? list2 : list1;
        return head.next;
    }
}
