/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class leetcode142 {
    public ListNode detectCycle(ListNode head) {
        ListNode cur = head;
        ListNode prev = head;

        while (cur != null && cur.next != null) {

            cur = cur.next.next;
            prev = prev.next;

            if (cur == prev) {
                prev = head;
                while(prev != cur) {
                    cur = cur.next;
                    prev =prev.next;
                }
                return cur;
            }

        }

        return null;

    }
}