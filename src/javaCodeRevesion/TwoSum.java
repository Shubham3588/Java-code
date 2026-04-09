package javaCodeRevesion;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 7, 5, 4 };
		twosum(arr, 9);

	}

	public static void twosum(int[] arr, int target) {
		if(arr.length<1) {
			System.out.println("nat valid scenario");
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.println(i + "," + j);
				}
			}
		}
	}

}
