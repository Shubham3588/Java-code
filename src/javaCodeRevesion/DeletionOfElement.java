package javaCodeRevesion;

import java.util.Arrays;

public class DeletionOfElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6 };
		int el = 2;
		int[] res = deletionofelement(arr, 2);
		System.out.println(Arrays.toString(res));

	}

	public static int[] deletionofelement(int[] arr, int el) {
		int[] newArr = new int[arr.length - 1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == el) {
				index = i;
				break;
			}
		}

		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}

		for (int i = index; i < arr.length - 1; i++) {
			newArr[i] = arr[i + 1];
		}

		return newArr;

	}

}
