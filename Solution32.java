package suanfa;

/**
 * ClassName: Solution32
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/9 21:23
 * @Version 1.0
 */
public class Solution32 {
    public int longestValidParentheses(String s) {
     int max = 0;
     int[] dp = new int[s.length()];
     for(int i = 1; i < s.length(); i++){
         if(s.charAt(i) == ')'){
             if(s.charAt(i-1) == '('){
                 dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;//如果i>=2说明 dp[i-2]不会越界
             }
             else if(i - dp[i-1] > 0 && s.charAt(i-dp[i-1]-1) == '('){
                 // i - dp[i-1] 大于0 表示dp[i-1]前面还有字符不越左边界
                 //后半段  (（）) 表示 （）这个前面还有一个(
                 dp[i] = dp[i-1] + ((i - dp[i-1]) >= 2 ? dp[i-dp[i-1] - 2] : 0) + 2;
                 //p[i] = dp[i-1] + ((i - dp[i-1]) >= 3 ? dp[i-dp[i-1] - 2] : 0) + 2;
                 //  i - do[i-1] 大于等于2 说明前面可能有有效字符串 因为有效字符串最短为2
                 //这里大于2仅仅是 表示 ()()(())) i=7 7-2前面有两个，实际上应该大于3，因为已经有一个(与i=7匹配，前面大于3才能表名有两个
                 //关于dp[i-dp[i-1]-2]   ()()(()) i=7  7-2 - 2=3此时3正好是前一个末尾 思路
                 // +2表示当前又括号和前一个右括号 刚刚好两个
             }
             max = Math.max(max,dp[i]);
         }
     }
     return max;
    }
}
