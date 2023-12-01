package suanfa;

/**
 * ClassName: Solution203
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/16 16:01
 * @Version 1.0
 */
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
       if(head == null){
           return null;
       }
       head.next = removeElements(head.next,val);
       if(head.val == val){
           return head.next;
       }
       else {
           return head;
       }
    }
}
