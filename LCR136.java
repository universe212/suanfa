package suanfa;

/**
 * ClassName: LCR136
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/12 19:49
 * @Version 1.0
 */
public class LCR136 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val){
            return head.next;
        }
         ListNode pre = head;
         while (true){
             if(pre.next.val == val){
                 ListNode p = null;
                 p = pre.next;
                 pre.next = pre.next.next;
                 p.next = null;
                 break;
             }
             pre = pre.next;
         }
         return head;
    }
}
