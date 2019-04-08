package Âå¹Èoj;

import java.util.Scanner;

public class ³Ô³Ô³Ô_P1508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] arr = new int [n+1][m+2];
		int [][] dp = new int[n+1][m+2];
		for (int i = 1; i <= n; i++) {
			dp[i][0] = dp[i][m+1] = -99999999;
			for (int j = 1; j <= m; j++) {
				arr[i][j] = sc.nextInt();
				dp[i][j] = arr[i][j];
			}
		}
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = dp[i-1][j-1] + arr[i][j];
				dp[i][j] = Math.max(dp[i][j], dp[i-1][j]+arr[i][j]);
				dp[i][j] = Math.max(dp[i][j], dp[i-1][j+1]+arr[i][j]);
			}
		}
		int max = dp[n][m/2];
		max = Math.max(max, dp[n][m/2+1]);
		max = Math.max(max, dp[n][m/2+2]);
		System.out.println(max);
	}

}
