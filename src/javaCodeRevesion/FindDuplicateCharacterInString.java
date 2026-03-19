package javaCodeRevesion;

import java.util.Arrays;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {
		findDuplicate("SHUBHAM");

	}
	
	
	public static void findDuplicate(String s) {
		char[] s1 = s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			boolean isDuplicate = false;
			for(int j=i+1;j<s1.length;j++) {
				if(s1[i]==s1[j]) {
					System.out.println(s1[i] + "is Duplicate");
				}
			}
		}
	}

}
