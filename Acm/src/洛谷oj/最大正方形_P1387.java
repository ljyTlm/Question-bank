package 洛谷oj;

import java.util.Scanner;

public class 最大正方形_P1387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][][] dp = new int[n+1][m+1][m+1];
		int [][] arr = new int[n+1][m+1];
		int max = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (arr[i][j] == 1) {
					for (int z = j; z <= m && arr[i][z] == 1; z++) {
						dp[i][j][z] = dp[i-1][j][z] + 1;
						max = Math.max(max, Math.min(dp[i][j][z], z-j+1));
					}
				}
			}
		}
		System.out.println(max);
	}

}
