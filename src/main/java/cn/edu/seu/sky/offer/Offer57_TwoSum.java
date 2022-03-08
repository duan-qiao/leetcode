package cn.edu.seu.sky.offer;

import java.util.Arrays;

/**
 * @author xiaotian
 * <p>
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可
 */
public class Offer57_TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int diff = nums[i] + nums[j] - target;

            if (diff > 0) {
                j--;
            } else if (diff < 0) {
                i++;
            } else {
                return new int[]{nums[i], nums[j]};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Offer57_TwoSum function = new Offer57_TwoSum();
        System.out.println(Arrays.toString(function.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(function.twoSum(new int[]{10, 26, 30, 31, 47, 60}, 40)));
    }
}
