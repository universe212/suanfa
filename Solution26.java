package suanfa;

import java.util.PriorityQueue;

/**
 * ClassName: Solution26
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/28 19:58
 * @Version 1.0
 */
public class Solution26 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
         for (int i = 0; i < lists.length; i++){
             pq.offer(lists[i]);
         }
         ListNode cur = new ListNode(0);
         ListNode root = cur;
         while (!pq.isEmpty()){
             ListNode poll = pq.poll();
             root.next = poll;
             root = poll;
             if(poll.next != null){
                 pq.offer(poll.next);
             }
         }
return cur.next;
    }
//        ListNode result = null;
//        for(int i = 0; i < lists.length; i++){
//            result = mergeTwoLists(result,lists[i]);
//        }
//        return result;
//
//    }
//
//    private ListNode mergeTwoLists(ListNode left, ListNode right) {
//        ListNode h = new ListNode(0);//创建一个0节点
//        ListNode res = h; //res表示0节点 类似于创建一个新链表
//        while (left != null && right != null) {
//            if (left.val < right.val) {
//                h.next = left;   //把小的 连接到h后面
//                left = left.next; //小的前移
//            } else {
//                h.next = right;//把小的 连接到h后面
//                right = right.next;//把小的 连接到h后面
//            }
//            h = h.next;
//        }
//        h.next = left != null ? left : right;
//        return res.next;
//    }
}

