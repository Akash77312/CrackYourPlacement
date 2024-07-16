287. Find the Duplicate Number

https://leetcode.com/problems/find-the-duplicate-number/

// solution
class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]<0){
                return idx+1;
            }
            nums[idx] = nums[idx]*-1;
        }
        return -1;
    }
}