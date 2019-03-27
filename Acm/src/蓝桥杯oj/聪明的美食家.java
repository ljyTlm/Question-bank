package 蓝桥杯oj;

import java.util.Scanner;

public class 聪明的美食家 {

	private static int[] stack;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int [] arr = new int [n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scanner.nextInt();
			}
			int [] dp = new int [n];
			dp[0] = 1;
			int sum = 1;
			for (int i = 1; i < dp.length; i++) {
				int max = 0;
				for (int j = i-1; j >= 0; j--) {
					if (arr[i] >= arr[j]) {
						max = max > dp[j] ? max : dp[j];
					}
				}
				dp[i] = max + 1;
				sum = sum > dp[i] ? sum : dp[i];
			}
			System.out.println(sum);
		}
	}

}
