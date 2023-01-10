package cn.edu.seu.sky.hot;

/**
 * @author xiaotian on 2023/1/10
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/?favorite=2cktkvj
 */
public class Hot121_MaxProfit {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        return profit;
    }
}
