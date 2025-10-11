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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
        {
            head = null;
            return head;
        }
        
        ListNode list = head;
        int length = 1;

        while(list.next!=null)
        {
            length++;
            list = list.next;
        }
        int start = length - n;
        if (start == 0) {
                       return head.next;
                    }
        ListNode delnode = head;
        while(start > 1)
        {
            delnode = delnode.next;
            start--;
        }
        delnode.next = delnode.next.next;
        return head;
       
        
    }
}