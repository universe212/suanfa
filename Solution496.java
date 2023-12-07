package suanfa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * ClassName: Solution496
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/1 21:44
 * @Version 1.0
 */
public class Solution496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] cnts = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> yh = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            yh.put(nums1[i],i);
        }
        Arrays.fill(cnts,-1);
        for(int i = 0; i < nums2.length; i++){
            while (!stack.isEmpty() && nums2[stack.peek()] < nums2[i]){
                 int pre = nums2[stack.pop()];
                if(yh.containsKey(pre)){
                    cnts[yh.get(pre)] = nums2[i];
                }
            }
            stack.push(i);
        }
        return cnts;
    }
}
