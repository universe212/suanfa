package suanfa;

/**
 * ClassName: Solution142
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/4/9 20:49
 * @Version 1.0
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }
}
