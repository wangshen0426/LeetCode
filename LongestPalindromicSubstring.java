package seventeen_nine;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromicSubstring {
	public static String longestPalindrome(String s) {
		/*int len = s.length();
		Map<String, Integer> map = new HashMap<>();
		char[] chars = s.toCharArray();
		for (int index = 0; index < len; index++) {
			for (int i = len; i > index; i--) {
				StringBuilder temp = new StringBuilder(new String(chars, index,
						i - index));
				if (temp.toString().equals(temp.reverse().toString())) {
					map.put(temp.toString(), temp.length());
					break;
				}
			}
		}

		int max = 0;
		String rs = "";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				rs = entry.getKey();
			}
		}

		return rs;*/
		return null;
		
	}

	public static void main(String[] args) {
		System.out
				.println(longestPalindrome("jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel"));
	}
}
