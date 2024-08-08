package suanfa;

/**
 * ClassName: Solution19
 * Package: suanfa
 * Description
 *2
 * @Author HuanZ
 * @Create 2023/10/17 19:38
 * @Version 1.0
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode pre = new ListNode(0);
       pre.next = head;
       ListNode start = pre;
       ListNode end = pre;
       while (n != 0){
           start = start.next;
           n--;
       }
       while (start.next != null){
           start = start.next;
           end = end.next;
       }
       end.next = end.next.next;
       return pre.next;
    }


}
