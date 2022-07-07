package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/7/1
 */
public class Hot64_MinPath_Test extends BaseTest {

    @Override
    public void test() {
        Hot64_MinPath func = new Hot64_MinPath();
        Assert.assertEquals(7, func.minPathSum(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        Assert.assertEquals(12, func.minPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
