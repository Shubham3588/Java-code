package javaCodeRevesion;

public class PrintFirstNonRepeatingCharacterInString {

	public static void main(String[] args) {
		printNonRepeatingChar("shashank");
	}

	public static void printNonRepeatingChar(String s) {
		char[] ch = s.toCharArray();

		for (int i = 0; i <= ch.length - 1; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j <= ch.length - 1; j++) {
				if (i != j && ch[i] == ch[j]) {
					isDuplicate = true;
					break;
				}

			}
			if (!isDuplicate) {
				System.out.println(ch[i]);
				break;
			}

		}
	}

}
