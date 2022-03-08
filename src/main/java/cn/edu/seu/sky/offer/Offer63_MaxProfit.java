package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 * <p>
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 */
public class Offer63_MaxProfit {

    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices) {
            // 最低价格
            cost = Math.min(cost, price);
            // 最高收益
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }

    public static void main(String[] args) {
        Offer63_MaxProfit function = new Offer63_MaxProfit();
        System.out.println(function.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
