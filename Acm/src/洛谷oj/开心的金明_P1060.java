package 洛谷oj;

import java.util.Scanner;

public class 开心的金明_P1060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] arr = new int[m+1][2];
		for (int i = 1; i <= m; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = arr[i][0] * sc.nextInt();
		}
		long [] dp = new long[n+1];
		for (int i = 1; i <= m; i++) {
			for (int j = n; j >= arr[i][0]; j--) {
				dp[j] = Math.max(dp[j], dp[j-arr[i][0]]+arr[i][1]);
			}
		}
		System.out.println(dp[n]);
	}

}
