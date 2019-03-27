package 蓝桥杯oj;

import java.util.Scanner;

public class 开心的金明 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int [][] arr = new int [2][m];
			for (int i = 0; i < m; i++) {
				arr[0][i] = scanner.nextInt();
				arr[1][i] = scanner.nextInt();
			}
			int [] dp = new int [n+1];
			for (int i = 0; i < m; i++) {
				for (int j = n; j >= arr[0][i]; j--) {
					int v = dp[j - arr[0][i]] + arr[0][i] * arr[1][i];
					dp[j] = dp[j] > v ? dp[j] : v;
				}
			}
			System.out.println(dp[n]);
		}
	}

}
