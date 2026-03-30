package javaCodeRevesion;

public class FindSecondLargestElementInArray {

	public static void main(String[] args) {
		int[] arr = {8,5,6,9,1,2};
		findSecondLargest(arr);
	}
	
	public static void findSecondLargest(int[] arr) {
		int firstLargest=arr[0];
		int secondLargest = arr[1];
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			if(firstLargest<arr[i]) {
				temp=firstLargest;
				firstLargest=arr[i];
				secondLargest=temp;
				
			}else if(arr[i]<firstLargest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		
		System.out.println(secondLargest);
	}

}
