package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/6/17
 */
public class Hot20_Parentheses_Test extends BaseTest {

    @Override
    public void test() {
        Hot20_Parentheses func = new Hot20_Parentheses();
        Assert.assertTrue(func.isValid("()"));
        Assert.assertTrue(func.isValid("()[]{}"));
        Assert.assertFalse(func.isValid("(]"));
        Assert.assertFalse(func.isValid("([)]"));
        Assert.assertTrue(func.isValid("{[]}"));
        Assert.assertFalse(func.isValid("}"));
    }
}
