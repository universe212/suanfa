package suanfa;

import java.util.Stack;

/**
 * ClassName: Solution84
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/7 19:32
 * @Version 1.0
 */
public class Solution84 {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
       int[] newHeights = new int[heights.length + 2];
       newHeights[0] = 0;
       newHeights[newHeights.length-1] = 0;
       for(int index = 0; index < heights.length; index++){
           newHeights[index + 1] = heights[index];
       }
       int result = 0;
       stack.push(0);
       for(int i = 1; i < newHeights.length; i++){
           int topStack = stack.peek();
           if(heights[i] > heights[topStack]){
               stack.push(i);
           }
           else if(heights[i] == heights[topStack]){
               stack.pop();
               stack.push(i);
           }
           else {
               while (heights[i] < heights[topStack]){
                   int left = stack.peek();
                   stack.pop();
                   int mid = stack.peek();
                   int right = i;
                   int w = right - left - 1;
                   int h = heights[mid];
                   result = Math.max(result,w*h);
                   topStack = stack.peek();
               }
               stack.push(i);
           }
       }
return  result;

    }
}
