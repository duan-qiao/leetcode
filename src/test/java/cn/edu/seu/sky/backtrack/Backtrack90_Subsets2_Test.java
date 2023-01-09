package cn.edu.seu.sky.backtrack;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

import java.util.List;

/**
 * @author xiaotian on 2023/1/9
 */
public class Backtrack90_Subsets2_Test extends BaseTest {

    @Override
    public void test() {
        Backtrack90_Subsets2 func = new Backtrack90_Subsets2();
        List<List<Integer>> list = func.subsetsWithDup(new int[]{1, 2, 2});
        // [[],[1],[1,2],[1,2,2],[2],[2,2]]
        list.forEach(System.out::println);
        Assert.assertEquals(6, list.size());

        List<List<Integer>> list1 = func.subsetsWithDup(new int[]{0});
        // [[],[0]]
        list1.forEach(System.out::println);
        Assert.assertEquals(2, list1.size());
    }
}
