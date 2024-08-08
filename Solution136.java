package suanfa;

/**
 * ClassName: Solution136
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/10 20:13
 * @Version 1.0
 */
public class Solution136 {
    public int singleNumber(int[] nums){
        //同为0，异为1
        int single = 0;
        for (int num : nums) {
            single ^= num; //异或标志
        }
        return single;

    }
}
