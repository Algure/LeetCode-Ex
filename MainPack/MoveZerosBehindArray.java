	 import java.util.*;
public class LeetCodes {

   static void moveZeroes(int[] nums) {
	        int zcount=0;
	        int zDex=0;
	        boolean filledZero=true;
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]==0){
	                zcount+=1;
	            }else{
	                nums[zDex]=nums[i];
	                zDex+=1;
	            }
	        }
	        for(int i=1;i<=zcount;i++){
	            nums[nums.length-i]=0;
	        }

	        for(int i:nums){
	            System.out.print(String.format(" %d",i));
	        }
	    }
}
