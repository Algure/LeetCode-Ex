	
import java.util.*;
public class LeetCodes {

  static void rotate(int[] nums, int k) {
		 if(nums.length==1){
            return;
        }
        int[] ans=nums.clone();
        for(int i=0;i<ans.length;i++){
            if(i+k>=nums.length){
                nums[(i+k)%nums.length]=ans[i];
            }else{
                 nums[i+k]=ans[i];
            }
        }
    }
}
