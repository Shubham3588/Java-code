package javaCodeRevesion;

public class countFrequencyOfCharacterInString {

	public static void main(String[] args) {
		countFrequencyOfCharacter("shubham");

	}

	public static void countFrequencyOfCharacter(String s) {
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			boolean isrepeated = false;

			for (int k = 0; k < i; k++) {
				if (ch[i] == ch[k]) {
					isrepeated = true;
					break;
				}
			}

			if (isrepeated) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}

			}
			if (count > 1) {
				System.out.println(ch[i] + "repeats " + count + "times");
			}
		}
	}

}
