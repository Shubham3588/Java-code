package javaCodeRevesion;

import java.util.Arrays;

public class FindMissingElementInArray {
	public static void main(String[] args) {
		int[] arr = {6,1,3,7,64};
		
	}
	
	
	
	public static void findMissingElement(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if((arr[i])+1 == arr[i+1]) {
				break;
			}else {
				arr[i]=arr[i]+1;
			}
		}
		
	}

}
