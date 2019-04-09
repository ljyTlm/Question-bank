package Âå¹Èoj;

import java.util.LinkedList;
import java.util.Scanner;


public class ´«Ö½Ìõ_P1006 {

	private static int n;
	private static int m;
	public static int [] pla = {0, -1, 0, -1,   0, -1, -1, 0,   -1, 0, -1, 0,   -1, 0, 0, -1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int [][] arr = new int[n+1][m+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int [][][] dp = new int[n+m+1][n+1][n+1];
		for (int i = 3; i < n+m; i++) {
			for (int j = 1; j < n; j++) {
				if (i-j >= 1 && i-j <= m) {
					for (int k = j+1; k <= n; k++) {
						if (i-k >= 1 && i-k <= m) {
							for (int p = 0; p < pla.length; p+=4) {
								int x_1 = j + pla[p];
								int y_1 = i-j + pla[p+1];
								int x_2 = k + pla[p+2];
								int y_2 = i-k + pla[p+3];
								if (x_1 != x_2) {
									dp[i][j][k] = Math.max(dp[i][j][k], dp[i-1][x_1][x_2]+arr[j][i-j]+arr[k][i-k]);  
									//System.out.println("i: "+i+"  j: "+j+"  k: "+k+"   v: "+dp[i][j][k]);
								}
							}
						}
					}
				}
			}
		}
		System.out.println(dp[n+m-1][n-1][n]);
	}
	private static boolean cheek(int x, int y) {
		// TODO Auto-generated method stub
		return x >= 0 && x <= n && y >= 0 && y <= m;
	}
}
