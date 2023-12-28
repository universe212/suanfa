package suanfa;

import java.util.HashMap;

/**
 * ClassName: Solution138
 * Package: day24
 * Description
 *
 * @Author HuanZ
 * @Create 2023/12/26 20:38
 * @Version 1.0
 */
public class Solution138 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node,Node> result = new HashMap<>();
        Node cur = head;
        while (cur != null){
            result.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null){
            result.get(cur).next = result.get(cur.next);
            result.get(cur).random = result.get(cur.random);
            cur = cur.next;
        }
        return result.get(head);
    }
}
