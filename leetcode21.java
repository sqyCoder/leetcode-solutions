public class leetcode21 {

    // 单链表节点定义（与 LeetCode 一致）
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 合并两个有序链表（LeetCode 21）
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                prev.next = p1;
                p1 = p1.next;
            } else {
                prev.next = p2;
                p2 = p2.next;
            }
            prev = prev.next;
        }

        // 剩余节点直接接上
        if (p1 != null) {
            prev.next = p1;
        } else {
            prev.next = p2;
        }

        return dummy.next;
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
        leetcode21 solution = new leetcode21();

        // 测试用例 1：list1 = 1->2->4, list2 = 1->3->4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        System.out.print("list1: ");
        printList(list1);
        System.out.print("list2: ");
        printList(list2);

        ListNode merged = solution.mergeTwoLists(list1, list2);
        System.out.print("合并后: ");
        printList(merged);

        // 测试用例 2：其中一个为空
        ListNode list3 = null;
        ListNode list4 = new ListNode(5);
        list4.next = new ListNode(6);

        System.out.print("\nlist3: ");
        printList(list3);
        System.out.print("list4: ");
        printList(list4);

        ListNode merged2 = solution.mergeTwoLists(list3, list4);
        System.out.print("合并后: ");
        printList(merged2);

        // 测试用例 3：两个都为空
        ListNode list5 = null;
        ListNode list6 = null;
        System.out.print("\nlist5: ");
        printList(list5);
        System.out.print("list6: ");
        printList(list6);

        ListNode merged3 = solution.mergeTwoLists(list5, list6);
        System.out.print("合并后: ");
        printList(merged3);
    }
}