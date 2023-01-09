package cn.edu.seu.sky.backtrack;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

import java.util.List;

/**
 * @author xiaotian on 2023/1/8
 */
public class Backtrack77_Combine_Test extends BaseTest {

    @Override
    public void test() {
        Backtrack77_Combine func = new Backtrack77_Combine();
        List<List<Integer>> list = func.combine(4, 2);
        // [[2,4],[3,4],[2,3],[1,2],[1,3],[1,4]]
        list.forEach(System.out::println);
        Assert.assertEquals(6, list.size());
    }
}
