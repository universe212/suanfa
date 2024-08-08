package suanfa;

import java.util.List;

/**
 * ClassName: Solution139
 * Package: suanfa
 * Description
 * 2
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

        for(int j = 1;j<=s.length();j++){//j是背包 扩展的是 s的长度
            for(int i = 0;i<=j;i++){
                if(dp[i]  && wordDict.contains(s.substring(i,j))){
                    //这个条件其实就是先第一个单词 然后第二个单词按照顺序
                    //因为只有dp[i]成立才能进去
                    dp[j] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
