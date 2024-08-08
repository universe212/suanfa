package suanfa;

/**
 * ClassName: Solution24
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/17 16:10
 * @Version 1.0
 */
public class Solution24 {
    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null){
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            start.next = end.next;
            end.next = start;
            temp.next = end;
            temp = start;
        }
        return pre.next;
        }

    }

