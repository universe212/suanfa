package suanfa;

/**
 * ClassName: Solution21
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2024/2/6 19:13
 * @Version 1.0
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode res = new ListNode();
       ListNode cur = res;
       while (list1 != null && list2 != null){
           if(list1.val >= list2.val){
               cur.next = list1;
               list1 = list1.next;
           }
           else {
                   cur.next = list2;
                   list2 = list2.next;
           }
           cur = cur.next;
       }
       if( list1 == null){
           cur.next = list2;
       }
        if( list2 == null){
            cur.next = list1;
        }
        return res.next;
    }
}

