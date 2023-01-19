package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2023/1/19
 */
public class Hot155_MinStack_Test extends BaseTest {

    @Override
    public void test() {
        Hot155_MinStack func1 = new Hot155_MinStack();
        func1.push(-2);
        func1.push(0);
        func1.push(-1);
        Assert.assertEquals(-2, func1.getMin());
        Assert.assertEquals(-1, func1.top());
        func1.pop();
        Assert.assertEquals(-2, func1.getMin());

        Hot155_MinStack func = new Hot155_MinStack();
        func.push(2147483646);
        func.push(2147483646);
        func.push(2147483647);
        Assert.assertEquals(2147483647, func.top());
        func.pop();
        Assert.assertEquals(2147483646, func.getMin());
        func.pop();
        Assert.assertEquals(2147483646, func.getMin());
        func.pop();
        func.push(2147483647);
        Assert.assertEquals(2147483647, func.top());
        Assert.assertEquals(2147483647, func.getMin());
        func.push(-2147483648);
        Assert.assertEquals(-2147483648, func.top());
        Assert.assertEquals(-2147483648, func.getMin());
        func.pop();
        Assert.assertEquals(2147483647, func.getMin());
    }
}
