package cn.edu.seu.sky.sort;

import java.util.Arrays;

/**
 * @author xiaotian on 2023/1/16
 */
public class Sort_Base implements Sort {

    public void sortView(int[] arrays) {
        int[] intArray = Arrays.copyOf(arrays, arrays.length);
        sort(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}
