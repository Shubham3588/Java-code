package javaCodeRevesion;

public class FindNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "shashanks";
		
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			int count =0;
			
			for(int j=0;j<ch.length-1;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count<1) {
				System.out.println(ch[i]);
				break;
			}
			
		}

	}

}
