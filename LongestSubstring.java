package seventeen_nine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		int len = s.length();
		int max = 0;
		Map<String, Integer> rs = new HashMap<>();

		for (int i = 0, j = 0; i < len; i++) {
			String temp = s.substring(i, i + 1);
			if (rs.containsKey(temp)) {
				j = Math.max(rs.get(temp), j);
			}
			max = Math.max(max, i - j + 1);
			rs.put(temp,i+1);
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}
}
