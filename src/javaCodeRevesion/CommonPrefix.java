package javaCodeRevesion;

public class CommonPrefix {

	public static void main(String[] args) {
		String[] arr = { "fly", "flight", "f" };
		String res = arr[0];
		for (int i = 1; i < arr.length; i++) {
			res = commonPrefix(res, arr[i]);

		}
		System.out.println("Res2" + res);

	}

	public static String commonPrefix(String s1, String s2) {
		int c1 = s1.length();
		int c2 = s2.length();
		String res = "";

		int iterateTime;

		if (c1 > c2) {
			iterateTime = c2;
		} else {
			iterateTime = c1;
		}

		for (int i = 0; i < iterateTime; i++) {
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			if (ch1 == ch2) {
				res = res + ch1;
			} else {
				break;
			}

		}
		return res;
	}

}
