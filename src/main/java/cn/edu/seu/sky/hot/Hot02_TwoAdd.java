package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2022/4/12
 * https://leetcode.cn/problems/add-two-numbers/
 */
public class Hot02_TwoAdd {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r = new ListNode();
        ListNode p3 = r;
        int n = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                n += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                n += l2.val;
                l2 = l2.next;
            }
            p3.next = new ListNode(n % 10);
            p3 = p3.next;
            n /= 10;
        }
        if (n != 0) {
            p3.next = new ListNode(1);
        }
        return r.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Hot02_TwoAdd func = new Hot02_TwoAdd();
        ListNode node1 = func.createNode(new int[]{2, 4, 5});
        func.print(node1);
        ListNode node2 = func.createNode(new int[]{5, 6, 4});
        func.print(node2);

        ListNode node3 = func.addTwoNumbers(node1, node2);
        func.print(node3);

        ListNode node4 = func.createNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        func.print(node4);
        ListNode node5 = func.createNode(new int[]{9, 9, 9, 9});
        func.print(node5);

        ListNode node6 = func.addTwoNumbers(node4, node5);
        func.print(node6);
    }

    private ListNode createNode(int[] array) {
        ListNode node = new ListNode();
        ListNode p = node;
        for (int i : array) {
            p.next = new ListNode(i);
            p = p.next;
        }
        return node.next;
    }

    private void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
