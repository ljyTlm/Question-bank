package 洛谷oj;

import java.util.Scanner;

public class 最大子段和_P1115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long max = 0;
		long sum = 0;
		long k = -999999999;
		for (int i = 0; i < n; i++) {
			long v = sc.nextLong();
			sum += v;
			k = Math.max(k, v);
			if (sum < 0) {
				sum = 0;
			}
			max = Math.max(max, sum);
		}
		if (k < 0) {
			System.out.println(k);
		}else {
			System.out.println(max);
		}
	}

}
