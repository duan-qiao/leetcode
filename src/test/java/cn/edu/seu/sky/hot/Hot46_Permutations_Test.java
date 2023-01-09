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

        List<List<Integer>> list1 = func.permute(new int[]{0, 1});
        // [[0,1],[1,0]]
        list1.forEach(System.out::println);
        Assert.assertEquals(2, list1.size());

        List<List<Integer>> list2 = func.permute(new int[]{1});
        // [[1]]
        list2.forEach(System.out::println);
        Assert.assertEquals(1, list2.size());
    }
}
