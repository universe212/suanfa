package suanfa;

/**
 * ClassName: Solution141
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/26 19:15
 * @Version 1.0
 */
public class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (true) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }



    }
}
