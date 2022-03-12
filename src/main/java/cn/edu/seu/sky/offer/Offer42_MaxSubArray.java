package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 * <p>
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 */
public class Offer42_MaxSubArray {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int former = 0;
        for (int num : nums) {
            num += Math.max(former, 0);
            max = Math.max(max, num);
            former = num;
        }
        return max;
    }

    public static void main(String[] args) {
        Offer42_MaxSubArray function = new Offer42_MaxSubArray();
        System.out.println(function.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
