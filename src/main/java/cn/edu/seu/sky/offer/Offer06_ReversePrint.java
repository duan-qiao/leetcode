package cn.edu.seu.sky.offer;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author xiaotian
 * <p>
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）
 */
public class Offer06_ReversePrint {

    public int[] reversePrint1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int i = 0;
        int[] array = new int[stack.size()];
        while (!stack.isEmpty()) {
            array[i++] = stack.pop();
        }
        return array;
    }

    public int[] reversePrint(ListNode head) {
        int size = 0;
        ListNode head1 = head;
        while (head1 != null) {
            size++;
            head1 = head1.next;
        }
        int[] array = new int[size];
        while (head != null) {
            array[--size] = head.val;
            head = head.next;
        }
        return array;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        head.next = node1;
        node1.next = node2;

        Offer06_ReversePrint function = new Offer06_ReversePrint();
        System.out.println(Arrays.toString(function.reversePrint(head)));
    }
}
