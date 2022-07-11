package cn.edu.seu.sky.hot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author xiaotian on 2022/7/11
 * https://leetcode.cn/problems/merge-intervals/
 */
public class Hot56_MergeIntervals {

    public int[][] merge(int[][] intervals) {
        // 按左边节点排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(new int[]{intervals[0][0], intervals[0][1]});

        for (int i = 1; i < intervals.length; i++) {
            int left = intervals[i][0], right = intervals[i][1];
            int last = merged.get(merged.size() - 1)[1];

            // 没有重叠
            if (last < left) {
                merged.add(new int[]{left, right});
                continue;
            }
            // 有重叠
            merged.get(merged.size() - 1)[1] = Math.max(last, right);
        }
        return merged.toArray(new int[0][]);
    }
}
