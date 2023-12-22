package suanfa;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * ClassName: Solution128
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/19 19:26
 * @Version 1.0
 */
public class Solution128 {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int[] ints = new int[nums.length];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.push(nums[0]);
        int y = 1;
        int max = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == queue.peek() + 1){
                queue.push(nums[i]);
                y++;
            }
            else if(nums[i] == queue.peek()){
                queue.push(nums[i]);
            }
            else {
                queue.push(nums[i]);
                y = 1;
            }
            max = Math.max(y,max);
        }
        return max;
    }
}
