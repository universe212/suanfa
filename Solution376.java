package suanfa;

/**
 * ClassName: Solution376
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/8 18:47
 * @Version 1.0
 */
public class Solution376 {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }
        int prevdiff = nums[1] - nums[0];
        int ret = prevdiff != 0 ? 2 : 1;
        for (int i = 2; i < n; i++) {
            int diff = nums[i] - nums[i - 1];
            if ((diff > 0 && prevdiff <= 0) || (diff < 0 && prevdiff >= 0)) {
                ret++;
                prevdiff = diff;
            }
        }
        return ret;
}}
