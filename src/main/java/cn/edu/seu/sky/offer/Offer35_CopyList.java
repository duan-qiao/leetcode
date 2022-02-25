package cn.edu.seu.sky.offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaotian
 *
 * 请实现 copyRandomList 函数，复制一个复杂链表。
 * 在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，
 * 还有一个 random 指针指向链表中的任意节点或者 null。
 */
public class Offer35_CopyList {

    public Node copyRandomList1(Node head) {
        if (head == null) {
            return head;
        }
        //map中存的是(原节点，拷贝节点)的一个映射
        Map<Node, Node> map = new HashMap<>();
        for (Node cur = head; cur != null; cur = cur.next) {
            map.put(cur, new Node(cur.val));
        }
        //将拷贝的新的节点组织成一个链表
        for (Node cur = head; cur != null; cur = cur.next) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
        }
        return map.get(head);
    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // 将拷贝节点放到原节点后面，例如1->2->3这样的链表就变成了这样1->1'->2->2'->3->3'
        for (Node node = head; node != null; node = node.next.next) {
            Node copy = new Node(node.val);
            copy.next = node.next;
            node.next = copy;
        }
        // 把拷贝节点的random指针安排上
        for (Node node = head; node != null; node = node.next.next) {
            if (node.random != null) {
                node.next.random = node.random.next;
            }
        }
        // 分离拷贝节点和原节点，变成1->2->3和1'->2'->3'两个链表，后者就是答案
        Node node = head;
        Node newHead = head.next;
        Node temp;
        while (node.next != null) {
            temp = node.next;
            node.next = temp.next;
            node = temp;
        }
        return newHead;
    }

    public void print(Node head) {
        List<List<Integer>> list = new ArrayList<>();
        while (head != null) {
            List<Integer> l = new ArrayList<>();
            l.add(head.val);
            l.add(head.random.val);
            list.add(l);
            head = head.next;
        }
        System.out.println(list);
    }

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.random = node2;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;

        Offer35_CopyList function = new Offer35_CopyList();
        function.print(node1);


    }
}
