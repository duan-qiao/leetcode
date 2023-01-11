package cn.edu.seu.sky.hot;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author xiaotian on 2023/1/11
 * https://leetcode.cn/problems/word-break/?favorite=2cktkvj
 */
public class Hot139_WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
