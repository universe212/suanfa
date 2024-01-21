package suanfa;

/**
 * ClassName: LCR142
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/15 20:43
 * @Version 1.0
 */
public class LCR142 {
    public ListNode trainningPlan(ListNode l1, ListNode l2) {
       ListNode pre = new ListNode(0);
       ListNode root = pre;
       while (l1 != null && l2 != null){
           if(l1.val > l2.val){
               root.next = l2;
               l2 = l2.next;
           }
           else {
               root.next = l1;
               l1 = l1.next;
           }
           root = root.next;
       }
       root.next = l1 != null ? l1 : l2;
       return pre.next;
    }
}
