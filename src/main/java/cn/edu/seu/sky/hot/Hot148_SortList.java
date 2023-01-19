package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.common.ListNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author xiaotian on 2023/1/13
 * https://leetcode.cn/problems/sort-list/?favorite=2cktkvj
 */
public class Hot148_SortList {

    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        list.sort(Comparator.comparingInt(x -> x));
        p = head;
        for (Integer num : list) {
            p.val = num;
            p = p.next;
        }
        return head;
    }
}
