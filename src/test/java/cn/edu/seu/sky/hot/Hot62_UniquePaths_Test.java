package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/7/11
 */
public class Hot62_UniquePaths_Test extends BaseTest {

    @Override
    public void test() {
        Hot62_UniquePaths func = new Hot62_UniquePaths();
        Assert.assertEquals(28, func.uniquePaths(3, 7));
        Assert.assertEquals(3, func.uniquePaths(3, 2));
        Assert.assertEquals(28, func.uniquePaths(7, 3));
        Assert.assertEquals(6, func.uniquePaths(3, 3));
    }
}
