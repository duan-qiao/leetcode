package cn.edu.seu.sky.offer;

import java.util.Arrays;

/**
 * @author xiaotian
 * <p>
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */
public class Offer40_LeastNum {

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr, 0, k);
    }

    public static void main(String[] args) {
        Offer40_LeastNum function = new Offer40_LeastNum();
        System.out.println(Arrays.toString(function.getLeastNumbers(new int[]{3, 2, 1}, 2)));
        System.out.println(Arrays.toString(function.getLeastNumbers(new int[]{0, 1, 2, 1}, 1)));
        System.out.println(Arrays.toString(function.getLeastNumbers(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4)));
    }
}
