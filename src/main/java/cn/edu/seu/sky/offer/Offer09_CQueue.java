package cn.edu.seu.sky.offer;

import java.util.Stack;

/**
 * @author xiaotian
 * <p>
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead，
 * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 */
public class Offer09_CQueue {

    class CQueue {

        Stack<Integer> s1;
        Stack<Integer> s2;

        public CQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void appendTail(int value) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            s2.push(value);
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        public int deleteHead() {
            if (s2.isEmpty()) {
                return -1;
            }
            return s2.pop();
        }
    }

    class CQueue2 {

        Stack<Integer> s1;
        Stack<Integer> s2;

        public CQueue2() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void appendTail(int val) {
            s1.push(val);
        }

        public int deleteHead() {
            if (!s2.isEmpty()) {
                return s2.pop();
            }
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s2.pop());
            }
            return s2.pop();
        }
    }
}
