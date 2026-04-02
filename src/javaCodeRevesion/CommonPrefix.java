package javaCodeRevesion;

import java.util.Arrays;

public class CommonPrefix {

	public static void main(String[] args) {
		
		String[] arr = {"flower", "flyw","flow","flight","f"};
		
		char[] ch1 = arr[0].toCharArray();
		//System.out.println(ch1.length);
		char[] ch2 = arr[1].toCharArray();
	//	System.out.println(ch2.length);
		String res = "";
		int iteratiTime = 0;
		
		
		if(ch1.length<ch2.length) {
			iteratiTime=ch1.length;
		}else {
			iteratiTime=ch2.length;
		}
		
	//	System.out.println(iteratiTime);
		for(int i=0;i<iteratiTime;i++) {
			if(ch1[i]==ch2[i]) {
				res=res+ch1[i];
			}else {
				break;
			}
		}
		
		for(int k=2;k<arr.length;k++) {
			String finalResult= "";
			
			char[] res1= res.toCharArray();
			System.out.println(res1[0]);
			char[] ch3 = arr[k].toCharArray();
			
			
			int len = Math.min(res1.length, ch3.length); 
			
			for(int j=0;j<len;j++) {
				
				if(res1[j]==ch3[j]) {
					finalResult = finalResult+ch3[j];
				}else {
					break;
				}
			}
			
			res=finalResult;
		}
		System.out.println(res);
		

	}

}
