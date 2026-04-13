package javaCodeRevesion;

public class FindSecondLargestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 8, 5, 2, 9, 6, 13 };
		findSecondLargest(arr);

	}

	public static void findSecondLargest(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			if (firstLargest < arr[i]) {
				temp = firstLargest;
				firstLargest = arr[i];
				secondLargest = temp;
			} else if (arr[i] > secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] < firstLargest) {
				secondLargest = arr[i];
			}
		}

		System.out.println(secondLargest);
	}

}
