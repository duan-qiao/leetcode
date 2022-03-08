package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 */
public class Offer10_Fibonacci {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int x = 0;
        int y = 1;
        while (--n > 0) {
            y = x + y;
            x = y - x;
            y %= 1000000007;
        }
        return y;
    }

    public static void main(String[] args) {
        Offer10_Fibonacci function = new Offer10_Fibonacci();
        for (int i = 0; i < 20; i++) {
            System.out.println(function.fib(i));
        }
    }
}
