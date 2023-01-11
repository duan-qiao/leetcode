package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaotian on 2023/1/11
 * https://leetcode.cn/problems/linked-list-cycle-ii/?favorite=2cktkvj
 */
public class Hot142_DetectCycle {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) {
                return head;
            }
            visited.add(head);
            head = head.next;
        }
        return null;
    }
}