package Âå¹Èoj;

import java.util.Arrays;
import java.util.Scanner;

public class ¹ýºÓ_P1052 {

	private static int[] arr;
	private static int m;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int s = sc.nextInt();
		int t = sc.nextInt();
		m = sc.nextInt();
		arr = new int [m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}
		int [] dp = new int[15];
		Arrays.fill(dp, 999999999);
		int min = 0;
		dp[0] = 0;
		int k = 0;
		for (int i = 0; i < l + t; i++) {
			for (int j = s; j <= t; j++) {
				dp[(k+j)%15] = Math.min(dp[(k+j)%15], dp[k]);
			}
			if (i == l) {
				min = dp[k];
			}
			if (i > l) {
				min = Math.min(min, dp[k]);
			}
			dp[k] = 999999999;
			k ++;
			k %= 15;
		}
		System.out.println(min);
	}

	private static Integer isHave(int i) {
		// TODO Auto-generated method stub
		for (int j = 0; j < m; j++) {
			if (arr[j] == i) {
				return 1;
			}
		}
		return 0;
	}

}
