package suanfa;

/**
 * ClassName: Solution82
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/5/27 21:18
 * @Version 1.0
 */
public class Solution82 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
         dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }
}

