package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;

/**
 * @author xiaotian on 2023/1/9
 */
public class Hot114_Flatten_Test extends BaseTest {

    @Override
    public void test() {
        Hot114_Flatten func = new Hot114_Flatten();
        func.flatten(TreeNode.create(1, 2, 5, 3, 4, null, 6));
        // [1,null,2,null,3,null,4,null,5,null,6]
    }
}
