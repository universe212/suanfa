package suanfa;

/**
 * ClassName: Solution55
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/11/9 19:26
 * @Version 1.0
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        //覆盖范围, 初始覆盖范围应该是0，因为下面的迭代是从下标0开始的
        int coverRange = 0;
        //在覆盖范围内更新最大的覆盖范围
        //i <= coverRange说明了覆盖范围到底能不能走
        for (int i = 0; i <= coverRange; i++) {
            coverRange = Math.max(coverRange, i + nums[i]);
            if (coverRange >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
