package Âå¹Èoj;

import java.util.Scanner;

public class ²ÉÒ©_P1048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int m = sc.nextInt();
		int [][] arr = new int[m+1][2];
		for (int i = 1; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		int [] dp = new int[t+1];
		for (int i = 1; i <= m; i++) {
			for (int j = t; j >= arr[i][0]; j--) {
				dp[j] = Math.max(dp[j], dp[j-arr[i][0]]+arr[i][1]);
			}
		}
		System.out.println(dp[t]);
	}

}
