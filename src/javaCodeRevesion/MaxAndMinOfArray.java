package javaCodeRevesion;

public class MaxAndMinOfArray {

	public static void main(String[] args) {

		int arr[] = { 6, 9, 3, 4, 6, 9, 0 };

		maxAndMin(arr);
	}

	public static void maxAndMin(int arr[]) {
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Min = " + min);
		System.out.println("Max=" + max);

	}

}
