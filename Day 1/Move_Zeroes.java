283. Move Zeroes


https://leetcode.com/problems/move-zeroes/

// solution


class Solution {
    public void moveZeroes(int[] nums) {
        int a=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0 || nums[i]<0){
                nums[a++] = nums[i];
            }
        }
        while(a!=n){
            nums[a++] = 0;
        }
    }
}
