	 
import java.util.*;
public class RemoveSortedArrayDuplicates {

   public boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> nSet=new HashSet<Integer>();
	        for(int i:nums){
	          if(nSet.contains(i)){
	              return true;
	          }else{
	              nSet.add(i);
	          }
	        }
	        return false;
	    }
}
