package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 */
public class Offer16_MyPow {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == -1) {
            return 1 / x;
        }
        // 偶数
        double half = myPow(x, n / 2);
        // 奇数
        double mod = myPow(x, n % 2);
        // 结果
        return half * half * mod;
    }

    public static void main(String[] args) {
        Offer16_MyPow function = new Offer16_MyPow();
        System.out.println(function.myPow(2, 10));
        System.out.println(Math.pow(2, 10));
    }
}
