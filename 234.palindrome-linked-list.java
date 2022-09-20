import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        boolean res = true;
        if (head != null && head.next != null) {
            ListNode firstHalfEnd = endOfFirstHalf(head);
            ListNode secondHalfStart = reverseList(firstHalfEnd.next);
            ListNode p1 = head, p2 = secondHalfStart;
            while (p2 != null) {
                if (p1.val != p2.val) {
                    res = false;
                    break;
                }
                p1 = p1.next;
                p2 = p2.next;
            }
            firstHalfEnd.next = reverseList(secondHalfStart);
        }
        return res;
    }

    private ListNode reverseList(ListNode list) {
        ListNode curr = list, prev = null;
        while (curr != null) {
            ListNode nextTmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTmp;
        }
        return prev;
    }

    private ListNode endOfFirstHalf(ListNode list) {
        ListNode slow, fast;
        slow = fast = list;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
