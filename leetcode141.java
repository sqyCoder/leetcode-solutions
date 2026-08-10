class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
  val = x;
  next = null;
  }
  }

 class leetcode141 {
    public boolean hasCycle(ListNode head) {
        ListNode cur = head;
        ListNode prev = head;

        while (cur != null && cur.next != null) {
            cur = cur.next.next;
            prev


                    = prev.next;
            if (cur == prev) {
                return true;
            }

        }

        return false;

    }
}