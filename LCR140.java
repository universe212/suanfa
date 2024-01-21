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
        ListNode pre = head;
        ListNode had = pre;
        for(int i = 0; i < cnt; i++){
            if(pre == null) return null;
            pre = pre.next;
        }
        while (pre != null){
            pre = pre.next;
            had = had.next;
        }
        return had;
    }

}
