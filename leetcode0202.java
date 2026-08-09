public class leetcode0202 {

    // 单链表节点定义
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 返回链表的倒数第 k 个节点的值（你的实现）
    public int kthToLast(ListNode head, int k) {
        int size = 0;

        for (ListNode cur = head; cur != null; cur = cur.next) {
            size++;
        }

        for (int i = 0; i < size - k; i++) {
            head = head.next;
        }

        return head.val;
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
        leetcode0202 solution = new leetcode0202();

        // 测试用例 1：链表 1->2->3->4->5，倒数第 2 个节点为 4
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        System.out.print("链表: ");
        printList(head1);
        int result1 = solution.kthToLast(head1, 2);
        System.out.println("倒数第 2 个节点的值: " + result1);

        // 测试用例 2：链表 1->2->3->4->5，倒数第 1 个节点为 5
        int result2 = solution.kthToLast(head1, 1);
        System.out.println("倒数第 1 个节点的值: " + result2);

        // 测试用例 3：链表 1->2->3->4->5，倒数第 5 个节点为 1
        int result3 = solution.kthToLast(head1, 5);
        System.out.println("倒数第 5 个节点的值: " + result3);

        // 测试用例 4：单节点链表 [42]，倒数第 1 个节点为 42
        ListNode head2 = new ListNode(42);
        System.out.print("\n单节点链表: ");
        printList(head2);
        int result4 = solution.kthToLast(head2, 1);
        System.out.println("倒数第 1 个节点的值: " + result4);
    }
}