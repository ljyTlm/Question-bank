package ���ű�oj;

import java.util.Arrays;
import java.util.Scanner;

public class ������������ {

	private static Boolean[] prime;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		prime = new Boolean[10002];
		test(10002);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int sum = 0;
			for (int i = 2; i <= n/2; i++) {
				if (n%i == 0 && prime[i]) {
					System.out.print(sum == 0 ? i : " " + i);
					sum = 1;
				}
			}
			System.out.println();
		}
				
	}
	public static boolean test(int max) {//max Ϊprime���ֵ
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
