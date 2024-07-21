83. Remove Duplicates from Sorted List
 
https://leetcode.com/problems/remove-duplicates-from-sorted-list/


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        if(head==null || head.next==null){
            return head;
        }
        while(curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }
}