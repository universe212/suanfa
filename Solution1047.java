package suanfa;

import java.util.Stack;

/**
 * ClassName: Solution1047
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/23 16:45
 * @Version 1.0
 */
public class Solution1047 {
    public String removeDuplicates(String s) {
     if(s.length() == 0){
         return null;
     }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(stack == null){
                stack.push(c);
            }
            else {
                Character temp = stack.peek();
                if(temp == c){
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for (Character character : stack) {
            sb.append(character);
        }
      sb.reverse();
    return  sb.toString();
    }
}
