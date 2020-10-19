class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        long temp=0;
        HashMap<Character,Long> map1=new HashMap<Character,Long>();
        for(char c:s.toCharArray()){
            if(map1.containsKey(c)){
                temp=(long)map1.get(c);
                temp+=1;
                map1.put(c,(long)temp);
            }else{
                map1.put(c,(long)1);
            }
        }
        
        HashMap<Character,Long> map2=new HashMap<Character,Long>();
        for(char c:t.toCharArray()){
            if(map2.containsKey(c)){
                temp=(long)map2.get(c);
                temp+=1;
                map2.put(c,(long)temp);
            }else{
                map2.put(c,(long)1);
            }
        }
        // HashMap<Character,Long> map2=new HashMap<Character,Long>();
        for(char i:map1.keySet()){
            System.out.println(String.format("key %c map1.containsKey: %b ",i,map2.containsKey(i)));
            if(!map2.containsKey(i)||((long)map2.get(i)!=(long)map1.get(i))){
               
                return false;
            }
        }
        return true;
    }
}
