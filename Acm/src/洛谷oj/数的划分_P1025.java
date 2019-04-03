package 洛谷oj;

import java.util.Scanner;

public class 数的划分_P1025 {

	private static int[][] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			dp = new int [n+1][k+1];
			System.out.println(dfs(n, k));
		}
	}

	private static int dfs(int n, int k) {
		// TODO Auto-generated method stub
		if (n == k || k == 1) 
			return 1;
		if (dp[n][k] != 0) 
			return dp[n][k];
		dp[n][k] = dfs(n-1, k-1); 
		if(n-k > 0 && n-k >= k) 
			dp[n][k] += dfs(n-k, k);
		return dp[n][k];
	}

}
