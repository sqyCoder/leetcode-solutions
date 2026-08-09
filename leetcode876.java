public class leetcode876 {

    // 单链表节点定义
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 寻找链表的中间结点（你的实现）
    public ListNode middleNode(ListNode head) {
        int size = 0;

        for (ListNode cur = head; cur != null; cur = cur.next) {
            size++;
        }

        for (int i = 0; i < size / 2; i++) {
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
        leetcode876 solution = new leetcode876();

        // 测试用例 1：奇数个节点（中间结点应为 3）
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        System.out.print("链表1: ");
        printList(head1);
        ListNode mid1 = solution.middleNode(head1);
        System.out.println("中间结点值: " + (mid1 != null ? mid1.val : "null"));

        // 测试用例 2：偶数个节点（中间结点应为第二个中间结点，即 4）
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);
        System.out.print("\n链表2: ");
        printList(head2);
        ListNode mid2 = solution.middleNode(head2);
        System.out.println("中间结点值: " + (mid2 != null ? mid2.val : "null"));

        // 测试用例 3：单节点
        ListNode head3 = new ListNode(42);
        System.out.print("\n链表3: ");
        printList(head3);
        ListNode mid3 = solution.middleNode(head3);
        System.out.println("中间结点值: " + (mid3 != null ? mid3.val : "null"));

        // 测试用例 4：两个节点（中间结点应为第二个）
        ListNode head4 = new ListNode(10);
        head4.next = new ListNode(20);
        System.out.print("\n链表4: ");
        printList(head4);
        ListNode mid4 = solution.middleNode(head4);
        System.out.println("中间结点值: " + (mid4 != null ? mid4.val : "null"));
    }
}