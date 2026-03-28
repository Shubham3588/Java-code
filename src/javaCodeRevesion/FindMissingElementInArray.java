package javaCodeRevesion;

import java.util.Arrays;

public class FindMissingElementInArray {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 1, 3, 2, 9 };
		findMissingElement(arr);

	}

	public static void findMissingElement(int[] arr) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			int current = arr[i];

			while (current + 1 < arr[i + 1]) {
				current++;
				System.out.println("Missing: " + current);
			}

		}

	}
}
