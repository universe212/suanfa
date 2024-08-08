package suanfa;

import java.util.Arrays;

/**
 * ClassName: LCR185
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/25 21:05
 * @Version 1.0
 */
public class LCR185 {
    public double[] statisticsProbability(int num) {
        double[] dp = new double[6];
        //dp表示出现 几的概率 dp[0]表示出现1的概率 一次类推
        Arrays.fill(dp,1.0/6.0);

        for(int i = 2; i <= num; i++){
            //i代表的是几个筛子 肯定是从二哥筛子开始啊
            //temp代表出现这种情况有多少可能 最大 6*i 最小 i
            double[] temp = new double[(5*i)+1];
            //j =  2 3 4 5 6 7 8 910 11 12
            for(int j = 0; j < dp.length; j++){
                //遍历之前得数组 之前数组的每种可能乘以下次遇到的 0不是代表0
                for(int k = 0; k < 6; k++){
                    temp[j+k] += dp[j] * (1.0/6.0);//是因为可能有重复的值
                }
            }
            dp = temp;

        }

        return  dp;
    }
}
