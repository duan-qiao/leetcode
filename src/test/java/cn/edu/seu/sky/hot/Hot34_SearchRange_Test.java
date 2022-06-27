package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

import java.util.Arrays;

/**
 * @author xiaotian on 2022/6/27
 */
public class Hot34_SearchRange_Test extends BaseTest {

    @Override
    public void test() {
        Hot34_SearchRange func = new Hot34_SearchRange();
        Assert.assertEquals("[3, 4]", Arrays.toString(func.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        Assert.assertEquals("[-1, -1]", Arrays.toString(func.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        Assert.assertEquals("[1, 5]", Arrays.toString(func.searchRange(new int[]{5, 8, 8, 8, 8, 8}, 8)));
        Assert.assertEquals("[-1, -1]", Arrays.toString(func.searchRange(new int[]{}, 0)));
    }
}
