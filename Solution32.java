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
public class Solution32 { //求的是连续
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int max = 0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == ')'){// 两种情况 一种 前面还有 一种是第一个 前面没有
                //前面有    （）（）
                if(s.charAt(i-1) == '('){
                    dp[i] = (i >= 3 ?dp[i-2]:0)  + 2;
                }
                else {

                    //（）（（（））例子
                    if(  i-dp[i-1] >= 1 &&   s.charAt(i-dp[i-1]-1) == '(' ){
                        dp[i] = dp[i-1] + (i - dp[i-1] >= 3 ? dp[i-dp[i-1]  - 2] : 0) + 2;
//  i-dp[i-1]表示 至少保证前面还有一个符号 没有符号肯定 没必要了 其次要想 能连续有加 前面那个符号还得是(
                        //i-dp[i-1] -1 >=2 说明 (()) 这个前面 还有连续的符号 符号 至少为2个 所以 大于等于 2
                        //在这种情况下 就加上 dp[i-dp[i-1]-2]
                        //注意这里面 i - dp[i-1] - 1表示 坐标在  (())这个坐标在 (上面
                        // i - dp[i-1]表示 坐标在(())在 第二个(
                    }

                }

            }
            max = Math.max(dp[i],max);
        }
        return  max;
    }
}
