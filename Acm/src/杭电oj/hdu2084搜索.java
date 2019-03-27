package º¼µçoj;

import java.util.Scanner;

public class hdu2084ËÑË÷ {

	private static int n;
	private static int[][] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			n = scanner.nextInt();
			arr = new int [n+1][n+1];
			int [][] dp = new int [n+1][n+1];
			for (int j = 1; j < arr.length-1; j++) {
				for (int j2 = 1; j2 <= j; j2++) {
					arr[j][j2] = scanner.nextInt();
				}
			}
			for (int j = 1; j < dp.length; j++) {
				arr[n][j] = scanner.nextInt();
				dp[n][j] = arr[n][j];
			}
			for (int j = n-1; j >= 1; j--) {
				for (int j2 = 1; j2 <= j; j2++) {
					dp[j][j2] = Math.max(dp[j+1][j2], dp[j+1][j2+1]) + arr[j][j2];
				}
			}
			System.out.println(dp[1][1]);
		}
	}

}
