package javaCodeRevesion;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {4,6,2,7,8,1};
		smallestElementInArray(arr);

	}
	
	public static void smallestElementInArray(int[] arr) {
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println(smallest);
	}

}
