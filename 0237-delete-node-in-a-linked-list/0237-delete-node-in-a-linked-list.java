/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode save=node;
        while(node.next!=null){
            node.val=node.next.val;
            save=node;
            node=node.next;
        }
        save.next=null;
    }
}