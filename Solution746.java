package suanfa;

/**
 * ClassName: Solution70
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/27 17:07
 * @Version 1.0
 */
public class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int pre = 0;
        int curr = 0;
        for (int i = 2; i <= n; i++) {
            int next = Math.min(curr + cost[i - 1], pre + cost[i - 2]);
            pre = curr;
            curr = next;
        }
        return curr;

    }
}
