88. Merge Sorted Array

https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;i<nums1.length;i++,j++){
            nums1[i] = nums2[j];
        }
        int len = m+n-1;
        for(int i = 0;i<nums1.length-1;i++){
            for(int j=i+1;j<nums1.length;j++){
                if(nums1[i]>nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}