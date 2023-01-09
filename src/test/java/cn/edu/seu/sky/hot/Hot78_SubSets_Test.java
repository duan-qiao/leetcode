package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

import java.util.List;

/**
 * @author xiaotian on 2023/1/5
 */
public class Hot78_SubSets_Test extends BaseTest {

    @Override
    public void test() {
        Hot78_SubSets func = new Hot78_SubSets();
        List<List<Integer>> subsets = func.subsets(new int[]{1, 2, 3});
        Assert.assertEquals(8, subsets.size());
        subsets.forEach(System.out::println);

        List<List<Integer>> subsets1 = func.subsets(new int[]{0});
        Assert.assertEquals(2, subsets1.size());
        subsets1.forEach(System.out::println);
    }
}
