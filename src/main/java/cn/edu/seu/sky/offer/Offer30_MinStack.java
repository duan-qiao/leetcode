package cn.edu.seu.sky.offer;

import java.util.LinkedList;

/**
 * @author xiaotian
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 */
public class Offer30_MinStack {

    static class MinStack {

        public LinkedList<Node> stack;

        public MinStack() {
            stack = new LinkedList<>();
        }

        public void push(int x) {
            if (stack.isEmpty()) {
                stack.addFirst(new Node(x, x));
                return;
            }
            stack.addFirst(new Node(x, Math.min(x, stack.getFirst().min)));
        }

        public void pop() {
            stack.remove();
        }

        public int top() {
            return stack.isEmpty() ? 0 : stack.getFirst().value;
        }

        public int min() {
            return stack.isEmpty() ? 0 : stack.getFirst().min;
        }

        static class Node {
            Integer value;
            Integer min;

            Node(Integer value, Integer min) {
                this.value = value;
                this.min = min;
            }
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
    }
}
