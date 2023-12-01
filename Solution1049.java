package suanfa;

/**
 * ClassName: Solution1049
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/1 16:40
 * @Version 1.0
 */
public class Solution1049 {
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;
        for (int i : stones) sum += i;
        int t = sum / 2;
        int[] f = new int[t + 1];
        for (int i = 0; i < n; i++) {
            for (int j = t; j >= stones[i]; j--) {
                f[j] = Math.max(f[j], f[j - stones[i]] + stones[i]);
            }
        }
        return Math.abs(sum - f[t] - f[t]);

    }
}
