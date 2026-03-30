package javaCodeRevesion;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		removeDuplicateCharacter("shubham");

	}
	
	public static void removeDuplicateCharacter(String input) {
		char[] ch = input.toCharArray();
		for(int i=0;i<input.length()-1;i++) {
			boolean isDuplicate=false;
			for(int j=i+1;j<input.length()-1;j++) {
				if(ch[i]==ch[j]) {
					isDuplicate=true;
					break;
				}else {
					System.out.print(ch[i]);
				}
			}
		}
	}

	
}
