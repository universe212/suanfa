package suanfa;

/**
 * ClassName: Solution287
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/10 21:41
 * @Version 1.0
 */
public class Solution287 {
    public int findDuplicate(int[] nums) {
        int[] store = new int[nums.length];
        for (int num : nums) {
            if (store[num] == 1) {
                return num;
            }
            store[num] = 1;
        }
        return -1;
    }
}
