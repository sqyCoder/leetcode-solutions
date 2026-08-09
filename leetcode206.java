public class leetcode206 {

    // 单链表节点定义
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // LeetCode 206 反转链表（你的实现）
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode pre = head;
        ListNode cur = pre.next;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        head.next = null;
        return pre;
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
        leetcode206 solution = new leetcode206();

        // 测试用例 1：常规链表
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.print("原始链表: ");
        printList(head1);
        ListNode result1 = solution.reverseList(head1);
        System.out.print("反转后: ");
        printList(result1);

        // 测试用例 2：空链表
        System.out.print("\n空链表: ");
        ListNode head2 = null;
        ListNode result2 = solution.reverseList(head2);
        printList(result2);

        // 测试用例 3：单节点
        ListNode head3 = new ListNode(42);
        System.out.print("\n单节点链表: ");
        printList(head3);
        ListNode result3 = solution.reverseList(head3);
        System.out.print("反转后: ");
        printList(result3);

        // 测试用例 4：两个节点
        ListNode head4 = new ListNode(10);
        head4.next = new ListNode(20);
        System.out.print("\n两个节点链表: ");
        printList(head4);
        ListNode result4 = solution.reverseList(head4);
        System.out.print("反转后: ");
        printList(result4);
    }
}