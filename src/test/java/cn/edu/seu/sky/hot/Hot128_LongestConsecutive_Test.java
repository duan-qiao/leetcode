package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2023/1/10
 */
public class Hot128_LongestConsecutive_Test extends BaseTest {

    @Override
    public void test() {
        Hot128_LongestConsecutive func = new Hot128_LongestConsecutive();
//        Assert.assertEquals(4, func.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        Assert.assertEquals(9, func.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}
