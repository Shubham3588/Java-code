package javaCodeRevesion;

import java.util.Arrays;

public class RemoveDuplicateElementinArray {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 3, 4, 5, 6, 7, 8 };
		removeDuplicateElement(arr);
	}

	public static void removeDuplicateElement(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}

			}
			if (!isDuplicate) {
				System.out.println(arr[i] + " ");
			}

		}
	}

}
