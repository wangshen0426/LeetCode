package seventeen_nine;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		String x1 = String.valueOf(x);
		if (x1.charAt(0) == '+' || x1.charAt(0) == '-') {
			return x1.equals(new StringBuilder(x1.substring(1, x1.length()))
					.reverse().toString());
		}

		return x1.equals(new StringBuilder(x1).reverse().toString());
	}
}
