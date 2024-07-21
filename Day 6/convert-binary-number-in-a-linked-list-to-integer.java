1290. Convert Binary Number in a Linked List to Integer

 https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int n=0;
        while(curr!=null){
            n++;
            curr = curr.next;
        }
        int sum=0;
        curr = head;
        while(curr!=null){
            sum = sum + curr.val*(int)Math.pow(2 ,--n);
            curr = curr.next;
        }
        return sum;
    }
}