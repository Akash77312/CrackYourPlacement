22. Generate Parentheses

https://leetcode.com/problems/generate-parentheses/description/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        func(ans,n,0,0,"");
        return ans;
    }
    public void func(List<String> ans,int n,int open,int close,String str){
        if(str.length()==2*n){
            ans.add(str);
        }
        if(open<n)func(ans,n,open+1,close,str+"(");
        if(close<open)func(ans,n,open,close+1,str+")");
    }
}