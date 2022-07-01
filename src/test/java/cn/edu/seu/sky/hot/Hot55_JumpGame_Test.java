package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/7/1
 */
public class Hot55_JumpGame_Test extends BaseTest {

    @Override
    public void test() {
        Hot55_JumpGame func = new Hot55_JumpGame();
        Assert.assertTrue(func.canJump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertFalse(func.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
