
import java.util.*;

public class RemoveSortedArrayDuplicates {
	private static int findNonRepeating(String str) {
		Map<Character,Integer> nMap=new LinkedHashMap<Character,Integer>();
		int sLen=str.length();
		for(int i=0;i<sLen;i++) {
			if(nMap.containsKey(str.charAt(i))) {
				nMap.remove(str.charAt(i));
			}else {
				nMap.put(str.charAt(i), i);
			}
		}

		for(int i:nMap.values()) {
			return i;
		}
		return -1;
	}
}
