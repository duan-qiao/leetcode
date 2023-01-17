package cn.edu.seu.sky.sort;

/**
 * @author xiaotian on 2023/1/13
 */
public class Sort_Bubble extends Sort_Base {

    @Override
    public void sort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j + 1] < arrays[j]) {
                    int temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }
}
