package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 *
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 */
public class Offer53_MissNum {

    public int missingNumber(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == mid) {
                start = mid + 1;
            } else if (nums[mid] > mid) {
                end = mid - 1;
            }
        }
        return end < 0 ? nums[start] - 1 : nums[end] + 1;
    }

    public static void main(String[] args) {
        Offer53_MissNum function = new Offer53_MissNum();

        int[] num1 = new int[]{0};
        System.out.println(function.missingNumber(num1));

        int[] num2 = new int[]{1};
        System.out.println(function.missingNumber(num2));

        int[] num3 = new int[]{0, 1, 2, 4};
        System.out.println(function.missingNumber(num3));

        int[] num4 = new int[]{0, 1, 2, 4, 5};
        System.out.println(function.missingNumber(num4));
    }
}
