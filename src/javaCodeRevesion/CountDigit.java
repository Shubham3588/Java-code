package javaCodeRevesion;

public class CountDigit {

	public static void main(String[] args) {
		int num = 1234;
		countDigit(num);

	}
	
	public static void countDigit(int d) {
		
		int count =0;
		
		while(d>0) {
			d=d/10;
			count++;
		}
	
	}

}
