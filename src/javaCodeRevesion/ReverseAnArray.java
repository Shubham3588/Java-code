package javaCodeRevesion;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int arr1[] = { 8, 5, 8, 9, 5, 1, 3 };
		rverseArray(arr1);
	}

	public static void rverseArray(int arr[]) {
		int temp = 0;

		int n = arr.length;
		int lp = 0;
		int rp = n - 1;

		while (lp < rp) {
			temp = arr[lp];
			arr[lp] = arr[rp];
			arr[rp] = temp;
			lp++;
			rp--;

		}

		System.out.println(Arrays.toString(arr));

	}

}
