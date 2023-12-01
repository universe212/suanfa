package suanfa;

import java.util.Stack;

/**
 * ClassName: Solution232
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/20 21:49
 * @Version 1.0
 */
public class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    public void push(int x){
        stackIn.push(x); //将元素 x 推到队列的末尾
    }
    public int pop() {
       //从队列的开头移除并返回元素
        dumpstackIn();
        return stackOut.pop();
    }
    public int peek(){
        dumpstackIn();
        return stackOut.peek();
    }
    public boolean empty(){
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
    // 如果stackOut为空，那么将stackIn中的元素全部放到stackOut中
    private void dumpstackIn() {
        if(!stackOut.isEmpty()) return; //Out不为空执行
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}
