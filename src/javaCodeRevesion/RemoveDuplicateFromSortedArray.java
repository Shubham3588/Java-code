package javaCodeRevesion;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void removeduplicatefromsortedarray(int[] arr) {
		int[] newArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					break;
				}else {
					newArr[i]=arr[j];
				}
			}
		}
	}

}
