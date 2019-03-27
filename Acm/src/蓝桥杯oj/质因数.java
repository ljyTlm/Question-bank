package 蓝桥杯oj;

import java.util.Arrays;
import java.util.Scanner;

public class 质因数 {

	private static boolean[] prime;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		test(70000);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int v = n;
			String sum = n+"=";
			if (prime[n]) {
				System.out.println(sum+n);
				continue;
			}
			for (int i = 2; i <= n/2; i++) {
				if (prime[i] && v % i == 0) {
					sum += i+"*";
					v /= i;
					i --;
				}
			}
			System.out.println(sum.substring(0, sum.length()-1));
		}
	}
	public static boolean test(int max) {//max 为prime最大值
		prime = new boolean [max];
		Arrays.fill(prime, true);
		for (int i = 2; i * i < max; i++) {
			if (prime[i]) {
				for (int j = i + i; j < max; j+=i) {
					prime[j] = false;
				}
			}
		}
		return prime[max-1];
	}
}
