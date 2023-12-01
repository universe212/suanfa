package suanfa;

import java.util.List;

/**
 * ClassName: Node
 * Package: suanfa
 * Description
 *
 * @Author HuanZ
 * @Create 2023/10/26 15:17
 * @Version 1.0
 */
public class Node {

        public int val;
        public suanfa.Node left;
        public suanfa.Node right;
        public suanfa.Node next;
    public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }
    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

        public Node(int _val, suanfa.Node _left, suanfa.Node _right, suanfa.Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }

}
