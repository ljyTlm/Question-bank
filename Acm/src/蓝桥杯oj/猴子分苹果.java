package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ºï×Ó·ÖÆ»¹û {

	private static int n;
	private static int m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			n = scanner.nextInt();
			m = scanner.nextInt();
			long sum = find(0);
		}
	}

	private static long find(int i) {
		// TODO Auto-generated method stub
		if (i == n) {
			
		}
		return (find(i+1)*n)/n-1+m;
	}

}
