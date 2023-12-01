package suanfa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: MyStack
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/23 15:10
 * @Version 1.0
 */
public class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public  MyStack(){
         queue1 = new LinkedList<Integer>();
         queue2 = new LinkedList<Integer>();
    }
    public void push(int x){
        queue2.offer(x);//offer(x)方法用于向队列中插入一个元素 x
        while (!queue1.isEmpty()){
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }
    public int pop(){
       return queue1.poll();
    }

    public int top(){
        return queue1.peek();
    }
    public boolean empty(){
        return queue1.isEmpty();
    }

}
