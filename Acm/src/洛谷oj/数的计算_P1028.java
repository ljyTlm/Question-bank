package Âå¹Èoj;

import java.math.BigInteger;
import java.util.Scanner;

public class ÊýµÄ¼ÆËã_P1028 {

	private static int sum;
	private static int[] dp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			dp = new int [n+1];
			System.out.println(dfs(n));
		}
	}

	private static int dfs(int n) {
		if (dp[n] != 0) {
			return dp[n];
		}
		for (int i = 1; i <= n/2; i++) {
			dp[n] += dfs(i);
		}
		dp[n] ++;
		return dp[n];
	}
}
