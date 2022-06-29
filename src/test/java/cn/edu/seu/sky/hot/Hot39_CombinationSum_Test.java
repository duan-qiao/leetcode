package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/6/28
 */
public class Hot39_CombinationSum_Test extends BaseTest {

    @Override
    public void test() {
        Hot39_CombinationSum func = new Hot39_CombinationSum();
        // [[2,2,3],[7]]
        Assert.assertEquals(2, func.combinationSum(new int[]{2, 3, 6, 7}, 7).size());
        // [[2,2,2,2],[2,3,3],[3,5]]
        Assert.assertEquals(3, func.combinationSum(new int[]{2, 3, 5}, 8).size());
        // []
        Assert.assertEquals(0, func.combinationSum(new int[]{2}, 1).size());
    }
}
