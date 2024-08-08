package suanfa;

import java.util.Stack;

/**
 * ClassName: Solution42
 * Package: suanfa
 * Description
 * 2刷
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

        int sum = 0;//我们要维持一个栈顶是最小值的递减栈 栈维持的是角标
        for (int index = 1; index < size; index++){
            int topStack = stack.peek();//
            if(height[topStack] > height[index]){
            stack.push(index);
            }
            else if(height[topStack] == height[index]){
                stack.pop();
                stack.push(index);
            }
            else {//这是 要加入的大于这时候就要算了
               //先把 要加入的记录
                while (!stack.isEmpty() && height[index] > height[stack.peek()]){
                    int mid = stack.pop();//这是凹进去的点
                    if(!stack.isEmpty()){
                        int left = stack.peek();
                        int right = index;//凹进去旁边的
                      int h =   Math.min(height[index],height[left]) - height[mid];
                      int w =   right - left - 1;
                      int hold = h*w;
                      if(hold>0)sum += hold;//算面积

                    }
                }
                stack.push(index);
            }
        }
        return sum;
        }
}
