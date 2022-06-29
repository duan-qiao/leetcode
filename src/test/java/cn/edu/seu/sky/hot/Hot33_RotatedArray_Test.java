package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/6/27
 */
public class Hot33_RotatedArray_Test extends BaseTest {

    @Override
    public void test() {
        Hot33_RotatedArray func = new Hot33_RotatedArray();
        Assert.assertEquals(4, func.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        Assert.assertEquals(-1, func.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        Assert.assertEquals(-1, func.search(new int[]{1}, 0));
    }
}
