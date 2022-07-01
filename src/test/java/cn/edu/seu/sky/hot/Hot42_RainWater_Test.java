package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/6/29
 */
public class Hot42_RainWater_Test extends BaseTest {

    @Override
    public void test() {
        Hot42_RainWater func = new Hot42_RainWater();
        Assert.assertEquals(6, func.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        Assert.assertEquals(9, func.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
