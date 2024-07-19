2. Add Two Numbers

https://leetcode.com/problems/add-two-numbers/description/


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
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        int carry=0;
        while(l1 != null && l2  != null){
            int num = l1.val+l2.val+carry;
            carry = num/10;
            ans.next = new ListNode(num%10);
            l1 = l1.next;
            l2 = l2.next;
            ans = ans.next;
        }
        while(l1 != null){
            int num = l1.val+carry;
            carry = num/10;
            ans.next = new ListNode(num%10);
            l1 = l1.next;
            ans = ans.next;
        }
         while(l2 != null){
            int num = l2.val+carry;
            carry = num/10;
            ans.next = new ListNode(num%10);
            l2 = l2.next;
            ans = ans.next;
        }
        if(carry>0){
            ans.next = new ListNode(carry);
        }
        return head.next;
    }
}