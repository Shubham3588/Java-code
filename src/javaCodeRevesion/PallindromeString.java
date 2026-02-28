package javaCodeRevesion;

public class PallindromeString {

	public static void main(String[] args) {
		
	
	checkPallindrome("shubham");

	}
	
	public static void checkPallindrome(String s) {
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			
			rev = rev+ch;
		}
		System.out.println(rev);
		if(rev.equals(s)) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not Pallindrome");
		}
	}

}
