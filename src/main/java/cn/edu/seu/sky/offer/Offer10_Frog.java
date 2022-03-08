package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class Offer10_Frog {
    // n = 0, () 1
    // n = 1, (1) 1
    // n = 2, (11、2) 2
    // n = 3, (111、12、21) 3
    // n = 4, (1111、121、112、211、22) 5

    public int numWays(int n) {
        if (n <= 1) {
            return 1;
        }
        int x = 1;
        int y = 1;
        while (--n > 0) {
            y = x + y;
            x = y - x;
            y %= 1000000007;
        }
        return y;
    }

    public static void main(String[] args) {
        Offer10_Frog function = new Offer10_Frog();
        System.out.println(function.numWays(0));
        System.out.println(function.numWays(2));
        System.out.println(function.numWays(7));
    }
}
