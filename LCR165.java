package suanfa;

/**
 * ClassName: LCR165
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/21 20:02
 * @Version 1.0
 */
public class LCR165 {
    public int crackNumber(int ciphertext) {
        String s = String.valueOf(ciphertext);
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        //f(a-2)和f(a-1) 是两种不同方案  abc   和 a b 数量不一样方案肯定不一样
        //然后 加入一个 d 之后  a b c + d   和 a b + d 所以分开加
        for(int i  = 2; i <= s.length(); i++){
            String substring = s.substring(i - 2, i);
            dp[i] = substring.compareTo("10") >=0 && substring.compareTo("25") <= 0 ?dp[i-1]+ dp[i-2] :dp[i-1];
        }
        return dp[s.length()];
    }
}
