package Âå¹Èoj;

import java.util.Scanner;

public class ¿ìËÙÃÝÄ£°å_P1226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			long b = sc.nextLong();
			long p = sc.nextLong();
			long a = b;
			long c = p;
			long k = sc.nextLong();
			long sum = 1%k;
			while (p > 0) {
				if (p % 2 == 1) {
					sum *= b;
					sum %= k;
				}
				b *= b;
				b %= k;
				p >>= 1;
			}
			System.out.println(a+"^"+c+" mod "+k+"="+sum);
		}
	}

}
