package suanfa;

import java.util.PriorityQueue;

/**
 * ClassName: Solution295
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/9 19:28
 * @Version 1.0
 */
public class Solution295 {
    //设计思想 把一个数组 分成左边和右边 左边为大顶堆  右边为小顶堆
    PriorityQueue<Integer> l = new PriorityQueue<>((a, b)->b-a); //大顶堆
    PriorityQueue<Integer> r = new PriorityQueue<>((a,b)->a-b);//小顶堆
    public void addNum(int num) {
        int s1 = l.size(), s2 = r.size();//
        if (s1 == s2) {
            if (r.isEmpty() || num <= r.peek()) {
                l.add(num);//r为空 又因为 l的个数要大于r的个数 所以加入Num, r是小顶堆比他小不能放
            } else {
                l.add(r.poll());//不为空 num>r r是小顶堆可以放进 r，又因为l数字比r大，所以先把r移动一个到l
                r.add(num);
            }
        } else {//不相等说明 加入后是偶数
            if (l.peek() <= num) { //如果num < r的话 放到 l取，l顶放一个到r中取
                r.add(num);
            } else {
                r.add(l.poll());
                l.add(num);
            }
        }
    }
    public double findMedian() {
        int s1 = l.size(), s2 = r.size();
        if (s1 == s2) {
            return (l.peek() + r.peek()) / 2.0;
        } else {
            return l.peek();
        }
    }

}
