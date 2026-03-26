package javaCodeRevesion;

public class sortAnArray {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 7, 2, 1, 3, 4 };
		sortArray(arr);

	}

	public static void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int num : arr) {
			System.out.println(num + " ");
		}

	}
}
