package suanfa;

import java.util.Arrays;
import java.util.Stack;

/**
 * ClassName: Solution503
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/5 19:55
 * @Version 1.0
 */
public class Solution503 {
    public int[] nextGreaterElements(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return new int[]{-1};
        }
        int length = nums.length;
         int[] cnts = new int[length];
        Arrays.fill(cnts,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 2*length; i++){
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % length]){
                cnts[stack.peek()] = nums[i%length];
                stack.pop();
            }
            stack.push(i % length);
        }
        return cnts;

    }
}
