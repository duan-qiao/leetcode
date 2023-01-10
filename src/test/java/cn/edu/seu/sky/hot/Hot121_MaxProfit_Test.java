package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2023/1/10
 */
public class Hot121_MaxProfit_Test extends BaseTest {

    @Override
    public void test() {
        Hot121_MaxProfit func = new Hot121_MaxProfit();
        Assert.assertEquals(5, func.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(8, func.maxProfit(new int[]{2, 10, 1, 3, 6, 4}));
        Assert.assertEquals(0, func.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
