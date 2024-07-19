14. Longest Common Prefix

https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];

        for(int i=1;i<strs.length;i++){
            s = common(s,strs[i]);
        }
        return s;
    }
    public String common(String s, String str){
        int n = Math.min(s.length(),str.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==str.charAt(i)){
                sb.append(s.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
}