package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

import java.util.List;

/**
 * @author xiaotian on 2022/6/28
 */
public class Hot46_Permutations_Test extends BaseTest {

    @Override
    public void test() {
        Hot46_Permutations func = new Hot46_Permutations();
        List<List<Integer>> list = func.permute(new int[]{1, 2, 3});
        // [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
        list.forEach(System.out::println);
        Assert.assertEquals(6, list.size());
    }
}
