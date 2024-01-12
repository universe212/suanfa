package suanfa;

import java.util.ArrayList;

/**
 * ClassName: LCR123
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/1/11 20:11
 * @Version 1.0
 */
public class LCR123 {
    public int[] reverseBookList(ListNode head) {
         ListNode pre = null;
         ListNode p = head;
         while (p!=null){
             ListNode nextNode = p.next;
             p.next = pre;
             pre = p;
             p = nextNode;
         }
        ArrayList<Integer> result = new ArrayList<>();
        ListNode s = pre;// 链表反转了这个是头
         while (s!=null){
             result.add(s.val);
             s = s.next;
         }
        int[] res = new int[result.size()];
        for(int i = 0; i < res.length; i++)
        {res[i] = result.get(i);}
        return res;
    }
}
