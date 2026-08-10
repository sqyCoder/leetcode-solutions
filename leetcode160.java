

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class leetcode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cura = headA;
        ListNode curb = headB;
        int counta = 0;


        int countb = 0;

        while (cura != null) {
            counta++;
            cura = cura.next;
        }

        while (curb != null) {
            countb++;
            curb = curb.next;
        }

        int c = counta - countb;

        if (c < 0) {
            while (c != 0) {
                headB = headB.next;
                c++;
            }
        } else {
            while (c != 0) {
                headA = headA.next;
                c--;
            }

        }

        while (headA != null) {

            if (headA == headB) {
                break;
            }

            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}