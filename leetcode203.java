public class leetcode203 {

    // 单链表节点定义（与 LeetCode 一致）
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 移除链表中所有值为 val 的节点（LeetCode 203 题解）
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;

        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;   // 删除 cur
            } else {
                pre = cur;             // 保留 cur，pre 后移
            }
            cur = cur.next;            // cur 始终后移（删除时利用旧的 cur.next）
        }

        // 最后处理头结点
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

    // 辅助方法：打印链表
    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) {
                System.out.print(" -> ");
            }
            cur = cur.next;
        }
        System.out.println();
    }

    // 测试主方法
    public static void main(String[] args) {
        leetcode203 solution = new leetcode203();

        // 测试用例 1：常规删除
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next.next = new ListNode(6);

        System.out.print("原始链表: ");
        printList(head1);
        ListNode result1 = solution.removeElements(head1, 6);
        System.out.print("删除 6 后: ");
        printList(result1);

        // 测试用例 2：空链表
        System.out.print("\n空链表删除: ");
        ListNode head2 = null;
        ListNode result2 = solution.removeElements(head2, 1);
        printList(result2);

        // 测试用例 3：所有节点都等于目标值
        ListNode head3 = new ListNode(2);
        head3.next = new ListNode(2);
        head3.next.next = new ListNode(2);
        System.out.print("\n全部删除前: ");
        printList(head3);
        ListNode result3 = solution.removeElements(head3, 2);
        System.out.print("全部删除后: ");
        printList(result3);

        // 测试用例 4：头结点需要删除但后续不需要
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        head4.next.next = new ListNode(3);
        System.out.print("\n头结点删除前: ");
        printList(head4);
        ListNode result4 = solution.removeElements(head4, 1);
        System.out.print("头结点删除后: ");
        printList(result4);
    }
}