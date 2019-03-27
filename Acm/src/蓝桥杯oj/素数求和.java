package 蓝桥杯oj;

import java.util.Arrays;
import java.util.Scanner;

public class 素数求和 {

	private static boolean[] prime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		test(2000007);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			System.out.println(sum(n));
		}
				
	}
	
	private static String sum(int n) {
		// TODO Auto-generated method stub
		long sum = 0;
		for (int i = 2; i <= n; i++) {
			sum += prime[i] ? i:0;
		}
		return sum+"";
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
