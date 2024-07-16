Chocolate Distribution Problem

https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

// solution

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);int ans=Integer.MAX_VALUE;
        for(int i=0;i<(n-m+1);i++){
            
            ans = Math.min(ans,a.get(i+m-1)-a.get(i));
        }
        return ans;
    }
}
