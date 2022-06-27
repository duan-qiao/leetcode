package cn.edu.seu.sky.hot;

import cn.edu.seu.sky.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author xiaotian on 2022/6/27
 */
public class Hot32_NextPermutation_Test extends BaseTest {

    @Test
    public void test() {
        Hot32_NextPermutation func = new Hot32_NextPermutation();

        int[] arr1 = new int[]{1, 2, 3};
        func.nextPermutation(arr1);
        Assert.assertEquals("[1, 3, 2]", Arrays.toString(arr1));

        int[] arr2 = new int[]{3, 2, 1};
        func.nextPermutation(arr2);
        Assert.assertEquals("[1, 2, 3]", Arrays.toString(arr2));

        int[] arr3 = new int[]{1, 1, 5};
        func.nextPermutation(arr3);
        Assert.assertEquals("[1, 5, 1]", Arrays.toString(arr3));

        int[] arr4 = new int[]{1, 2, 3, 8, 5, 7, 6, 4};
        func.nextPermutation(arr4);
        Assert.assertEquals("[1, 2, 3, 8, 6, 4, 5, 7]", Arrays.toString(arr4));
    }
}
