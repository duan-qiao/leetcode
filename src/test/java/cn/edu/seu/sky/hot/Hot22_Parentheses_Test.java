package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/6/18
 */
public class Hot22_Parentheses_Test extends BaseTest {

    @Override
    public void test() {
        Hot22_Parentheses func = new Hot22_Parentheses();

        // ()
        Assert.assertEquals(1, func.generateParenthesis(1).size());

        // (()), ()()
        Assert.assertEquals(2, func.generateParenthesis(2).size());

        // ((())), (()()), (())(), ()(()), ()()()
        Assert.assertEquals(5, func.generateParenthesis(3).size());

        // (((()))), ((()())), ((())()), ((()))(), (()(())), (()()()), (()())(),
        // (())(()), (())()(), ()((())), ()(()()), ()(())(), ()()(()), ()()()()
        Assert.assertEquals(14, func.generateParenthesis(4).size());

        // ((((())))), (((()()))), (((())())), (((()))()), (((())))(), ((()(()))),
        // ((()()())), ((()())()), ((()()))(), ((())(())), ((())()()), ((())())(),
        // ((()))(()), ((()))()(), (()((()))), (()(()())), (()(())()), (()(()))(),
        // (()()(())), (()()()()), (()()())(), (()())(()), (()())()(), (())((())),
        // (())(()()), (())(())(), (())()(()), (())()()(), ()(((()))), ()((()())),
        // ()((())()), ()((()))(), ()(()(())), ()(()()()), ()(()())(), ()(())(()),
        // ()(())()(), ()()((())), ()()(()()), ()()(())(), ()()()(()), ()()()()()
        Assert.assertEquals(42, func.generateParenthesis(5).size());
    }
}
