package javaCodeRevesion;

import java.util.Arrays;

public class SortIntegerAndCheckIfItIsEven {

	public static void main(String[] args) {
		int input = 8624;

		char[] str = String.valueOf(input).toCharArray();

		for (int i = 0; i < str.length; i++) {

			for (int j = i; j < str.length; j++) {
				char temp = 0;
				if (str[i] > str[j]) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}

			}

			if (str[i] % 2 == 0) {
				System.out.println(str[i] + "is Even");
			}

		}
		System.out.println(str);

	}

}
