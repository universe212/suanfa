package suanfa;

/**
 * ClassName: suanfa142
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/18 15:10
 * @Version 1.0
 */
public class suanfa142 {
    public ListNode detectCycle(ListNode head) {
     ListNode slow = head;
     ListNode fast = head;
     while (fast!= null&&fast.next != null){ //如果不是环者 最后要到末点
         fast = fast.next.next;
         slow = slow.next;
         if(fast == slow){ //说明是环两个指针相遇
             break;
         }
     }
        if(fast== null || fast.next == null){
            return  null;
        } //这种情况说明 不是环
     slow = head;
     while (fast != slow){
         fast = fast.next; //另一个指针为头，另一个在相遇点不变 开始移动 直到环点
         slow = slow.next;
     }
     return slow;
        //方法二
//        ListNode cur = head;
//        Set<ListNode> visited = new HashSet<ListNode>();
//        while (cur!=null){
//            if(visited.contains(cur)){
//                return cur;
//            }
//            else{
//                visited.add(cur);
//            }
//            cur = cur.next;
//        }
//        return null;
    }
}
