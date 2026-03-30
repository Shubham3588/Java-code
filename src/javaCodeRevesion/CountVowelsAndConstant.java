package javaCodeRevesion;

public class CountVowelsAndConstant {
	public static void main(String[] args) {
		countConstantAndVowels("shubham");
	}
	
	public static void countConstantAndVowels(String s) {
		char[] ch = s.toCharArray();
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
			}
			
			
		}
		System.out.println(count);
		
		
	}

}
