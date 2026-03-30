package javaCodeRevesion;

public class FindMissingElementInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 6, 7, 8, 9 };
		findmissingelement(arr);

	}

	public static void findmissingelement(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {

			int current = arr[i];
			while (current + 1 < arr[i + 1]) {
				current++;
				System.out.println(current);

			}

		}
	}

}
