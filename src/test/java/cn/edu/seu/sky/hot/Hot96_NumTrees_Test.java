package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2023/1/9
 */
public class Hot96_NumTrees_Test extends BaseTest {

    @Override
    public void test() {
        Hot96_NumTrees func = new Hot96_NumTrees();
        Assert.assertEquals(5, func.numTrees(3));
        Assert.assertEquals(1, func.numTrees(1));
    }
}
