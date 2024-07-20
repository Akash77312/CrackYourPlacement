141. Linked List Cycle

https://leetcode.com/problems/linked-list-cycle/description/

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null ||head.next==null)    return false;
        ListNode curr = head;
        ListNode nxt = head;
        boolean ans=false;
        while(nxt!=null && nxt.next!=null){
            nxt = nxt.next.next;
            curr  =curr.next;
            if(curr ==nxt){
                return true;
            }
        }
        return ans;
    }
}