package suanfa;

/**
 * ClassName: Solution148
 * Package: suanfa
 * Description
 *2
 * @Author HuanZ
 * @Create 2023/12/26 20:57
 * @Version 1.0
 */
public class Solution148 {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode fast = head.next, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }//快的先到达尾部 然后 慢的 在中间位置
        ListNode tmp = slow.next; //分割右半部分头
        slow.next = null; //前面和后面分割 二分法
        ListNode left = sortList(head);//继续递归
        ListNode right = sortList(tmp); //继续递归
        ListNode h = new ListNode(0);//创建一个0节点
        ListNode res = h; //res表示0节点 类似于创建一个新链表
        while (left != null && right != null) {
            if (left.val < right.val) {
                h.next = left;   //把小的 连接到h后面
                left = left.next; //小的前移
            } else {
                h.next = right;//把小的 连接到h后面
                right = right.next;//把小的 连接到h后面
            }
            h = h.next;
        }
        h.next = left != null ? left : right;
        return res.next;
    }

}
