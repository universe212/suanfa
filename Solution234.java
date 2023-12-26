package suanfa;

/**
 * ClassName: Solution234
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/25 20:26
 * @Version 1.0
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }//快慢指针定义 当慢到中间 快正好到末尾
        ListNode cur = slow.next; //此时cur越过中线
        ListNode curNext = null;  //null

        while(cur != null){
            curNext = cur.next; //curNext当 cur得下一个
            cur.next = slow;   // 反转链表记住了
            slow = cur;
            cur = curNext;
        }

        while(head != slow ){
            if(head.val != slow.val){
                return false;
            }
            if(head.next == slow) return true;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
//        ArrayList<Integer> list = new ArrayList<>();
//        ListNode cur = head;
//        int i = 0;
//        while (cur != null){
//            list.add(cur.val);
//            cur = cur.next;
//            i++;
//        }
//        int x = 0;
//        int y = i - 1;
//        while (x < y){
//            if(!list.get(x).equals(list.get(y))){
//                return false;
//            }
//            x++;
//            y--;
//        }
//        return true;
//    }
  }
