package cn.edu.seu.sky.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaotian on 2022/6/16
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode create(int[] array) {
        ListNode node = new ListNode();
        ListNode p = node;
        for (int i : array) {
            p.next = new ListNode(i);
            p = p.next;
        }
        return node.next;
    }

    public ListNode print() {
        ListNode p = this;
        List<Integer> list = new ArrayList<>();
        do {
            list.add(p.val);
            p = p.next;
        } while (p != null);
        System.out.println(list);
        return this;
    }
}
