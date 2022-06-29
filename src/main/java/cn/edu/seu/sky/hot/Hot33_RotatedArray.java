package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2022/6/27
 * https://leetcode.cn/problems/search-in-rotated-sorted-array/
 */
public class Hot33_RotatedArray {

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                // 左半边有序
                if (nums[l] <= target && target < nums[mid]) {
                    // target的值在左半边
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                // 右半边有序
                if (nums[mid] < target && target <= nums[r]) {
                    // target的值在右半边
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
