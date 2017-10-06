package seventeen_ten;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
	public static int romanToInt(String s) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] keys = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
				"IX", "V", "IV", "I" };

		Map<String, Integer> map = new HashMap<String, Integer>();
		int len = values.length;
		for (int i = len - 1; i >= 0; i--) {
			map.put(keys[i], values[i]);
		}

		int rs = 0, sLen = s.length(), index = sLen - 1;
		char[] chars = s.toCharArray();
		while (index >= 0) {
			if(index == 0){
				rs += map.get(chars[0] + "");
				break;
			}
			String temp = chars[index-1] +""+ chars[index] + "";
			if (map.containsKey(temp)) {
				rs += map.get(temp);
				index--;
			} else {
				rs += map.get(chars[index] + "");
			}
			index--;
			
		}

		return rs;
	}

	public static void main(String[] args) {
		System.out.println(romanToInt("D"));
	}
}
