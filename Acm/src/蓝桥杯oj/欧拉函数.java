package 蓝桥杯oj;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class 欧拉函数 {

	private static boolean[] prime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		test(2000001);
		DecimalFormat df = new DecimalFormat("0");
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int v = n;
			Map<Integer, Boolean> map = new HashMap<>();
			for (int i = 2; i <= n; i++) {
				if (prime[i] && v%i == 0) {
					map.put(i, true);
					v /= i;
					i --;
				}
			}
			Double fenmu = 1.0;
			for (Integer p : map.keySet()) {
				fenmu *= p;
			}
			Double sum = n/fenmu;
			for (Integer p : map.keySet()) {
				sum *= (p-1);
			}
			System.out.println(df.format(sum));
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
