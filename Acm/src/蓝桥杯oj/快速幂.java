package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ¿ìËÙÃİ {

	private static long p;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			p = scanner.nextLong();
			long sum = pow(a,b);
			System.out.println(sum);
		}
	}

	private static long pow(long a, long b) {
		// TODO Auto-generated method stub
		long sum = 1;
		while (b > 0) {
			if (b % 2 == 1) {
				sum = (sum%p) * (a%p) % p;
			}
			a = (a%p) * (a%p) % p;
			b = b >> 1;
		}
		return sum;
	}

}
