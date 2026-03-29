package javaCodeRevesion;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr= {4,1,9,6,5,12};
		findLargestElementInArray(arr);

	}
	
	public static void findLargestElementInArray(int[] arr) {
		int largest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(largest<arr[i]) {
				largest=arr[i];
			}
			
		}
		System.out.println(largest);
		
	}

}
