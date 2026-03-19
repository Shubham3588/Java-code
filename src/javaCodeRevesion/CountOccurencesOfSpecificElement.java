package javaCodeRevesion;

public class CountOccurencesOfSpecificElement {

	public static void main(String[] args) {
		int[] arr = {1,4,2,3,1,1,5};
		int el=1;
		int number = countOccurences(arr,el);
		System.out.println(number);

	}
	
	
	public static int countOccurences(int[] arr,int el) {
		int len = arr.length;
		int count=0;
		
		for(int i=0;i<len;i++) {
			if(arr[i]==el) {
				count++;
			}
		}
		return count;
	}

}
