680. Valid Palindrome II

https://leetcode.com/problems/valid-palindrome-ii/description/


class Solution {
    public boolean validPalindrome(String str) {
       int s=0;
       int e = str.length()-1;
       while(s<e){
        if(str.charAt(s)==str.charAt(e)){
            s++;e--;
        }else{
            return ischeck(str,s+1,e) || ischeck(str,s,e-1);
        }
       }
       return true;
    }
    public boolean ischeck(String str, int s,int e) {
        while(s<e){
            if(str.charAt(s) == str.charAt(e)){
                s++;e--;
            }else{
                return false;
            }
        }
        return true;
    }    
}