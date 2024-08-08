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
    public static void main(String[] args) {
        int[] ints = new int[3];
        ints[0] = 1;
        ints[1] = 6;
        ints[2] = 5;
        int i = largestRectangleArea(ints);
        System.out.println(i);
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();//存角标的
       int[] newHeights = new int[heights.length + 2];//存数值的
       newHeights[0] = 0;
       newHeights[newHeights.length-1] = 0;//前端和末端为0
       for(int index = 0; index < heights.length; index++){
           newHeights[index + 1] = heights[index];//给new赋值
       }

        heights = newHeights;
       int result = 0;
       stack.push(0);//初始化为0
       for(int i = 1; i < newHeights.length; i++){
           int topStack = stack.peek();//栈的顶部
           if(heights[i] > heights[topStack]){
               stack.push(i);//如果heights的当前值大于 栈顶角标那个值，入栈角标
           }
           else if(heights[i] == heights[topStack]){
               stack.pop();//相等的话角标一进一出
               stack.push(i);
           }
           else {
               while (heights[i] < heights[topStack]){//栈是一个递增角标
                   //当前值小于角标那个值  他是从当前柱开始计算的
                   int mid = stack.pop();;//左边是栈顶部角标最大值//出栈
                   int left = stack.peek();//中间是继续一个
                   int right = i;//当前的角标
                   int w = right - left - 1;//宽 eg: 5  3
                   int h = heights[mid];//高
                   result = Math.max(result,w*h);
                   topStack = stack.peek();
               }
               stack.push(i);
           }
       }
return  result;

    }
}
