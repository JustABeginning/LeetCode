/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow,fast;
        slow=fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next==null){
            if(slow.next==null)
                head=null;
            else{
                slow.val=slow.next.val;
                slow.next=slow.next.next;
            }
        }
        else{
            slow=slow.next;
            if(slow.next==null)
                head.next=null;
            else{
                slow.val=slow.next.val;
                slow.next=slow.next.next;
            }
        }
        return head;
    }
}