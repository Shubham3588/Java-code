package javaCodeRevesion;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int[] arr = {2,4,11,6,8,9};
		int j=0;
	
		
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]>arr[i+1]) {
					
			System.out.println("Not Sorted");
			break;
				
					
				}
				
				else {
					System.out.println("Sorted");
					break;
				}
			}
		
		}

	}


