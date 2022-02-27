package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 * <p>
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * <p>
 * 给你一个可能存在重复元素值的数组numbers，它原来是一个升序排列的数组，并按上述情形进行了一次旋转。
 * 请返回旋转数组的最小元素。例如，数组[3,4,5,1,2] 为 [1,2,3,4,5] 的一次旋转，该数组的最小值为1。
 */
public class Offer11_MinArray {

    public int minArray1(int[] numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                return num;
            }
        }
        return min;
    }

    public int minArray(int[] numbers) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (numbers[mid] > numbers[end]) {
                start = mid + 1;
            } else if (numbers[mid] < numbers[end]) {
                end = mid;
            } else {
                end--;
            }
        }
        return numbers[start];
    }

    public static void main(String[] args) {
        Offer11_MinArray function = new Offer11_MinArray();
        System.out.println(function.minArray(new int[]{3, 4, 5, 1, 2}));
        System.out.println(function.minArray(new int[]{2, 2, 2, 0, 1}));
        System.out.println(function.minArray(new int[]{1, 3, 5}));
        System.out.println(function.minArray(new int[]{3, 1, 1}));
        System.out.println(function.minArray(new int[]{7, 0, 1, 1, 1, 1, 1, 3, 4}));
    }
}
