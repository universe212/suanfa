package suanfa;

/**
 * ClassName: Solution25
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/26 19:46
 * @Version 1.0
 */
public class Solution25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0); //创建一个0
        dummy.next = head;//0指向head

        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) end = end.next;
            if (end == null) break; //盘查后面数组满足k不
            ListNode start = pre.next;
            ListNode next = end.next; //end 指向 下一个k子数组的首节点
            end.next = null; //end 先指向空  把当前链表和原来链表断开
            //pre 表示上个k子数组的末尾
            pre.next = reverse(start); //反转 传入开始节点的下一个
            //start位置没有变 start反转过后从头变成尾巴
            start.next = next;
            pre = start;

            end = pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;

    }
}
