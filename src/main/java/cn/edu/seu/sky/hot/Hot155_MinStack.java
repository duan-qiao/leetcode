package cn.edu.seu.sky.hot;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author xiaotian on 2023/1/19
 * https://leetcode.cn/problems/min-stack/?favorite=2cktkvj
 */
public class Hot155_MinStack {

    private final Deque<Long> MIN_STACK;
    private long MIN;

    public Hot155_MinStack() {
        MIN_STACK = new LinkedList<>();
    }

    public void push(int val) {
        if (MIN_STACK.isEmpty()) {
            MIN = val;
            MIN_STACK.push(0L);
            return;
        }
        MIN_STACK.push(val - MIN);
        MIN = Math.min(MIN, val);
    }

    public void pop() {
        Long num = MIN_STACK.pop();
        if (num < 0) {
            MIN -= num;
        }
    }

    public int top() {
        if (MIN_STACK.isEmpty()) {
            return 0;
        }
        Long num = MIN_STACK.peek();
        if (num <= 0) {
            return (int) MIN;
        }
        return (int) (num + MIN);
    }

    public int getMin() {
        return (int) MIN;
    }
}
