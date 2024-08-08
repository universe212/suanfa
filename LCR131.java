package suanfa;

/**
 * ClassName: LCR131
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/3/18 20:05
 * @Version 1.0
 */
public class LCR131 {
    public int cuttingBamboo(int bamboo_len) {
        int[] dp = new int[bamboo_len + 1];
        for(int i = 2; i <= bamboo_len; i++){
            int max = 0;
            for(int j = 1; j < i;j++){
                max = Math.max(max,Math.max(j*(i-j),j*dp[i-j]));
                //情况是分别拆成 2两个数
                // 后面这个是拆分2个以上情况
                 }
            dp[i] = max;
        }
        return dp[bamboo_len];
    }
}
