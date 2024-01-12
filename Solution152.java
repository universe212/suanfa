package suanfa;

/**
 * ClassName: Solution152
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/9 20:24
 * @Version 1.0
 */
public class Solution152 {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] maxF = new int[length];
        int[] minF = new int[length];
        System.arraycopy(nums, 0, maxF, 0, length);//先把数组拷贝了
        System.arraycopy(nums, 0, minF, 0, length);
        for (int i = 1; i < length; ++i) {
            //之前的最大乘积乘以当前元素、当前元素本身、之前的最小乘积乘以当前元素中的最大值。
            maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]));
            //之前的最小乘积乘以当前元素、当前元素本身、之前的最大乘积乘以当前元素中的最大值。
            minF[i] = Math.min(minF[i - 1] * nums[i], Math.min(nums[i], maxF[i - 1] * nums[i]));
        } //保证了是连续状态
        int ans = maxF[0];
        for (int i = 1; i < length; ++i) {
            ans = Math.max(ans, maxF[i]);
        }
        return ans;
    }
}
