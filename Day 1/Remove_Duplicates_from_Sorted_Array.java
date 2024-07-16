26. Remove Duplicates from Sorted Array

https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

// solution 
class Solution {
    public int removeDuplicates(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[a]!=nums[i]){
                a++;
                nums[a] = nums[i];
            }
        }
        return a+1;
    }
}