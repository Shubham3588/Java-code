package javaCodeRevesion;

import java.util.Arrays;

public class InsertionInArrayelement {

	public static void main(String[] args) {
		int index = 2;
		int el = 12;
		int[] arr = { 1, 2, 3, 5, 7, 8, 9, 23 };
		int[] res = insertElement(arr, index, el);
		System.out.println(Arrays.toString(res));

	}

	public static int[] insertElement(int[] arr, int index, int el) {
		int[] newArr = new int[arr.length + 1];
		for (int i = 0; i < index; i++) {
			newArr[i] = arr[i];

		}

		newArr[index] = el;

		for (int i = index; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}

		return newArr;
	}

}
