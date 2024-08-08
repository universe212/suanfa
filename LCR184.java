package suanfa;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ClassName: LCR184
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/23 21:00
 * @Version 1.0
 */
public class LCR184 {
}
class Checkout {
    //这个 弹出去得是链表
    //所有用deque要一个升序
      Queue<Integer> queue;
      Deque<Integer> deque;
    public Checkout() {
      queue = new LinkedList<>();
      deque = new LinkedList<>();
    }

    public int get_max() {
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }

    public void add(int value) {
      queue.offer(value);
      while (!deque.isEmpty() && deque.peekLast() < value){
          deque.pollLast();//注意这是个while循环  然后其次 保证deque递减
      }
      deque.offerLast(value);
    }

    public int remove() {
       if(queue.isEmpty()) return -1;
       if(queue.peek().equals(deque.peekFirst())){
           deque.pollFirst();
       }
       return queue.poll();
    }
}