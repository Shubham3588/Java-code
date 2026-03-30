package javaCodeRevesion;

import java.util.Arrays;

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 0, 3, 8, 0, };
		movezerotoend(arr);

	}

	public static void movezerotoend(int[] arr) {

		Arrays.sort(arr);
		int temp = 0;
		int lp = 0;
		int rp = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {

				temp = arr[rp];
				arr[rp] = arr[i];
				arr[lp] = temp;
				lp++;
				rp--;
			} else {
				break;
			}

		}
		for (int num : arr) {
			System.out.println(num);
		}

	}

}
