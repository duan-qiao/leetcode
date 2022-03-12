package cn.edu.seu.sky.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaotian
 * <p>
 * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，
 * A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 */
public class Offer61_Straight {

    public boolean isStraight(int[] nums) {
        int max = -1, min = 14;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min < 5;
    }

    public static void main(String[] args) {
        Offer61_Straight function = new Offer61_Straight();
        System.out.println(function.isStraight(new int[]{1, 2, 3, 4, 5}));
        System.out.println(function.isStraight(new int[]{0, 0, 1, 2, 5}));
        System.out.println(function.isStraight(new int[]{11, 0, 9, 0, 0 }));
        System.out.println(function.isStraight(new int[]{2, 3, 0, 4, 6}));
        System.out.println(function.isStraight(new int[]{0, 0, 2, 2, 5}));
    }
}
