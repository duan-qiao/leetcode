package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;

import java.util.Arrays;

/**
 * @author xiaotian on 2022/7/1
 * https://leetcode.cn/problems/rotate-image/
 */
public class Hot48_RotateImage_Test extends BaseTest {


    @Override
    public void test() {
        Hot48_RotateImage func = new Hot48_RotateImage();

        int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        func.rotate(matrix1);
        Assert.assertEquals("[7, 4, 1]", Arrays.toString(matrix1[0]));
        Assert.assertEquals("[8, 5, 2]", Arrays.toString(matrix1[1]));
        Assert.assertEquals("[9, 6, 3]", Arrays.toString(matrix1[2]));

        int[][] matrix2 = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        func.rotate(matrix2);
        Assert.assertEquals("[15, 13, 2, 5]", Arrays.toString(matrix2[0]));
        Assert.assertEquals("[14, 3, 4, 1]", Arrays.toString(matrix2[1]));
        Assert.assertEquals("[12, 6, 8, 9]", Arrays.toString(matrix2[2]));
        Assert.assertEquals("[16, 7, 10, 11]", Arrays.toString(matrix2[3]));
    }
}
