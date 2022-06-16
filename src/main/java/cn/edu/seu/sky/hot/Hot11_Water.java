package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2022/6/15
 * https://leetcode.cn/problems/container-with-most-water/
 */
public class Hot11_Water {

    public int maxArea(int[] height) {
        int max = 0, i = 0, j = height.length - 1;
        while (i < j) {
            int x = j - i;
            int y = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, x * y);
        }
        return max;
    }

    public static void main(String[] args) {
        Hot11_Water func = new Hot11_Water();
        System.out.println(func.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(func.maxArea(new int[]{1, 1}));
        System.out.println(func.maxArea(new int[]{1, 2, 4, 3}));
    }
}
