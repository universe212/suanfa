package suanfa;

/**
 * ClassName: Solution189
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/21 20:44
 * @Version 1.0
 */
public class Solution189 {
    public void rotate(int[] nums, int k) {
        int[] ints = new int[nums.length];
        int p = 0;
        k = k % nums.length;
        for (int j = 0; j < nums.length; j++){
            ints[j] = nums[j];//复制数组
        }
        for(int i = 0; i < nums.length - k; i++){
            nums[i+k] = ints[i]; //先把原数组前面的处理了
        }
        int  remain = nums.length - k; //表示 该从哪个开始
        for(int j = remain; j < nums.length;j++ ){
            nums[p] = ints[j];
            p++;
        }

    }
}
