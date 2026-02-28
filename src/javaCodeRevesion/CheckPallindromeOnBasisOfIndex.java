package javaCodeRevesion;

public class CheckPallindromeOnBasisOfIndex {

	public static void main(String[] args) {
		checkInput("madammhgfadeeada");
	}

	public static void checkPallindrome(String res) {

		String rev = "";
		for (int i = res.length() - 1; i >= 0; i--) {
			char ch = res.charAt(i);
			rev = rev + ch;
		}

		if (rev.equals(res)) {
			System.out.println(res);
		}
	}

	public static void checkInput(String s) {

		int[] index = { 5, 3 };

		for (int val : index) {

			for (int i = 0; i <= s.length() - val; i++) {
				String inp = "";
				for (int j = i; j < i + val; j++) {
					char ch = s.charAt(j);
					inp = inp + ch;
				}

				checkPallindrome(inp);
			}

		}
	}

}
