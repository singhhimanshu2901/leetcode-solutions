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
public class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode rev = reverseList(head);
        int carry = 0;
        ListNode curr = rev, pre = null;
        while(curr != null){
            int value = curr.val*2 + carry;
            curr.val = value % 10;
            if(value>9){
                carry = 1;
            }
            else{
                carry = 0;
            }
            pre = curr;
            curr = curr.next;
        }
        if(carry != 0){
            ListNode extra = new ListNode(carry);
            pre.next = extra;
        }
        ListNode result = reverseList(rev);
        return result;
    }
    public ListNode reverseList(ListNode node){
        ListNode pre = null, curr = node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}