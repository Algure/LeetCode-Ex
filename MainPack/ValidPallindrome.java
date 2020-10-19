class Solution {
    public boolean isPalindrome(String s) {
        if(s.trim().matches("")){
            return true;
        }
        int counter=0;
        int i=0;
        int j=s.length()-1;
        while(j>i){
            while(!isLetterOrDigit(s.charAt(i))){
                i+=1;
                if(i>=s.length()){
                     return true;
                 }
            }
             while(!isLetterOrDigit(s.charAt(j))){
                j-=1;
                 if(j<0){
                     return true;
                 }
            }
            if( Character.toLowerCase(s.charAt(j))!= Character.toLowerCase(s.charAt(i))){
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
    public boolean isLetterOrDigit(char c) {
    return (c >= 'a' && c <= 'z') ||
           (c >= 'A' && c <= 'Z') ||
           (c >= '0' && c <= '9');
    }
}
