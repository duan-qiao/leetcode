package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2023/1/16
 * https://leetcode.cn/problems/hamming-distance/?favorite=2cktkvj
 */
public class Hot461_HammingDistance {

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
