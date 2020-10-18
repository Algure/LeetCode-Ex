import java.util.*;
public class LeetCodes {

static String getPrefix(String[] strs) {
		int min=0;
		String prefix="";
		int len=strs.length;
		for(int i=1;i<len;i++) {
			if(prefix.length()==0) {
				prefix=strs[0];
			}
			min=Math.min(prefix.length(), strs[i].length());
			for(int j=0;j<min;j++) {
				if(prefix.charAt(j)!=strs[i].charAt(j)) {
					prefix=prefix.substring(0,j);
					break;
				}
			}
			if(prefix.length()==0) {
				return prefix;
			}
		}
		return prefix;
	}
  }
