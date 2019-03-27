package ±±´óoj;
import java.util.Arrays;
import java.util.Scanner;

public class poj1260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int p = 0; p < t; p ++) {
			int n = sc.nextInt();
			int [] num = new int [n+1];
			int [] pic = new int [n+1];
			for (int i = 1; i <= n; i ++) {
				num[i] = sc.nextInt();
				pic[i] = sc.nextInt();
			}
			int [] dp = new int [n+1];
			Arrays.fill(dp, Integer.MAX_VALUE);
			dp[0] = 0;
			for (int i = 1; i <= n; i ++) {
				int ber = num[i];
				for (int j = i-1; j >= 0; j--) {
					dp[i] = Math.min(dp[i], dp[j] + (ber + 10) * pic[i]);
					ber += num[j];
				}
			}
			System.out.println(dp[n]);
		}
	}

}
