package cn.edu.seu.sky.offer;

import cn.edu.seu.sky.BaseTest;
import cn.edu.seu.sky.common.TreeNode;
import org.junit.Assert;

/**
 * @author xiaotian on 2022/7/7
 */
public class Offer27_MirrorTree_Test extends BaseTest {

    @Override
    public void test() {
        Offer27_MirrorTree func = new Offer27_MirrorTree();
        TreeNode node = TreeNode.create(4, 2, 7, 1, 3, 6, 9).levelOderTraversal();
        TreeNode mirrorTree = func.mirrorTree(node).levelOderTraversal();
        Assert.assertEquals("[4, 7, 2, 9, 6, 3, 1]", mirrorTree.levelOderPath());
    }
}
