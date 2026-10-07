import java.util.HashMap;
import java.util.Map;

public class leetcode138 {

    // 先定义 Node 类（本地 IDE 必须写，LeetCode 上不用写）
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();

        // 第一遍：复制所有节点，建立“旧节点 -> 新节点”的映射
        for (Node cur = head; cur != null; cur = cur.next) {
            map.put(cur, new Node(cur.val));
        }

        // 第二遍：连接新节点的 next 和 random
        for (Node cur = head; cur != null; cur = cur.next) {
            Node newCur = map.get(cur);
            Node newNext = map.get(cur.next);
            newCur.next = newNext;
            Node newRandom = map.get(cur.random);
            newCur.random = newRandom;
        }

        // 返回新链表的头节点（旧 head 对应的新节点）
        return map.get(head);
    }
}