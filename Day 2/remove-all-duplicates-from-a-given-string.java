Remove all duplicates from a given string

https://www.geeksforgeeks.org/problems/remove-all-duplicates-from-a-given-string4321/1



class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<Character>();
        
        int size=0;
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
            
            if(set.size()!=size){
                sb.append(s.charAt(i));
                size++;
            }
        }
        return sb.toString();
    }
}

