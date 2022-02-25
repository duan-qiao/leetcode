package cn.edu.seu.sky.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaotian
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 */
public class Offer03_RepeatNum {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public int findRepeatNumber1(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums) {
            arr[num]++;
            if (arr[num] > 1) {
                return num;
            }
        }
        return -1;
    }
}
