package suanfa;

import java.util.Stack;

/**
 * ClassName: Solution20
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/23 15:44
 * @Version 1.0
 */
public class Solution20 {
    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else {
                    char temp = stack.pop();
                    if(temp == '{'){
                        if(c != '}'){
                            return false;
                        }
                    }
                    else if(temp == '('){
                        if(c != ')'){
                            return false;
                        }
                    }
                    else if(temp == '['){
                        if(c != ']'){
                            return false;
                        }
                    }
                }
            }
        }

     return stack.isEmpty()? true:false;
    }
}
