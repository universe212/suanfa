package suanfa;

/**
 * ClassName: Solution24
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/17 16:07
 * @Version 1.0
 */
public class Solution206 {
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

}
