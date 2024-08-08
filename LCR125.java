package suanfa;

import java.util.LinkedList;

/**
 * ClassName: LCR125
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/3/17 21:08
 * @Version 1.0
 */
public class LCR125 {


}
    class CQueue {
        LinkedList<Integer> A, B;
        public CQueue() {
            A = new LinkedList<Integer>();
            B = new LinkedList<Integer>();
        }
        public void appendTail(int value) {
            A.addLast(value);
        }
        public int deleteHead() {
            if(!B.isEmpty()) return B.removeLast();
            if(A.isEmpty()) return -1;
            while(!A.isEmpty())
                B.addLast(A.removeLast());
            return B.removeLast();
        }}


