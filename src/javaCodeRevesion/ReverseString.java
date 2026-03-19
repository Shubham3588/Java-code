package javaCodeRevesion;

public class ReverseString {

	public static void main(String[] args) {
		reverseString("shubham kumar pandey");

	}
	
	public static void reverseString(String s) {
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			
			rev = rev+ch;
		}
		
		System.out.println(rev);
	}

}
