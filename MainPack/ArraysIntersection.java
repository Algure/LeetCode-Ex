	 import java.util.*;
public class RemoveSortedArrayDuplicates {

   static int[] intersect(int[] nums1, int[] nums2) {
	        HashMap<Integer,Integer> allNums=new HashMap<Integer,Integer>();
	        HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
	        HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
	        
	        for(int i:nums1){
	            if(map1.containsKey(i)){
	                map1.put(i,map1.get(i)+1);
	            }else{
	                map1.put(i,1);
	                allNums.put(i,i);
	            }
	        }

	        
	        for(int i:nums2){
	            if(map2.containsKey(i)){
	                map2.put(i,map2.get(i)+1);
	            }else{
	                map2.put(i,1);
	            }
	        }
	        ArrayList<Integer> resList=new ArrayList<Integer>();
			System.out.println(String.format(" setSize %d", allNums.size()));
			for(int i:allNums.values()){
				System.out.println(String.format(" set value %d", i));
				if(map1.containsKey(i)&&map2.containsKey(i)){
					Math.mi
	                for(int j=0;j<map1.get(i);j++){
	                    resList.add(i);
	                }
	            }
	        }
	        for(int k:resList) {
				System.out.println(String.format(" %d", k));
			}
	        int[] array = resList.stream().mapToInt(i->i).toArray();
	        return array;
	    }
 }
