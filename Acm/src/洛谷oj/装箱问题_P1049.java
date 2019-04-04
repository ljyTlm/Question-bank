package Âå¹Èoj;

import java.util.Scanner;

public class ×°ÏäÎÊÌâ_P1049 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int[m+1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int [] dp = new int[n+1];
		for (int i = 1; i <= m; i++) {
			for (int j = n; j >= arr[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j-arr[i]]+arr[i]);
			}
		}
		System.out.println(n - dp[n]);
	}

}
