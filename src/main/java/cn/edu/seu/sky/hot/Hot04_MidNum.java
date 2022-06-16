package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2022/4/12
 * https://leetcode.cn/problems/median-of-two-sorted-arrays/
 */
public class Hot04_MidNum {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int x = 0, y = 0;

        for (int i = 0, m = 0, n = 0; i <= length / 2; i++) {
            y = x;

            if (m == nums1.length) {
                x = nums2[n++];
                continue;
            }
            if (n == nums2.length) {
                x = nums1[m++];
                continue;
            }
            x = nums1[m] > nums2[n] ? nums2[n++] : nums1[m++];
        }
        return length % 2 == 1 ? x : (x + y) / 2.0;
    }

    public static void main(String[] args) {
        Hot04_MidNum func = new Hot04_MidNum();
        System.out.println(func.findMedianSortedArrays(new int[]{1, 3, 5, 7, 9}, new int[]{2, 4, 6, 8}));
        System.out.println(func.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
