package À¶ÇÅ±­oj;

import java.util.Scanner;

public class ¶á±¦Ææ±ø {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int [][] arr = new int [n+1][n+1];
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=i; j++) {
					arr[i][j] = scanner.nextInt();
				}
			}
			int [][] dp = new int [n+1][n+1];
			dp[1][1] = arr[1][1];
			int max = Integer.MIN_VALUE;
			for (int i = 2; i <=n; i++) {
				for (int j = 1; j <=i; j++) {
					int a = dp[i-1][j];
					int b = dp[i-1][j-1];
					dp[i][j] = arr[i][j] + Math.max(dp[i-1][j], dp[i-1][j-1]);
					max = dp[i][j] > max ? dp[i][j] : max;
				}
			}
			System.out.println(max);
		}
	}

}
