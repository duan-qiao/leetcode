package cn.edu.seu.sky.sort;

import java.util.Arrays;

/**
 * @author xiaotian on 2023/1/13
 * https://blog.csdn.net/Rita_zf/article/details/123843920
 */
public interface Sort {
    default void sort(int[] arrays) {
        Arrays.sort(arrays);
    }
}
