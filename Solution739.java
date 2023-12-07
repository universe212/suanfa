package suanfa;

import java.util.LinkedList;

/**
 * ClassName: Solution739
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/1 20:44
 * @Version 1.0
 */
public class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int lens=temperatures.length;
        int []res=new int[lens];
        LinkedList<Integer> stack = new LinkedList<>();
        for(int i = 0; i < temperatures.length; i++){
            while ( !stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
