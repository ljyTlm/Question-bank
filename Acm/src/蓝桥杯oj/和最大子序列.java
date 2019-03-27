package 蓝桥杯oj;

import java.util.Scanner;

public class 和最大子序列 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			long max = Long.MIN_VALUE;
			long sum = 0;
			for (int i = 1; i <=n; i++) {
				long a = scanner.nextLong();
				if (a > max) {
					max = a;
				}
				sum += a;
				if (sum > max) {
					max = sum;
				}
				if (sum < 0) {
					sum = 0;
				}
			}
			System.out.println(max);
		}
	}

}
