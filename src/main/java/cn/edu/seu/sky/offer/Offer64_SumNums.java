package cn.edu.seu.sky.offer;

/**
 * @author xiaotian
 *
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 */
public class Offer64_SumNums {

    public int sumNums(int n) {
        boolean x = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }

    public int sumNum(int n) {
        return (1 + n) * n / 2;
    }

    public static void main(String[] args) {
        Offer64_SumNums function = new Offer64_SumNums();
        System.out.println(function.sumNum(10));
        System.out.println(function.sumNums(10));
    }
}
