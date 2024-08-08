package suanfa;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ClassName: Solution155
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/3/1 20:38
 * @Version 1.0
 */
public class Solution155 {
}
class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();

        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}