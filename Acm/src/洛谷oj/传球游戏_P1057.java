package Âå¹Èoj;

import java.util.Scanner;

public class ´«ÇòÓÎÏ·_P1057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] dp = new int[m+1][n+2];
		dp[0][1] = dp[0][n+1] = 1;
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
			}
			dp[i][0] = dp[i][n];
			dp[i][n+1] = dp[i][1];
		}
		System.out.println(dp[m][1]);
	}

}
