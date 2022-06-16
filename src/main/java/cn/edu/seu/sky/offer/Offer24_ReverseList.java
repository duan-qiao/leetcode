package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.common.ListNode;

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

    public static void main(String[] args) {
        ListNode node1 = ListNode.create(new int[]{1, 2, 3, 4, 5}).print();
        Offer24_ReverseList function = new Offer24_ReverseList();
        function.reverseList(node1).print();
    }
}
