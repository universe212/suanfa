package suanfa;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * ClassName: Solution23
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/2/6 21:05
 * @Version 1.0
 */
public class Solution23 {

//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists.length == 0){
//            return null;
//        }
//        ListNode list = lists[0];
//        ListNode listNode = new ListNode();
//        listNode = list;
//        for(int i = 1 ; i < lists.length; i++){
//            listNode = mergeTwoLists(listNode, lists[i]);
//        }
//        return listNode;
//    }
//
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode res = new ListNode();
//        ListNode cur = res;
//        while(list1 != null && list2 != null){
//            if(list1.val <= list2.val){
//                cur.next = list1;
//                list1 = list1.next;
//            }
//            else{
//                cur.next = list2;
//                list2 = list2.next;
//            }
//            cur = cur.next;
//        }
//
//        if(list1 == null){
//            cur.next = list2;
//        }
//        if(list2 == null){
//            cur.next = list1;
//        }
//        return res.next;
//    }


    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> queue = new PriorityQueue<>((a, b)->a.val - b.val); //升序
        for(int i =0;i<lists.length;i++){
            if(lists[i] == null) continue;
            queue.offer(lists[i]);
        }
        ListNode root = new ListNode(0);

        ListNode tem = root;
        while(!queue.isEmpty()){
            ListNode node = queue.poll();//队首
            root.next = node;//root 指向 出来得最小值

            root = node;//root 向前移动
            //刚刚那个出来了肯定她后面的要入队
            if(node.next != null){
                queue.offer(node.next);//如果 数组第一个数组不为空 则向前添加进 队列中 直到添加完成
            }
        }
        return tem.next;
    }
}

