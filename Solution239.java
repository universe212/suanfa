package suanfa;

import java.util.LinkedList;

/**
 * ClassName: Solution239
 * Package: suanfa
 * Description
 *2
 * @Author HuanZ
 * @Create 2023/10/23 19:13
 * @Version 1.0
 */
public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
//        int n = nums.length;
//        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] != o2[0]?o2[0] - o1[0] : o2[1] - o1[1]; //明白降序升序的含义
//            }
//        });
//        for(int i = 0; i < k; i++){
//            pq.offer(new int[]{nums[i],i});
//        }
//        int[] cns = new int[n - k + 1];
//        cns[0] = pq.peek()[0];
//        for(int i = k; i < n; i++){
//            pq.offer(new int[]{nums[i],i});
//            while (pq.peek()[1] <= i-k){
//                pq.poll();
//            }
//            cns[i - k + 1] = pq.peek()[0];
//        }
//        return cns;
        int n = nums.length;
        LinkedList<Integer> pq = new LinkedList<>();
        for(int i = 0; i < k; i++){
            while (!pq.isEmpty() && nums[i] >= nums[pq.peekLast()]){
                pq.pollLast(); //单调栈 左边最大 递减
            }
            pq.offerLast(i);
        }
        int[] cnt = new int[n - k + 1];
        cnt[0] = nums[pq.peekFirst()];//记录最大值吗？
        for(int i = k; i < n; i++){
            while (!pq.isEmpty() && nums[i] >= nums[pq.peekLast()]){
                pq.pollLast();//如果新加进来得比最右边得大 那那个右边得出来他进去，构成单调为止
            }
            pq.offerLast(i);//把 新来得加进去
            while (pq.peekFirst()<= i-k){
                pq.pollFirst();//看最大得那个越界没越界T出去
            }
            cnt[i - k + 1] = nums[pq.peekFirst()];

        }
        return cnt;
    }

    public static void main(String[] args) {
        LinkedList<Integer> pq = new LinkedList<>();
        pq.offerLast(5);
        pq.offer(2);
        pq.offer(3);
        System.out.println(pq.peekFirst());
    }
}
