package suanfa;

import java.util.Stack;

/**
 * ClassName: Solution150
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/23 18:45
 * @Version 1.0
 */
public class Solution150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")) {
                Integer p1 = (Integer) stack.pop();
                Integer p2 = (Integer) stack.pop();
                int temp = 0;
                if (token.equals("+")) {
                     temp = p2 + p1;
                } else if (token.equals("-")) {
                     temp = p2 - p1;
                }
                else if (token.equals("*")) {
                     temp = p2 * p1;
                }
                else if (token.equals("/")) {
                     temp = p2 / p1;
                }
                stack.push(temp);
            }
            else {
                int num = Integer.parseInt(token);
                stack.push(num);
            }

        }
return stack.pop();
    }
}
