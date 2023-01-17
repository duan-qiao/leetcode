package cn.edu.seu.sky.sort;

import cn.edu.seu.sky.BaseTest;

/**
 * @author xiaotian on 2023/1/13
 */
public class Sort_Test extends BaseTest {

    @Override
    public void test() {
        int[] data = new int[]{-2, 45, 0, -2, 11, -9};
        // API
        new Sort_Base().sortView(data);
        // 冒泡排序
        new Sort_Bubble().sortView(data);
        // 选择排序
        new Sort_Selection().sortView(data);
        // 插入排序
        new Sort_Insertion().sortView(data);
        // 希尔排序
        new Sort_Shell().sortView(data);
        // 归并排序
        new Sort_Merge().sortView(data);
        // 快速排序
        new Sort_Quick().sortView(data);
        // 堆排序
        new Sort_Heap().sortView(data);
        // 计数排序
        new Sort_Counting().sortView(data);
        // 桶排序
        new Sort_Bucket().sortView(data);
        // 基数排序
        new Sort_Radix().sortView(data);
    }
}
