package Âå¹Èoj;

import java.util.Scanner;

public class Ð¡Aµã²Ë_P1164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[n+1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int [] dp = new int[m+1];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = m; j >= arr[i]; j--) {
				dp[j] = dp[j] + dp[j-arr[i]];
			}
		}
		System.out.println(dp[m]);
	}

}
