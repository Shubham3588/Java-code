package javaCodeRevesion;

import java.util.Arrays;

public class codeRevision {
	
	//Find 1st non repeating character
	

	
	
	public static void getFirstRepeating(String s) {
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			boolean isDuplicate = false;
			for(int j=0;j<ch.length;j++) {
				if((i!=j) && ch[i]==ch[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.println(ch[i]);
			}
		}
	}

	
	
}
