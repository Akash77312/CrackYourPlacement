// 442. Find All Duplicates in an Array

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/


class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int idx = Math.abs(arr[i])-1;
            if(arr[idx]<0){
                ans.add(idx+1);
            }
            arr[idx] *= -1;
        }
        return ans;
    }
}

