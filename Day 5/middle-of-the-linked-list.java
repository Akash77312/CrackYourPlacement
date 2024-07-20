876. Middle of the Linked List

https://leetcode.com/problems/middle-of-the-linked-list/description/


class Solution {
    public ListNode middleNode(ListNode head) {
        int cnt=0;
        ListNode curr = head;
        while(curr!=null){
            curr = curr.next;
            cnt++;
        }
        int mid = cnt/2;
        curr = head;
        while(mid!=0){
            curr = curr.next;
            mid--;
        }
        return curr;
    }
}