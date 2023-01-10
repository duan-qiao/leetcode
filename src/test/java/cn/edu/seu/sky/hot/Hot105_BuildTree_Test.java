package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;

/**
 * @author xiaotian on 2023/1/9
 */
public class Hot105_BuildTree_Test extends BaseTest {

    @Override
    public void test() {
        Hot105_BuildTree func = new Hot105_BuildTree();
        TreeNode treeNode = func.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        // [3,9,20,null,null,15,7]
        treeNode.levelOderTraversal();
    }
}
