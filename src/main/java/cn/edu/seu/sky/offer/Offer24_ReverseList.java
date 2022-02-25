package cn.edu.seu.sky.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaotian
 * <p>
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点
 */
public class Offer24_ReverseList {

    public ListNode reverseList1(ListNode head) {
        ListNode preHead = new ListNode(0);
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            temp.next = preHead.next;
            preHead.next = temp;
            head = head.next;
        }
        return preHead.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    public void print(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        System.out.println(list);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Offer24_ReverseList function = new Offer24_ReverseList();
        function.print(node1);
        function.print(function.reverseList(node1));
    }
}
