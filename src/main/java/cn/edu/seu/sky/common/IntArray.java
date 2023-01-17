package cn.edu.seu.sky.common;

import java.util.Arrays;

/**
 * @author xiaotian on 2023/1/16
 */
public class IntArray {

    public static int[] create(int... array) {
        return array;
    }

    public static int[] copy(int[] array) {
        return Arrays.copyOf(array, array.length);
    }

    public static String print(int[] array) {
        return Arrays.toString(array);
    }
}
