package suanfa;

/**
 * ClassName: Solution160
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/17 19:55
 * @Version 1.0
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pre = headA;
        ListNode pre1 = headB;
        int n1 = 0, n2 =0;
        while(pre.next != null)
        {
            pre = pre.next;
            n1++;
        }
        while(pre1.next != null)
        {
            pre1 = pre1.next;
            n2++;
        }
         pre = headA;
         pre1 = headB;
        if(n1>n2){
            int temp = n1 - n2;
            while (temp>0){
                pre = pre.next;
                temp--;
            }
        }
        else {
            int temp = n2 - n1;
            while (temp>0){
                pre1 = pre1.next;
                temp--;
            }
        }
        while (pre!=pre1){
            pre = pre.next;
            pre1 = pre1.next;
        }
        return pre;
    }
}
