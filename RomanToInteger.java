class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int count=1;
        char temp=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ans+=(count*getValue(temp,s.charAt(i)));
                temp=s.charAt(i);
                count=1;
            }else{
                count++;
            }
        }
        ans+=(count*getValue(temp,temp));
        return ans;
    }
    
    public int getValue(char temp, char c){
        int ans=0;
        if(temp=='M'){
            ans=1000;
        }else if(temp=='D'){
            ans=500;
        }else if(temp=='C'){
            ans=100;
            if(c=='D'||c=='M')
                ans*=-1;
        }else if(temp=='L'){
            ans=50;
        }else if(temp=='X'){
            ans=10;
            if(c=='L'||c=='C'){
                ans*=-1;
            }
        }else if(temp=='V'){
            ans=5;
        }else if(temp=='I'){
            ans=1;
            if(c=='X'||c=='V')
                ans*=-1;
        }
        return ans;
    }
}
