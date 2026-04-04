package javaCodeRevesion;

import java.util.Arrays;

public class codeRevision {
	
	//Find duplicate character 

	public static void main(String[] args) {
		
		String s = "shashank";
		
		for(int i=0;i<s.length();i++) {
			boolean isDuplicate =false;
			char[] ch = s.toCharArray();
			
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					isDuplicate = true;
					break;
					
				}
				
			}
			if(isDuplicate) {
				System.out.println(ch[i]);
			}
			
		}
	
	
}
}
