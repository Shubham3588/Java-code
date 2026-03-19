package javaCodeRevesion;

import java.util.Arrays;

public class DuplicateStringPreservingSpace {

	public static void main(String[] args) {
		reverseString("shubham kumar pandey");

	}
	
	public static void reverseString(String s) {
		String[] s1=s.split(" ");
		
		System.out.println(Arrays.toString(s1));
		
		for(int i=0;i<s1.length;i++) {
			String rev = "";
			for(int j=s1[i].length()-1;j>=0;j--) {
			
				char ch = s1[i].charAt(j);
				rev= rev+ch;
				
			}
			
			System.out.print(rev + " ");
			
		}
		
	}
	

}
