package suanfa;

/**
 * ClassName: LCR140
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/15 20:26
 * @Version 1.0
 */
public class LCR140 {

    public ListNode trainingPlan(ListNode head, int cnt) {

        ListNode cur = head;
        ListNode cur1 = head;
        int k = cnt;
        while (cnt > 0){
            cur = cur.next;
            cnt--;
        }
        while (cur.next != null){
            cur = cur.next;
            cur1 = cur1.next;
        }
        return cur1;


    }

}
