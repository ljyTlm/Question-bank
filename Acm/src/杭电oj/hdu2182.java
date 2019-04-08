package º¼µçoj;

import java.util.Scanner;

public class hdu2182 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();
			int [][] dp = new int[n+1][k+1];
			int [] arr = new int[n+1];
			for (int i = 1; i < dp.length; i++) {
				arr[i] = sc.nextInt();
			}
			dp[1][0] = arr[1];
			int max = arr[1];
			for (int i = 2; i < dp.length; i++) {
				for (int j = k; j > 0; j--) {
					for (int z = a; z <= b; z++) {
						if (i - z > 0) {
							dp[i][j] = Math.max(dp[i][j], dp[i-z][j-1]+arr[i]);
							max = Math.max(dp[i][j], max);
						}
					}
				}
			}
			System.out.println(max);
		}
	}

}
