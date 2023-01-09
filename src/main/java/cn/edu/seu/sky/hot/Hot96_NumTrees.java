package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2023/1/9
 * https://leetcode.cn/problems/unique-binary-search-trees/?favorite=2cktkvj
 */
public class Hot96_NumTrees {

    public int numTrees(int n) {
        long c = 1;
        for (int i = 0; i < n; i++) {
            c = c * 2 * (2L * i + 1) / (i + 2);
        }
        return (int) c;
    }
}
