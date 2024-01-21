package suanfa;

import java.util.Stack;

/**
 * ClassName: LCR147
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/16 19:15
 * @Version 1.0
 */
public class LCR147 {
    Stack<Integer> A,B;
    public LCR147() {
      A = new Stack<>();
      B = new Stack<>();
    }

    public void push(int x) {
        A.add(x);
        if(B.isEmpty() || B.peek() >= x){
            B.add(x);
        }
    }

    public void pop() {
       if(A.pop().equals(B.peek())){
           B.pop();
       }
    }

    public int top() {
       return  A.peek();
    }

    public int getMin() {
return B.pop();
    }
}
