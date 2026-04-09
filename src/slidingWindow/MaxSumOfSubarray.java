package slidingWindow;

public class MaxSumOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void findSumOfMaxArray(int[] arr, int k) {
		int sum;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<k;j++) {
				sum = arr[j]+arr[j+1]+arr[j+2];
			}
		}
	}

}
