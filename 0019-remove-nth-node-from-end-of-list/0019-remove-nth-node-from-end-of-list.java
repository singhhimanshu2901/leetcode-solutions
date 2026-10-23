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
        ListNode curr = head;
        int n1 = 0;
        while(curr != null){
            n1+=1;
            curr = curr.next;
        }
        curr = head;
        if(n1==n)
            return head.next;
        int t = n1-n;
        for(int i=0 ; i<t-1 ; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}