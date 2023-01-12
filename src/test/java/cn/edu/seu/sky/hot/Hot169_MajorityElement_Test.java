package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2023/1/12
 */
public class Hot169_MajorityElement_Test extends BaseTest {

    @Override
    public void test() {
        Hot169_MajorityElement func = new Hot169_MajorityElement();
        Assert.assertEquals(2, func.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        Assert.assertEquals(3, func.majorityElement(new int[]{3, 3, 4}));
        Assert.assertEquals(3, func.majorityElement(new int[]{3, 2, 3}));
        Assert.assertEquals(7, func.majorityElement(new int[]{8, 8, 7, 7, 7}));
    }
}
