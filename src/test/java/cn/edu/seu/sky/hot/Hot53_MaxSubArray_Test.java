package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/7/1
 */
public class Hot53_MaxSubArray_Test extends BaseTest {

    @Override
    public void test() {
        Hot53_MaxSubArray func = new Hot53_MaxSubArray();
        Assert.assertEquals(6, func.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assert.assertEquals(23, func.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        Assert.assertEquals(-1, func.maxSubArray(new int[]{-1}));
    }
}
