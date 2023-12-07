package suanfa;

import java.util.Stack;

/**
 * ClassName: Solution42
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/5 20:24
 * @Version 1.0
 */
public class Solution42 {
    public int trap(int[] height) {
        int size = height.length;
        if (size <= 2) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);

        int sum = 0;
        for (int index = 1; index < size; index++){
            int topStack = stack.peek();
            if(height[topStack] > height[index]){
            stack.push(index);
            }
            else if(height[topStack] == height[index]){
                stack.pop();
                stack.push(index);
            }
            else {
                int max  = height[index];
                while (!stack.isEmpty() && max > height[stack.peek()]){
                    int mid = stack.pop();
                    if(!stack.isEmpty()){
                        int left = stack.peek();
                      int h =   Math.min(max,height[left]) - height[mid];
                      int w =   index - left - 1;
                      int hold = h*w;
                      if(hold>0)sum += hold;
                        topStack = stack.peek();
                    }
                }
                stack.push(index);
            }
        }
        return sum;
        }
}
