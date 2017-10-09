package october;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 1) {
			return strs[0];
		}
		int len = strs.length;
		String rs = "";
		int index = 1;
		while (true) {
			try {
				String temp = strs[0].substring(0, index);
				for (int i = 1; i < len; i++) {
					if (strs[i] != "") {
						if (!strs[i].substring(0, index).equals(temp)) {
							return rs;
						}
					} else {
						return "";
					}
				}
				rs = temp;
			} catch (Exception e) {
				return rs;
			}
			
			index++;
		}
	}

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] { "aa", "a" }));
	}
}
