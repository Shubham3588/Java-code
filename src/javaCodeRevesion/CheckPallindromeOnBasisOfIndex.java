package javaCodeRevesion;

public class CheckPallindromeOnBasisOfIndex {

	public static void main(String[] args) {
		checkInput("madammhgfadeeada");
	}

	public static void checkPallindrome(String res) {

		String rev = "";
		for (int i = res.length()-1; i >=0; i--) {
			char ch = res.charAt(i);
			rev = rev + ch;
		}

		if (rev.equals(res)) {
			System.out.println(res);
		}
	}

	public static void checkInput(String s) { // madamcicictrhioinjkdfdjknkj
		
		for (int i = 0; i <= s.length()-5; i++) {
			String inp = "";
			for (int j = i; j < i+5; j++) {
				char ch = s.charAt(j);
				inp = inp + ch;
			}
			
			checkPallindrome(inp);
		}


		for (int i = 0; i <= s.length()-3; i++) {
			String inp = "";
			for (int j = i; j < i+3; j++) {
				char ch = s.charAt(j);
				inp = inp + ch;
			}
			checkPallindrome(inp);
		}
		

	}
	
	

}
