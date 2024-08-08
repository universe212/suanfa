package suanfa;

/**
 * ClassName: Solution707
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/17 14:43
 * @Version 1.0
 */
public class Solution707 {
    int size;
    ListNode head;

    public Solution707() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index){
        if(index < 0 || index >= size){
            return -1;
        }
        ListNode cur = head;
        for(int i = 0; i <= index; i++){
            cur = cur.next;
        }
        return cur.val;
    }
    public void addAthead(int val){
        addAtIndex(0,val);
    }
    public void addAtTail(int val){
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        index = Math.max(0,index);
        size++;
        ListNode pred = head;
        for (int i = 0; i < index; i++){
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }
    public void deleteAtIndex(int index){
        if(index < 0 || index >= size){
            return;
        }
        ListNode cust = head;
        for(int i = 0; i < index ; i++){
            cust = cust.next;
        }
        cust.next = cust.next.next;

    }


}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    ListNode() {}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

