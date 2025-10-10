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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0)
        {
            return head;
        }
        ListNode last = head;
        int length = 1;
        while(last.next!=null)
        {
            length++;
            last=last.next;
        }
        last.next=head;
        k%=length;
        int newstep = length-k;
        ListNode newnode = head;
        for(int i=1;i<newstep;i++)
        {
            newnode = newnode.next;
        }
        ListNode newhead=newnode.next;
        newnode.next=null;
        return newhead;
    }
}