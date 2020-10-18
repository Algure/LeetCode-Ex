	import java.util.*;
public class LeetCodes {

  static int removeDuplicates(int[] num) {
		int sum=0;
		if(num.length>1 && num[0]!=num[1]) {
			num[0]=1;
		}else {
			num[0]=0;
		}
		for(int i=1;i<num.length-1;i++) {
			if(num[i]!=num[i]+1) {
				num[0]+=1;
			}
		}
		return num[0];
	}
 }
