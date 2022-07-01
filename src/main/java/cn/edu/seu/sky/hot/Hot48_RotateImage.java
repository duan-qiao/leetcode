package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2022/7/1
 * https://leetcode.cn/problems/rotate-image/
 */
public class Hot48_RotateImage {

    public void rotate(int[][] matrix) {
        // 斜对角翻转
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 左右翻转
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - j - 1];
                matrix[i][matrix[i].length - j - 1] = temp;
            }
        }
    }
}
