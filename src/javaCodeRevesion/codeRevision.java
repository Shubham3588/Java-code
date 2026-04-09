package javaCodeRevesion;

import java.util.Arrays;

public class codeRevision {
	
	//Find duplicate character 

	public static void main(String[] args) {
		String s1 = "adakj";
		fetchString(s1);
		
	
}
	
	public static void fetchString(String s) {
		int[] arr= {3,5};
		
		for(int k=0;k<arr.length;k++) {
			
			for(int i=0;i<s.length();i++) {
				String res="";
				for(int j=i;j<arr[k];j++) {
					char ch = s.charAt(j);
					res=res+ch;
				}
				checkPallindrome(res);
			}
			
		}
		}
			
		
		
	
	
	public static void checkPallindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		if(rev.equals(s)) {
			
			System.out.println(rev);
		}
		
	}
}
