package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

import java.util.Arrays;

/**
 * @author xiaotian on 2022/7/11
 */
public class Hot56_MergeIntervals_Test extends BaseTest {

    @Override
    public void test() {
        Hot56_MergeIntervals func = new Hot56_MergeIntervals();

        int[][] array1 = func.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        Assert.assertEquals("[[1, 6], [8, 10], [15, 18]]", Arrays.deepToString(array1));

        int[][] array2 = func.merge(new int[][]{{1, 4}, {4, 5}});
        Assert.assertEquals("[[1, 5]]", Arrays.deepToString(array2));
    }
}
