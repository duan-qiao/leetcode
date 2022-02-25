package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 * <p>
 * 统计一个数字在排序数组中出现的次数。
 */
public class Offer53_SearchNum {

    public int search1(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
            if (num > target) {
                break;
            }
        }
        return count;
    }

    public int search(int[] nums, int target) {
        int count = 0;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {

                int i = mid;
                while (i < nums.length && nums[i++] == target) {
                    count++;
                }
                while (--mid >= 0 && nums[mid] == target) {
                    count++;
                }
                break;
            }
        }
        return count;
    }

    public int search2(int[] nums, int target) {
        return helper(nums, target) - helper(nums, target - 1);
    }

    int helper(int[] nums, int tar) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] <= tar) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Offer53_SearchNum function = new Offer53_SearchNum();

        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(function.search(nums, 8));

        int[] nums1 = new int[]{5, 7, 7, 8, 8, 10};
        System.out.println(function.search(nums1, 6));

        int[] nums2 = new int[]{1};
        System.out.println(function.search(nums2, 1));

        int[] nums3 = new int[]{1, 1, 2};
        System.out.println(function.search(nums3, 1));
    }
}
