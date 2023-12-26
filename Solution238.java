package suanfa;

/**
 * ClassName: Solution238
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/22 19:35
 * @Version 1.0
 */
public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
       int l = nums.length;
        int[] ints = new int[nums.length];
        ints[0] = 1;
        for(int i = 1; i < l; i++){
            ints[i] = nums[i-1]*ints[i-1];//统计i的左边之和
        }
        int R = 1; //表示右边之和
        int[] result = new int[l];
        for (int j = l - 1; j >= 0; j--){
          result[j] = ints[j] * R;
          R *=nums[j];
        }
        return result;
    }
}
