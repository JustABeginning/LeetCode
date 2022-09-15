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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=null,ptr=res;
        int a,b,s,c=0;
        while(l1!=null||l2!=null){
            if(l1==null)
                a=0;
            else{
                a=l1.val;
                l1=l1.next;
            }
            if(l2==null)
                b=0;
            else{
                b=l2.val;
                l2=l2.next;
            }
            s=a+b+c;
            if(s>9){
                s-=10;
                c=1;
            }
            else
                c=0;
            if(res==null){
                res=new ListNode(s);
                ptr=res;
            }
            else{
                ptr.next=new ListNode(s);
                ptr=ptr.next;
            }
        }
        if(c>0){
            ptr.next=new ListNode(c);
            ptr=ptr.next;
        }
        return res;
    }
}