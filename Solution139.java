package suanfa;

import java.util.List;

/**
 * ClassName: Solution139
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/17 16:13
 * @Version 1.0
 */
public class Solution139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        //确定递推式：dp[j] = dp[j-i] && wordDict.contains(s.substring(i,j))
        //初始化
        dp[0] = true;

        for(int j = 1;j<=s.length();j++){
            for(int i = 0;i<=j;i++){
                if(dp[i]  && wordDict.contains(s.substring(i,j))){
                    dp[j] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
